package HybridDrivenFramework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class PHPTravelsExcel {

	public static FileInputStream fis;
	public static XSSFWorkbook wb;
	public static XSSFSheet sh;

	public static String Keywords(int rownum, int colnum) throws IOException {
		fis = new FileInputStream(".//Excel Sheet//phptravelsHD.xlsx");
		wb = new XSSFWorkbook(fis);
		sh = wb.getSheetAt(0);

		System.out.println("Last Row No---->" + sh.getLastRowNum());
		for (int i = 1; i <= sh.getLastRowNum(); i++) {
			String data1 = sh.getRow(rownum).getCell(colnum).getStringCellValue();
			return data1;
		}
		return null;

	}

	public static String InputData(int rowno, int colno) throws IOException {
		fis = new FileInputStream(".//Excel Sheet//phptravelsHD.xlsx");
		wb = new XSSFWorkbook(fis);
		sh = wb.getSheetAt(0);

		System.out.println("Last Row No---->" + sh.getLastRowNum());
		for (int i = 1; i <= sh.getLastRowNum(); i++) {
			String data1 = sh.getRow(rowno).getCell(colno).getStringCellValue();
			return data1;
		}
		return null;

	}

}
