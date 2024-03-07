package DataDrivenFramework;

public class ReadExcelUtils {
	
	public static void main(String[] args) throws Exception 
	{
		
	  String projectPath=System.getProperty("user.dir");
	  ReadExcel excel=new ReadExcel(projectPath+"\\Excel Sheet\\readexcel.xlsx","Sheet1");
	  
	  excel.getRowCount();
	  excel.getCellString(0,0);
	  excel.getCellNumber(1,1);
	
	}
}
