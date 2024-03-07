package DataDrivenFramework;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

    static XSSFWorkbook wb;
	static XSSFSheet sh;
	
	public ReadExcel(String excelPath,String sheetName) throws Exception
	{
		wb=new XSSFWorkbook(excelPath);
		sh=wb.getSheet(sheetName);
	}

	public static void main(String[] args) throws IOException {
		
		getRowCount();
		getCellString(0,0);
		getCellNumber(1,1);
	}

	public static void getRowCount() throws IOException
	{
		
		System.out.println("No. Of Rows---->"+sh.getPhysicalNumberOfRows());
	}

	public static void getCellString(int rowNum,int cellNum) throws IOException
	{
		
		System.out.println(sh.getRow(rowNum).getCell(cellNum).getStringCellValue());
	}

	public static void getCellNumber(int rowNum,int cellNum) throws IOException
	{
		
		System.out.println(sh.getRow(rowNum).getCell(cellNum).getNumericCellValue());
	}


}
