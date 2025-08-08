package iostreams;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class WriteDataToNotepadFile {

	public static void main(String[] args) throws Exception {
		File inputFile = new File(
				"C:\\JavaProjects\\CoreJava_July2025\\Eclipse\\CoreJava_July2025\\Files\\InputFile.txt");
		FileInputStream fis = new FileInputStream(inputFile);
		System.out.println(fis.available());
		byte[] byteArr = new byte[fis.available()];
		fis.read(byteArr);
		String str = new String(byteArr);
		System.out.println(str);
		str = str.replaceAll("[^Java]", "");
		fis.close();
		System.out.println(str);

		File outputFile = new File(
				"C:\\JavaProjects\\CoreJava_July2025\\Eclipse\\CoreJava_July2025\\Files\\OutFile.txt");
		FileOutputStream fos = new FileOutputStream(outputFile);
		byte[] outputByteArr = str.getBytes();
		fos.write(outputByteArr);
		fos.flush();
		fos.close();
	}

}
