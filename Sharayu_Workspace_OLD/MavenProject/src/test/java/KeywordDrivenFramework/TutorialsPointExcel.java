package KeywordDrivenFramework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TutorialsPointExcel 
{
public static String keyword(int rownum,int cellnum) throws IOException
{
	FileInputStream fis=new FileInputStream("D:\\Sharayu_Workspace\\MavenProject\\Excel Sheet\\tutorialspointKD.xlsx");
	XSSFWorkbook wb=new XSSFWorkbook(fis);
	XSSFSheet sh=wb.getSheetAt(0);
	//System.out.println("Total No. Of Rows----->"+sh.getLastRowNum());
	
	String data=sh.getRow(rownum).getCell(cellnum).getStringCellValue();
	return data;
		
	}
}

