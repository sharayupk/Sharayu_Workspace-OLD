package HybridDrivenFramework;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DemoRegisterExcel 
{
	public static String Keywords(int rownum,int cellnum) throws IOException
	{
		File src=new File(".\\Excel Sheet\\demoregisterHD.xlsx");
		FileInputStream fis=new FileInputStream(src);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sh=wb.getSheetAt(0);

		for(int i=1;i<=sh.getLastRowNum();i++)
		{
			String data=sh.getRow(rownum).getCell(cellnum).getStringCellValue();
			return data;
		}
		return null;
	}
	
	public static String InputData(int rowno,int cellno) throws IOException
	{
		File src=new File(".\\Excel Sheet\\demoregisterHD.xlsx");
		FileInputStream fis=new FileInputStream(src);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sh=wb.getSheetAt(0);

		for(int i=1;i<=sh.getLastRowNum();i++)
		{
			String data1=sh.getRow(rowno).getCell(cellno).getStringCellValue();
			return data1;
		}
		return null;
	}
}
