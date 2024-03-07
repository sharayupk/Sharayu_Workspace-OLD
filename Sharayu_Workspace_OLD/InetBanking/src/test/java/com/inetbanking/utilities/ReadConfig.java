package com.inetbanking.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {
	Properties prop;

	public ReadConfig() {
		

		FileInputStream fis;
		try {
			fis = new FileInputStream("./Configuration/config.properties");
			prop = new Properties();
			prop.load(fis);
		} 
		catch (FileNotFoundException e) 
		{
			System.out.println(e.getMessage());
		} 
		catch (IOException e) 
		{
            System.out.println(e.getMessage());
        }

	}

	public String getApplicationURL() {
		String url = prop.getProperty("baseURL");
		return url;
	}

	public String getuserName() {
		String username = prop.getProperty("username");
		return username;
	}

	public String getPassword() {
		String password = prop.getProperty("password");
		return password;
	}

	public String getchromepath() {
		String chromepath = prop.getProperty("chromepath");
		return chromepath;
	}

	public String getfirefoxpath() {
		String firefoxpath = prop.getProperty("firefoxpath");
		return firefoxpath;
	}

}
