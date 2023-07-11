package scrapperGuiHandlers;

import java.io.File;
import java.nio.file.Paths;
import java.util.Timer;
import java.util.TimerTask;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import scrapper.RealtorScrapper;
import scrapperDatabase.SqliteDatabaseConnection;
import scrapperGui.RealtorAgentsMainPane;
import scrapperModel.DataPaneSelection;
import scrapperModel.SettingsPaneSelection;
import scrapperUtil.CsvReaderWriter;
import scrapperUtil.FileNameGenerator;
import scrapperUtil.XmlReaderWriter;

public class RealtorAgentsMainPaneHandler implements EventHandler<ActionEvent> {

	private RealtorAgentsMainPane realtorAgentsMainPane;

	private RealtorScrapper realtorScrapper;

	private Thread thread;

	private XmlReaderWriter xmlReaderWriter;

	public RealtorAgentsMainPaneHandler(RealtorAgentsMainPane realtorAgentsMainPane) {

		this.realtorAgentsMainPane = realtorAgentsMainPane;

	}

	@Override
	public void handle(ActionEvent event) {
		// TODO Auto-generated method stub

		if (event.getSource() == realtorAgentsMainPane.getStartButton()) {

			if (realtorScrapper != null) {

				if (realtorScrapper.isRunning()) {

					realtorScrapper.setRunning(false);

				}

			}

			if (realtorScrapper == null) {

				realtorScrapper = new RealtorScrapper();

			}

			thread = new Thread(new Runnable() {

				@Override
				public void run() {
					// TODO Auto-generated method stub

					if (realtorScrapper != null) {

						if (realtorScrapper.isRunning() == false) {

							getSelectedSaveDataPath();

							String city = realtorAgentsMainPane.getSearchCityField().getText();

							String state = realtorAgentsMainPane.getSearchStateField().getText();

							xmlReaderWriter = new XmlReaderWriter();

							SettingsPaneSelection settingsPaneSelection = xmlReaderWriter.fromXml(new SettingsPaneSelection(),
									"settingsPaneSelection.xml");

							if (settingsPaneSelection != null) {

								realtorScrapper.setDelayInMs(Integer.valueOf(settingsPaneSelection.getRequestDelay()));

								if (settingsPaneSelection.isUseProxy()) {

									realtorScrapper.setNumberOfThreads(
											Integer.valueOf(settingsPaneSelection.getNumberOfThreads()));
									
									CsvReaderWriter CsvReaderWriter = new CsvReaderWriter();
									
									realtorScrapper.setProxies(CsvReaderWriter.readFromCsvByLine(Paths.get(settingsPaneSelection.getLoadProxyFromCsv())));

								}

							}

							if (settingsPaneSelection == null) {

								realtorScrapper.setDelayInMs(1000);

							}

							realtorScrapper.query(city, state);

							updateProgress(realtorScrapper);

							realtorScrapper.start();

						}

					}

				}

			});

			thread.start();

		}

		if (event.getSource() == realtorAgentsMainPane.getStopButton()) {

			if (realtorScrapper != null) {

				if (realtorScrapper.isRunning()) {

					realtorScrapper.stop();

				}

			}

		}

		if (event.getSource() == realtorAgentsMainPane.getPauseResumeButton()) {

			Thread thread = new Thread(new Runnable() {

				@Override
				public void run() {
					// TODO Auto-generated method stub

					if (realtorScrapper != null) {

						if (realtorScrapper.isRunning()) {

							if (realtorAgentsMainPane.getPauseResumeButton().getText().equals("Pause")) {

								Platform.runLater(new Runnable() {

									@Override
									public void run() {
										// TODO Auto-generated method stub
										realtorAgentsMainPane.getPauseResumeButton().setText("Resume");

									}

								});
								
								realtorScrapper.pause();

							}

							if (realtorAgentsMainPane.getPauseResumeButton().getText().equals("Resume")) {

								Platform.runLater(new Runnable() {

									@Override
									public void run() {
										// TODO Auto-generated method stub
										realtorAgentsMainPane.getPauseResumeButton().setText("Pause");

									}

								});

								realtorScrapper.resume();

							}

						}

					}

				}

			});

			thread.start();
		}

	}

	public void getSelectedSaveDataPath() {

		XmlReaderWriter xmlReaderWriter = new XmlReaderWriter();

		DataPaneSelection dataPaneSelection = new DataPaneSelection();

		dataPaneSelection = xmlReaderWriter.fromXml(dataPaneSelection, "dataPaneSelection.xml");

		if (dataPaneSelection.isSaveCsv()) {

			if (dataPaneSelection.isGenerateCsvFileName()) {

				FileNameGenerator fileNameGenerator = new FileNameGenerator();

				realtorScrapper.setWriteToPath(Paths.get(dataPaneSelection.getCsvFolderDir() + File.separator
						+ fileNameGenerator.generateDateFileName() + ".csv"));

			}

			if (dataPaneSelection.isGenerateCsvFileName() == false && dataPaneSelection.getCsvFileName() != null
					&& !dataPaneSelection.getCsvFileName().isEmpty()) {

				realtorScrapper.setWriteToPath(Paths.get(dataPaneSelection.getCsvFolderDir() + File.separator
						+ dataPaneSelection.getCsvFileName() + ".csv"));

			}
		}

		if (dataPaneSelection.isSaveSqliteDb()) {

			if (dataPaneSelection.isGenerateSqliteDbFileName()) {

				FileNameGenerator fileNameGenerator = new FileNameGenerator();

				SqliteDatabaseConnection sqliteDatabaseConnection = new SqliteDatabaseConnection(
						dataPaneSelection.getSqliteFolderDir() + File.separator,
						fileNameGenerator.generateDateFileName() + ".db");

				realtorScrapper.setSqliteDatabaseConnection(sqliteDatabaseConnection);

			}

			if (dataPaneSelection.isGenerateSqliteDbFileName() == false
					&& dataPaneSelection.getSqliteDbFileName() != null
					&& !dataPaneSelection.getSqliteDbFileName().isEmpty()) {

				SqliteDatabaseConnection sqliteDatabaseConnection = new SqliteDatabaseConnection(
						dataPaneSelection.getSqliteFolderDir() + File.separator,
						dataPaneSelection.getSqliteDbFileName() + ".db");

				realtorScrapper.setSqliteDatabaseConnection(sqliteDatabaseConnection);

			}

		}
		if (dataPaneSelection.isSaveSqliteDb() == false && dataPaneSelection.isSaveCsv() == false) {

			FileNameGenerator fileNameGenerator = new FileNameGenerator();

			realtorScrapper.setWriteToPath(Paths.get(System.getProperty("user.home") + File.separator
					+ fileNameGenerator.generateDateFileName() + ".csv"));

		}

	}

	public void updateProgress(RealtorScrapper realtorScrapper) {

		Timer timer = new Timer();

		timer.schedule(new TimerTask() {

			int agentsWritten = 0;

			@Override
			public void run() {
				// TODO Auto-generated method stub

				if (realtorScrapper.isRunning() == true) {

					agentsWritten = realtorScrapper.getAgentsWritten();

					realtorAgentsMainPane.getProgressField().setText("Agents written: " + agentsWritten);

				}

				if (realtorScrapper.isRunning() == false) {

					agentsWritten = realtorScrapper.getAgentsWritten();

					realtorAgentsMainPane.getProgressField().setText("Agents written: " + agentsWritten);

					timer.cancel();

				}

			}

		}, 0, 500);

	}

}
