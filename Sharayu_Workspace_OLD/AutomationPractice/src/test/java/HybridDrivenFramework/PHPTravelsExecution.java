package HybridDrivenFramework;

import java.io.IOException;

import org.testng.annotations.Test;

public class PHPTravelsExecution {
	@Test
	public void execute() throws IOException, InterruptedException {
		for (int i = 1; i <= 18; i++) {
			String key = PHPTravelsExcel.Keywords(i, 0);

			if (key.equals("openbrowser")) {
				PHPTravelsAction.openbrowser();
			}

			else if (key.equals("navigate")) {
				PHPTravelsAction.navigate();
			}

			else if (key.equals("enterfirstname")) {
				PHPTravelsAction.enterfirstname();
			}

			else if (key.equals("enterlastname")) {
				PHPTravelsAction.enterlastname();
			}

			else if (key.equals("enteremail")) {
				PHPTravelsAction.enteremail();
			}

			else if (key.equals("selectphone")) {
				PHPTravelsAction.selectphone();
			}

			else if (key.equals("enterphone")) {
				PHPTravelsAction.enterphone();
			}

			else if (key.equals("enterstreet")) {
				PHPTravelsAction.enterstreet();
			}

			else if (key.equals("entercity")) {
				PHPTravelsAction.entercity();
			}

			else if (key.equals("enterstate")) {
				PHPTravelsAction.enterstate();
			}

			else if (key.equals("enterpincode")) {
				PHPTravelsAction.enterpincode();
			}

			else if (key.equals("selectcountry")) {
				PHPTravelsAction.selectcountry();
			}

			else if (key.equals("selectfindus")) {
				PHPTravelsAction.selectfindus();
			}

			else if (key.equals("entermobile")) {
				PHPTravelsAction.entermobile();
			}

			else if (key.equals("clickgeneratepassword")) {
				PHPTravelsAction.clickgeneratepassword();
			}

			else if (key.equals("enterpasswordlen")) {
				PHPTravelsAction.enterpasswordlen();
			}

			else if (key.equals("clickonrobot")) {
				PHPTravelsAction.clickonrobot();
				;
			} else if (key.equals("clickonsubmit")) {
				PHPTravelsAction.clickonsubmit();
			}

		}
	}

}
