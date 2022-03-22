package com.lao.step_definition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.lao.constants.Constants;
import com.lao.utilities.CommonUtils;

import io.cucumber.java.Before;

public class Common_Step_Definition {
	
	public static WebDriver driver;
	@Before
	public void beforeScenario() {
		try {
			CommonUtils.loadProperties();
			if(driver==null) {
			launchBrowser();
			} 
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void launchBrowser() {
		try {
			switch (Constants.BROWSER) {
			case "chrome":
				System.setProperty(Constants.CHROME_DRIVER, Constants.CHROME_DRIVER_LOCATION);
				driver = new ChromeDriver();
				break;
			case "firefox":
				System.setProperty(Constants.FIREFOX_DRIVER, Constants.FIRE_DRIVER_LOCATION);
				driver = new FirefoxDriver();
			case "edge":
				System.setProperty(Constants.EDGE_DRIVER, Constants.EDGE_DRIVER_LOCATION);
				driver = new InternetExplorerDriver();
			default:
				System.setProperty(Constants.CHROME_DRIVER, Constants.CHROME_DRIVER_LOCATION);
				driver = new ChromeDriver();
				break;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
