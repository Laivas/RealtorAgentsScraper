package scrapperUtil;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

import scrapperModel.RealtorAgentData;

public class ObjectToJsonWriter {
	
	public void writeRealtorAgentDataJsonFile(RealtorAgentData toJson, java.nio.file.Path path) {
		
		ObjectWriter objectWriter = new ObjectMapper().writer().withDefaultPrettyPrinter();
		
		try {
			String json = objectWriter.writeValueAsString(toJson);
						
			BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(new File(path.toString()), true));
			
			bufferedWriter.write(json);
			
			bufferedWriter.flush();
			
			bufferedWriter.close();
			
//			Gson gson = new GsonBuilder().disableHtmlEscaping().create();
//			
//			gson.toJson(toJson, new FileWriter(path.toString()));
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
