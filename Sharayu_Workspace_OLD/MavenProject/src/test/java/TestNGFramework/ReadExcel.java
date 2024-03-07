package TestNGFramework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExcel 
{
	@Test
	public void getExcel() throws IOException
	{
		FileInputStream fis=new FileInputStream("D:\\Sharayu_Workspace\\MavenProject\\Excel Sheet\\readexcel.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sh=wb.getSheetAt(0);
		
		int rowCount=sh.getLastRowNum();
		System.out.println("Total No. Of Rows---->"+rowCount);
		
		int cellCount=sh.getRow(0).getLastCellNum();
		System.out.println("Total No. Of Columns---->"+cellCount);
		
		for(int r=0;r<=rowCount;r++)
		{
			XSSFRow row=sh.getRow(r);
			
			for(int c=0;c<cellCount;c++)
			{
				XSSFCell cell=row.getCell(c);
				String data=cell.toString();
				System.out.print(data+"|"+"   ");
			}
			System.out.println();
		}
		

		}
}
