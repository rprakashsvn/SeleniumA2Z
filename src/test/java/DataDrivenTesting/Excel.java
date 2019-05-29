package DataDrivenTesting;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel {

	public static String getCellValue(String xl, String Sheet, int row, int cols) {
		try {
			FileInputStream fis = new FileInputStream(xl);
			Workbook wb = WorkbookFactory.create(fis);
			Cell cell = wb.getSheet(Sheet).getRow(row).getCell(cols);
			return cell.getStringCellValue();
		} catch (Exception e) {
			return "";
		}
	}

	public static int getRowCount(String xl, String Sheet) {
		try {
			FileInputStream fis = new FileInputStream(xl);
			Workbook wb = WorkbookFactory.create(fis);
			return wb.getSheet(Sheet).getLastRowNum();
		} catch (Exception e) {
			return 0;
		}
	}
}