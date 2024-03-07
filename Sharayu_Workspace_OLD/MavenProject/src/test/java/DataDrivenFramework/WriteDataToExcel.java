package DataDrivenFramework;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class WriteDataToExcel 
{
	@Test
	public void setExcel() throws IOException
	{
         FileOutputStream fout=new FileOutputStream("D:\\Excel Sheet\\writedata.xlsx");
         XSSFWorkbook wb=new XSSFWorkbook();
         XSSFSheet sh=wb.getSheet("Data");
         
         for(int i=0;i<=5;i++)
         {
        	 XSSFRow row=sh.createRow(i);
        	 
        	 for(int j=0;j<5;j++)
        	 {
        		 row.createCell(j).setCellValue("Selenium");
        	 }
         }
         
         wb.write(fout);
         fout.close();
         System.out.println("Writting Data To Excel is Completed");
	}
}
