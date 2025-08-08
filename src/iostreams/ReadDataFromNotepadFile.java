package iostreams;

import java.io.File;
import java.io.FileInputStream;

public class ReadDataFromNotepadFile {

	public static void main(String[] args) throws Exception {

		File file = new File("C:\\JavaProjects\\CoreJava_July2025\\Eclipse\\CoreJava_July2025\\Files\\InputFile.txt");
		FileInputStream fis = new FileInputStream(file);
		System.out.println(fis.available());
		byte[] byteArr = new byte[fis.available()];
		fis.read(byteArr);
		String str = new String(byteArr);
		System.out.println(str);
		str = str.replaceAll("[^Java]", "");
		System.out.println(str);
		fis.close();

	}

}
