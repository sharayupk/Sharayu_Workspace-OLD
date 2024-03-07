package KeywordDrivenFramework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DemoRegisterExcel {

	public static String getExcel(int rownum, int colnum) throws IOException {
		FileInputStream fis = new FileInputStream(".//Excel Sheet//demoregisterKD.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh = wb.getSheetAt(0);
		System.out.println("Last Row--->" + sh.getLastRowNum());

		for (int i = 1; i <= sh.getLastRowNum(); i++) {
			String data = sh.getRow(rownum).getCell(colnum).getStringCellValue();
			return data;
		}
		return null;
	}

}
