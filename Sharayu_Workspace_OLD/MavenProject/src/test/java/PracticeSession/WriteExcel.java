package PracticeSession;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcel 
{
	public void getExcel()throws IOException
	{
		File src=new File(".\\Excel Sheet\\writeexcelsheet.xlsx");
		FileOutputStream fout=new FileOutputStream(src);
		XSSFWorkbook wb=new XSSFWorkbook();
		XSSFSheet sh=wb.getSheetAt(0);
		
		for(int r=0;r<=5;r++)
		{
			XSSFRow row=sh.createRow(r);
			
			for(int c=0;c<=3;c++)
			{
				row.createCell(c).setCellValue("Welcome");
			}
		}
		
		wb.write(fout);
		System.out.println("Completed...!");
		
	}
}
