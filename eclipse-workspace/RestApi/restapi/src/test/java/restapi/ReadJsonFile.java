package restapi;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

import com.jayway.jsonpath.JsonPath;

public class ReadJsonFile {
	public static void main(String[] args) throws IOException {
		String filePath = System.getProperty("user.dir") + File.separator+"resources"+File.separator+"testData"+File.separator+"Test.json";
		String fileReadytoRead =  readfileReturnString(filePath);
		System.out.println(JsonPath.read(fileReadytoRead, "$.[10].username"));
		System.out.println(JsonPath.read(fileReadytoRead, "$.[10].email"));
	}

	public static String readfileReturnString(String filePath) throws IOException {
		
		byte[] encoded = Files.readAllBytes(Paths.get(filePath));
		return new String(encoded,StandardCharsets.UTF_8);
		
		
	}
	
	
}
