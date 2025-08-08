package iostreams;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadDataFromPropertiesFile {

	public static void main(String[] args) throws Exception {
		File file = new File(
				"C:\\JavaProjects\\CoreJava_July2025\\Eclipse\\CoreJava_July2025\\Files\\InputProperties.properties");
		FileInputStream fis = new FileInputStream(file);
		Properties properties = new Properties();
		properties.load(fis);
		System.out.println(properties.getProperty("first.name"));
		System.out.println(properties.getProperty("last.name"));
		System.out.println(properties.getProperty("qualification"));
		System.out.println(properties.getProperty("location"));
		System.out.println(properties.getProperty("height"));
		fis.close();
	}

}
