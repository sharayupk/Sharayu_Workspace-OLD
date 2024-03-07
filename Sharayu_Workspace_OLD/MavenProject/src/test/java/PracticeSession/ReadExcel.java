package PracticeSession;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel 
{
	public void getExcel()throws IOException
	{
		File src=new File(".\\Excel Sheet\\moneycontrolDD.xlsx");
		FileInputStream fis=new FileInputStream(src);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sh=wb.getSheetAt(0);

		System.out.println("Last Row --->"+sh.getLastRowNum());

		int cellCount=sh.getRow(0).getPhysicalNumberOfCells();
		System.out.println("Total No. Of cells--->"+cellCount);
		for(int r=0;r<=sh.getLastRowNum();r++)
		{
			XSSFRow row=sh.getRow(r);

			for(int c=0;c<=cellCount;c++) {
				XSSFCell cell=row.getCell(c);
				String data=cell.toString();
				System.out.println(data +"|");
			}
		}






	}
}
