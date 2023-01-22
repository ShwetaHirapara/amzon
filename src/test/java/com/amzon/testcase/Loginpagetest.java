package com.amzon.testcase;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amzon.actiondriver.action;
import com.amzon.base.Baseclass;
import com.amzon.pageobjects.Accountspage;
import com.amzon.pageobjects.Indexpage;
import com.amzon.pageobjects.Loginpage;
import com.amzon.pageobjects.passwordpage;
import com.amzon.pageobjects.signinpage;

public class Loginpagetest extends Baseclass {
	Indexpage indexpage;
	Loginpage loginpage;
	signinpage Signinpage;
	passwordpage Passwordpage;
	Accountspage accountspage;
	
	@BeforeMethod
	public void setup() {
		launchApp();
	}
	@AfterMethod
	public void teaddown() {
		driver.quit();
	}
	
	@Test
	public void logintest() throws Exception {
		indexpage=new Indexpage();
		Loginpage loginpage=new Loginpage();
		loginpage=indexpage.clickonsigninbuttonn();
		loginpage.signin(prop.getProperty("username"));
		passwordpage Passwordpage=new passwordpage();
		Passwordpage=loginpage.continuebutton();
		Passwordpage.passwordenter("password");
		Passwordpage.signInSubmit();
		Thread.sleep(3000);
		Accountspage accountspage=new Accountspage();
		Thread.sleep(3000);

		System.out.println("done");
		accountspage.verifyaccountpage();
	}
}
