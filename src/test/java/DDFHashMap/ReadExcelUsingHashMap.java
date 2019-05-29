package DDFHashMap;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ReadExcelUsingHashMap {

	@Test(dataProvider = "data")
	public void integrationTest(Map<Object, Object> map) {
		System.out.println("-------------Test case started --------------");
		System.out.println(map.get("UserName"));
		System.out.println(map.get("Password"));
		System.out.println(map.get("DoB"));
		System.out.println("-------------Test case Ended ----------------");
	}

	@DataProvider(name = "data")
	public Object[][] dataSupplier() throws IOException {

		// Upload Excel File
		File file = new File("./TestData\\TestData.xlsx");
		FileInputStream fis = new FileInputStream(file);

		// Create a object for excel and load file
		XSSFWorkbook workBook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workBook.getSheetAt(0);

		// Closed the Excel
		workBook.close();

		// Get Last Row / Cell Values
		int lastRowNum = sheet.getLastRowNum();
		System.out.println("Last Row Number : " + lastRowNum);
		int lastCellNum = sheet.getRow(0).getLastCellNum();
		System.out.println("Last Cell Number : " + lastCellNum);

		// Create A Two Dimensional Array
		Object[][] obj = new Object[lastRowNum][1];

		for (int i = 0; i < lastRowNum; i++) {
			Map<Object, Object> dataMap = new HashMap<>();
			for (int j = 0; j < lastCellNum; j++) {
				dataMap.put(sheet.getRow(0).getCell(j).toString(), sheet.getRow(i + 1).getCell(j).toString());
			}
			obj[i][0] = dataMap;
		}
		return obj;
	}
}
