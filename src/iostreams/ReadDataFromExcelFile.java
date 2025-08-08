package iostreams;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import jxl.CellType;

public class ReadDataFromExcelFile {

	public static void main(String[] args) throws Exception {
		File file = new File(System.getProperty("user.dir") + "\\Files\\InputExcel.xlsx");
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet languagesSheet = workbook.getSheet("Languages");

		int allRowsCount = languagesSheet.getLastRowNum();

		for (int i = 0; i < allRowsCount; i++) {
			Row eachRow = languagesSheet.getRow(i);
			int columnCount = eachRow.getLastCellNum();
			for (int j = 0; j < columnCount; j++) {
				Cell eachCell = eachRow.getCell(j);
				switch (eachCell.getCellType()) {
				case Cell.CELL_TYPE_STRING:
					String strData = eachCell.getStringCellValue();
					System.out.print(strData+"       ");
					break;
				case Cell.CELL_TYPE_NUMERIC:
					double numberData = eachCell.getNumericCellValue();
					System.out.print(numberData+"      ");
					break;

				case Cell.CELL_TYPE_BLANK:
					break;
				default:
					break;
				}
			}
			System.out.println("");
		}
		fis.close();
	}

}
