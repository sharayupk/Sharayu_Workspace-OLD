package KeywordDrivenFramework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class PTEPracticeExcel 
{
public static String getExcel(int rownum,int cellnum) throws IOException
{
	File src=new File("D:\\Excel Sheet\\ptepracticeKD.xlsx");
	FileInputStream fis=new FileInputStream(src);
	XSSFWorkbook wb=new XSSFWorkbook(fis);
	XSSFSheet sh=wb.getSheetAt(0);
	System.out.println(sh.getLastRowNum());

	for(int i=1;i<=sh.getLastRowNum();i++)
	{
		String data=sh.getRow(rownum).getCell(cellnum).getStringCellValue();
		return data;
	}
	return null;
	
}
}
