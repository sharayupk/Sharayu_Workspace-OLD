package AutomationPractice;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.annotations.Test;

public class CurrentDateNTime 
{
	@Test
	public void dateNTime() throws InterruptedException, IOException
	{   
		//Create Object of SimpleDateFormat
		DateFormat dateformat=new SimpleDateFormat("dd/mm/yyyy HH:mm:ss");

		//Create Object of Date
		Date date=new Date();

		String date1=dateformat.format(date);
		System.out.println("Current date And Time---->"+date1);
	}

}
