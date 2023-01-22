package com.amzon.testcase;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amzon.base.Baseclass;
import com.amzon.pageobjects.Indexpage;


public class Indexpagetest extends Baseclass {
	Indexpage indexpage;

	@BeforeMethod
	public void setup() {
		launchApp();
	}
	@AfterMethod
	public void teaddown() {
		driver.quit();
	}
	@Test
	public void verifylogo() {
		Indexpage indexpage=new Indexpage();
		boolean result=indexpage.validatlogo();
		Assert.assertTrue(result);
		
	}
	@Test
	public void verifytitle() {
		Indexpage indexpage=new Indexpage();
		String acttitle=indexpage.gettitlen();
		Assert.assertEquals(acttitle,"Amazon.com. Spend less. Smile more.");
		
		
	}
	
	
	
	
	
	
	
	
}
