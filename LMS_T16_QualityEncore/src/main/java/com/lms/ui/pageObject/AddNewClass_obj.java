package com.lms.ui.pageObject;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.lms.ui.util.BaseClass;
import com.lms.ui.util.LoggerLoad;



public class AddNewClass_obj extends BaseClass {


	public AddNewClass_obj(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	WebDriver driver = com.lms.ui.driver.DriverFactory.getDriver();
	
	boolean status;
	
	@FindBy(xpath = "//a[@id ='batchid']")
	WebElement Batchidval;
	@FindBy(xpath = "//a[@id ='noofclasses']")
	WebElement noclassval;
	@FindBy(xpath = "//a[@id ='classdate']")
	WebElement clasdtval;
	@FindBy(xpath = "//a[@id ='staffid']")
	WebElement staffval;
	@FindBy(xpath = "//a[@id ='Save']")
	WebElement saveBtnclick;
	@FindBy(xpath = "//pre[@id='classdetail']")
	WebElement OutputclassdetailChk;
	@FindBy(xpath = "//a[@id ='date picker']")
	WebElement datepickerclick;
	@FindBy(xpath = "//a[@id ='Cancel']")
	WebElement cancelclick;
	@FindBy(xpath = "//a[@id ='msgcheck']")
	WebElement manageclassnoent;
	

	
	public void batchidDrpdwn()
	{
		Batchidval.click();
	}
	public void datepickerclickmeth()
	{
		datepickerclick.click();
	}
	
	

	
	public void cancelclkmeth()
	{
		cancelclick.click();
	}
	public void checkpopmsg()
	{
		try {
			status = OutputclassdetailChk.isDisplayed();
			assertTrue(status);

			LoggerLoad.info("No button is displayed");

		} catch (AssertionError e) {
			LoggerLoad.error("No button is not displayed");
			System.out.println(e.getMessage());
		}
		
	}
	public void checkbatchdrpmsg()
	{
		try {
			status = Batchidval.isDisplayed();
			assertTrue(status);

			LoggerLoad.info("batch id is displayed");

		} catch (AssertionError e) {
			LoggerLoad.error("batch id is not displayed");
			System.out.println(e.getMessage());
		}
		
		
	}
	
	public void checknoclasspmsg()
	{
		try {
			status = noclassval.isDisplayed();
			assertTrue(status);

			LoggerLoad.info("no of classes is displayed");

		} catch (AssertionError e) {
			LoggerLoad.error("no of classes  is not displayed");
			System.out.println(e.getMessage());
		}
		
		
	}
	public void checkclasdtmsg()
	{
		try {
			status = clasdtval.isDisplayed();
			assertTrue(status);

			LoggerLoad.info("class date is displayed");

		} catch (AssertionError e) {
			LoggerLoad.error("class date is not displayed");
			System.out.println(e.getMessage());
		}
		
		
	}
	public void checkstaffidmsg()
	{
		try {
			status = staffval.isDisplayed();
			assertTrue(status);

			LoggerLoad.info("staff id is displayed");

		} catch (AssertionError e) {
			LoggerLoad.error("staff id is not displayed");
			System.out.println(e.getMessage());
		}
		
		
	}

	public void checfieldsmsg()
	{
		try {
			status = saveBtnclick.isDisplayed();
			assertTrue(status);

			LoggerLoad.info("No button is displayed");

		} catch (AssertionError e) {
			LoggerLoad.error("No button is not displayed");
			System.out.println(e.getMessage());
		}
		
		
	}
	
	public void allfields()
	{
		Batchidval.getAttribute("value");
		noclassval.getText();
		clasdtval.getText();
		staffval.getText();
	}
	
	public void savebtnclickmth()
	{
		saveBtnclick.click();
	}
	
	
	public void alertmsg()
	{
		try {
			status = OutputclassdetailChk.isDisplayed();
			assertTrue(status);

			LoggerLoad.info("class added is displayed");

		} catch (AssertionError e) {
			LoggerLoad.error("class added is not displayed");
			System.out.println(e.getMessage());
		}
	}
	
	public void mangecalssnoentrychk()
	{
		try {
			status = manageclassnoent.isDisplayed();
			assertTrue(status);

			LoggerLoad.info("class added is displayed");

		} catch (AssertionError e) {
			LoggerLoad.error("class added is not displayed");
			System.out.println(e.getMessage());
		}
	}
	
	
}

