package HybridDrivenFramework;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TutorialsPointExcel 
{
	public static String Keywords(int rownum,int cellnum) throws IOException
	{
		FileInputStream fis=new FileInputStream("D:\\Sharayu_Workspace\\MavenProject\\Excel Sheet\\tutorialspointHD.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sh=wb.getSheetAt(0);
		
		String data=sh.getRow(rownum).getCell(cellnum).getStringCellValue();
		return data;
			
	}
	
	public static String InputData(int rowno,int cellno) throws IOException
	{
		FileInputStream fis=new FileInputStream("D:\\Sharayu_Workspace\\MavenProject\\Excel Sheet\\tutorialspointHD.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sh=wb.getSheetAt(0);
		
		String data1=sh.getRow(rowno).getCell(cellno).getStringCellValue();
		return data1;
			
	}
}

