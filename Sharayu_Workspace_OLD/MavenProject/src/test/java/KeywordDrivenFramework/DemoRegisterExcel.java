package KeywordDrivenFramework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DemoRegisterExcel 
{
	public static String getExcel(int rownum,int cellnum) throws IOException
	{
		File src=new File(".\\Excel Sheet\\demoregisterKD.xlsx");
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
}
