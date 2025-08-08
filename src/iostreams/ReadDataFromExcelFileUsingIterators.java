package iostreams;

import java.io.File;
import java.io.FileInputStream;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import jxl.CellType;

public class ReadDataFromExcelFileUsingIterators {

	public static void main(String[] args) throws Exception {
		File file = new File(System.getProperty("user.dir") + "\\Files\\InputExcel.xlsx");
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet languagesSheet = workbook.getSheet("Languages");
		Iterator<Row> allRows = languagesSheet.rowIterator();
		while (allRows.hasNext()) {
			Row eachRow = allRows.next();
			Iterator<Cell> allCells = eachRow.cellIterator();
			while (allCells.hasNext()) {
				Cell eachCell = allCells.next();
				switch (eachCell.getCellType()) {
					case Cell.CELL_TYPE_STRING:
						String strData = eachCell.getStringCellValue();
						System.out.print(strData + "       ");
						break;
					case Cell.CELL_TYPE_NUMERIC:
						double numberData = eachCell.getNumericCellValue();
						System.out.print(numberData + "      ");
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
