package iostreams;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class WriteDataToPropertiesFile {

	public static void main(String[] args) throws Exception {

		System.out.println(System.getProperty("user.dir"));

		File file = new File(System.getProperty("user.dir") + "\\Files\\InputProperties.properties");
		FileInputStream fis = new FileInputStream(file);
		Properties properties = new Properties();
		properties.load(fis);
		System.out.println(properties.getProperty("first.name"));
		System.out.println(properties.getProperty("last.name"));
		System.out.println(properties.getProperty("qualification"));
		System.out.println(properties.getProperty("location"));
		System.out.println(properties.getProperty("height"));
		properties.setProperty("height", "6");
		System.out.println(properties.getProperty("height"));
		FileOutputStream fos = new FileOutputStream(file);
		properties.store(fos, "Updated By Raju");
		fos.close();
		fis.close();

	}

}
