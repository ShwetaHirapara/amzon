package com.amzon.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeTest;

import com.amzon.actiondriver.action;

public class Baseclass {
	public static Properties prop;
	public static WebDriver driver;
	
	@BeforeTest
	public void loadConfig() {
try {
	prop=new Properties();
	System.out.println("super constructor invoked");
	FileInputStream ip = new FileInputStream("C:\\Users\\User1\\eclipse-workspace\\Amzon\\configuration\\config.properties");
	prop.load(ip);
	System.out.println("driver:" + driver);
	} catch(FileNotFoundException e) {
		e.printStackTrace();
	} catch(IOException e) {
		e.printStackTrace();
	}
	}
	public static void launchApp() {
		String browsername=prop.getProperty("browser");
				
		if(browsername.equalsIgnoreCase("Chrome")) {
			driver=new ChromeDriver();
		} else if(browsername.contains("FireFox")) {
			driver=new FirefoxDriver();
		} else if(browsername.contains("IE")) {
			driver=new InternetExplorerDriver();
		}

		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
	}

}
