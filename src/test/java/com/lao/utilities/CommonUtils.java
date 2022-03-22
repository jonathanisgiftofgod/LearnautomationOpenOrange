package com.lao.utilities;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import com.lao.constants.Constants;

public class CommonUtils {
	public static void loadProperties() throws IOException {
		FileReader reader=null;
		try {
			reader = new FileReader("config.properties");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		Properties properties = new Properties();
		try {
			properties.load(reader);
		} catch (Exception e) {
			e.printStackTrace();
		}
		Constants.APP_URL=properties.getProperty("APP_URL");
		Constants.BROWSER=properties.getProperty("BROWSER");
		Constants.USERNAME=properties.getProperty("UserName");
		Constants.PASSWORD=properties.getProperty("Password");
		Constants.CHROME_DRIVER_LOCATION=properties.getProperty("CHROME_DRIVER_LOCATION");
		Constants.FIRE_DRIVER_LOCATION=properties.getProperty("FIREFOX_DRIVER_LOCATION");
		Constants.EDGE_DRIVER_LOCATION=properties.getProperty("EDGE_DRIVER_LOCATION");
	}
}
