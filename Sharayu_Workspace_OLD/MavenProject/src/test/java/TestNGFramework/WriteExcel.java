package TestNGFramework;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class WriteExcel 
{
	@Test
	public void setExcel() throws IOException
	{
		FileOutputStream fout=new FileOutputStream("D:\\Sharayu_Workspace\\MavenProject\\Excel Sheet\\writeexcel.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook();
		XSSFSheet sh=wb.createSheet("Sheet1");
		
		for(int r=0;r<=5;r++)
		{
			XSSFRow row=sh.createRow(r);
			
			for(int c=0;c<3;c++)
			{
				XSSFCell cell=row.createCell(c);
				cell.setCellValue("Welcome");
				
			}
			
		}
		wb.write(fout);
		System.out.println("Test Completed Successfully");
	}

}
