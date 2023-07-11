package scrapperGui;

import lombok.*;
import scrapperGuiHandlers.RealtorAgentsMainPaneHandler;
import de.gsi.chart.ui.BorderedTitledPane;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import scrapperUtil.Workable;

@Setter
@Getter
public class RealtorAgentsMainPane extends BorderPane implements Workable {
	
	private BorderPane borderPane;
	
	private GridPane gridPane;
	
	private BorderedTitledPane borderedTitledPane;
	
	private RealtorAgentsMainPaneHandler realtorAgentsMainPaneHandler;
	
	private HBox hBox;
	
	private Button startButton;
	
	private Button stopButton;
	
	private Button pauseResumeButton;
	
	private Label label;
	
	private TextField searchCityField;
	
	private TextField searchStateField;
	
	private TextField progressField;
	
	public RealtorAgentsMainPane() {
		
		borderPane = new BorderPane();
		
		realtorAgentsMainPaneHandler = new RealtorAgentsMainPaneHandler(this);
		
		borderPane.setTop(searchFields());
		
		borderPane.setCenter(progressFields());
		
		setTop(borderPane);
		
		setBottom(buttonPane());
		
		setHandler();
		
	}
	
	private void setHandler() {
		
		startButton.setOnAction(realtorAgentsMainPaneHandler);
		
		stopButton.setOnAction(realtorAgentsMainPaneHandler);
		
		pauseResumeButton.setOnAction(realtorAgentsMainPaneHandler);
		
	}
	
	public BorderedTitledPane searchFields() {
		
		gridPane = new GridPane();
		
		gridPane.setPadding(new Insets(15, 12, 15, 12));
		
		gridPane.setVgap(5); 
		
	    gridPane.setHgap(5); 
	    
	    
		label = new Label("City:");
		
		searchCityField = new TextField();
		
		
		gridPane.add(label, 1, 1);
		gridPane.add(searchCityField, 2, 1);
		
		
		label = new Label("State:");
		
		searchStateField = new TextField();
		
		
		gridPane.add(label, 1, 2);
		gridPane.add(searchStateField, 2, 2);
		
		
		
		borderedTitledPane = new BorderedTitledPane("Search Query:", gridPane);
		
		return borderedTitledPane;
		
	}
	
	public BorderedTitledPane progressFields() {
		
		gridPane = new GridPane();
		
		gridPane.setPadding(new Insets(15, 12, 15, 12));
		
		gridPane.setVgap(5); 
		
	    gridPane.setHgap(5); 
	    
	    
		label = new Label("Progress:");
		
		progressField = new TextField();
		
		progressField.setDisable(true);
		
		progressField.setPrefWidth(250);
		
		progressField.setStyle("-fx-opacity: 1.0;");
		
		
		gridPane.add(label, 1, 1);
		gridPane.add(progressField, 2, 1);
		
		
		
		borderedTitledPane = new BorderedTitledPane("Progress:", gridPane);
		
		return borderedTitledPane;
		
	}
	
	public HBox buttonPane() {
		
		hBox = new HBox();
		
		hBox.setPadding(new Insets(10, 10, 10, 10));
		
		hBox.setSpacing(10);
		
		startButton = new Button("Start");
		
		startButton.getStyleClass().addAll("btn","btn-success");
		
		hBox.getChildren().add(startButton);
		
		pauseResumeButton = new Button("Pause");
		
		pauseResumeButton.getStyleClass().addAll("btn","btn-info");
		
		hBox.getChildren().add(pauseResumeButton);
		
		stopButton = new Button("Stop");
		
		stopButton.getStyleClass().addAll("btn","btn-danger");
		
		hBox.getChildren().add(stopButton);
		
		hBox.setAlignment(Pos.CENTER_RIGHT);
		
		return hBox;
		
	}

	@Override
	public Workable getWorkable() {
		// TODO Auto-generated method stub
		return this;
	}

	@Override
	public String getWorkableClassName() {
		// TODO Auto-generated method stub
		return this.getClass().getName();
	}

}
