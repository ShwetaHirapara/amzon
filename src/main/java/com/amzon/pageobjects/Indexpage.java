package com.amzon.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amzon.actiondriver.action;
import com.amzon.base.Baseclass;

public class Indexpage extends Baseclass {

	@FindBy(xpath="//span[@class='nav-action-inner']")
	WebElement SignInBtn;
	
	@FindBy(id="nav-logo-sprites")
	WebElement amzonlogo;
	
	@FindBy(xpath="//*[@id=\"twotabsearchtextbox\"]")
	WebElement searchbox;
	
	@FindBy(id="nav-search-submit-button")
	WebElement searchbutton;
		
	public Indexpage() {
		PageFactory.initElements(driver, this);
	}
	public Loginpage clickonsignbutton() {
		action.click(driver, SignInBtn);
		return new Loginpage();
	}
	public boolean validatlogo() {
		return action.isDisplayed(driver, amzonlogo);
	}
	public String gettitlen() {
		String indextitle =driver.getTitle();
		return indextitle;
	}
	public searchresultpage searchproduct(String productname) {
		action.type(searchbox, productname);
		action.click(driver, searchbutton);
		return new searchresultpage();
	}
	public Loginpage clickonsigninbuttonn() throws Exception {
		action.JSClick(driver, SignInBtn);
		return new Loginpage();
	}
	
	
	
	
	
	
	
	
}
