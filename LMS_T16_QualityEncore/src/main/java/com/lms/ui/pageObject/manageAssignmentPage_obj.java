package com.lms.ui.pageObject;

import static org.testng.Assert.assertTrue;

import java.util.List;

import org.checkerframework.checker.optional.qual.Present;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class manageAssignmentPage_obj {

	
	WebDriver driver = com.lms.ui.driver.DriverFactory.getDriver();
	
	@FindBy(linkText = "Assignment")
	WebElement manageasiclick;
	@FindBy(css="div[class='assignment-container']h1")
	WebElement header;
	@FindBy(tagName="body")
	WebElement text; 
	@FindBy(xpath="//button[contains(text),'header-delete-icon']")
	WebElement deleteicon;
	@FindBy(id="search_form_input_assignment")
	WebElement searchBox;
	@FindBy(xpath="input[value='Add assignment']")
	WebElement assignmentbtn;
	 @FindBy(xpath="//tr/th[1]")
		WebElement sortarrow;
	 @FindBy(xpath="//table/tbody/tr[1]/th")
	 List<WebElement> colheader;
	 @FindBy(className="cb-element mr-10")
	 List<WebElement> checkboxes;
	 @FindBy(css="div[class='assignment-container-footer']")
	 WebElement footer;
	 @FindBy(xpath="//div[@class='col-sm-6 text-right']")
	 WebElement pagemsg;
	
	public void dashboardpage()
	{
	  driver.navigate().to("www.LMS.com/dasboard");
	  System.out.println(driver.getTitle());
	}
	
	public void manageassignclickmethod()
	{
		manageasiclick.click();
	}
	
	public void urlwithmanageassignment()
	{
		System.out.println(driver.getCurrentUrl());
	//driver.navigate().to("https://www.lms.com/assignment/manage-assignment-page");
   
	}
	public void verifystheheaderwithmanageassignment()
	{
		 String expectedheading="Manage Assignment";
		if(header.getText().equalsIgnoreCase(expectedheading))
		{
			System.out.println("Manage Assignment is Present.class.....");
		}
	}
		public void clicks_assignment_button_on_the_navigation_bar()
		{
		   
	}
		
		public void get_all_text_from_manage_assignment_page() {
			// identify element and input text inside it
		      
		      
			System.out.println("Text content: "+ text.getText());
		   
		}

		
<<<<<<< HEAD
	public void checks_spellings_for_all_the_fields() {
			for(int i=0;i<text.size();i++)
=======
		public void checks_spellings_for_all_the_fields() {
			for(int i=0;i<((List<WebElement>) text).size();i++)
>>>>>>> e8cde174e12b9937b7edadf22dab645033a6dc7d
			{
			SpellChecker checker = new SpellChecker();

			SpellResponse spellResponse = checker.check(text[i]);

			for( SpellCorrection sc : spellResponse.getCorrections() ) 
				System.out.println( sc.getValue() );
		    
		}
		}

		
		public void verify_delete_icon_is_disable() {
		
			Assert.assertTrue(deleteicon.isEnabled());
			
			
		
		    
		}

		
		public void verify_search_bar_on_the_manage_assignment_page() {
			
			 if (searchBox.isEnabled()) 
			 {
		            System.out.println("Search Box is enabled. Return: " + searchBox.isEnabled());
		            searchBox.sendKeys("Selenium");
		        } else {
		            System.out.println("Search Box is not enabled. Return: " + searchBox.isEnabled());
		        }
		}	
			
			 public void verify_add_new_assignment_button() {
				 boolean addnewassignmentBtn= assignmentbtn.isEnabled();
				   if(addnewassignmentBtn)
				   {
					   assignmentbtn.click();
				   }
				   else
				   {
					   System.out.println("Add New Assignment button is Disable....");
				   }
			 }

			 
			 public void verify_column_headers() {
				 String []colheadernm={"Assignment Name","Assignment Description","Assignment Duedate","Grade"};
				 for(int i=0;i<colheader.size();i++)
				 {
					Assert.assertTrue(colheader.contains(colheadernm));
				 }
			 }

			 
			 public void verify_sort_icon_near_column_header() 
			 {
				 for(int i=0;i<colheader.size();i++)
				 {
					 if(sortarrow.isDisplayed() && sortarrow.isEnabled())
					 {
						 System.out.println("Clicking on the sort arrow.............");
					 }
				 }
				
			 }

			 
			 public void verify_checkbox_in_all_rows_of_data_table_when_entries_are_available() {
				  
					//traverse through the list and select all checkboxes if they are enabled and displayed.
					for(int i=0; i<checkboxes.size(); i++)
					{
						if(checkboxes.get(i).isDisplayed() && checkboxes.get(i).isEnabled())
						{
			                   System.out.println("Checkbox is displayed at index : " + i + " Clicking on it now");
			                        checkboxes.get(i).click();
		               }
						else
							System.out.println("There are no entries  in data table........");

			       }
			 }

			 
			 
			 public void validate_text_above_the_footer_Showing_zero_to_zero_of_zero_entries() {
			    String text=pagemsg.getText();
			    text.substring(text.indexOf("g")+1 ,text.indexOf("o")+1);
			    
			 
			 }

			 
			 public void get_the_text_above_the_footer() {
				 System.out.println(pagemsg.getText());
			 }

			 
			 public void verify_the_page_numbers() {
				Assert.assertTrue(footer.getText().equalsIgnoreCase("In tottal there are 0 assignments"));
				    System.out.println("Passed the Test............");
			 }
			 public void gets_response_time_for_navigation_from_dashboard_to_assignment_page()
			 {
				 long startTime = System.currentTimeMillis();
				 WebDriverWait wait= new WebDriverWait(driver, 10);
			 wait.until(ExpectedConditions.presenceOfElementLocated(By.id("assignment-click")));

			// Get the End Time
			long endTime = System.currentTimeMillis();

			// Measure total time
			long totalTime = endTime - startTime;
			System.out.println("Total Page Load Time: " + totalTime + " milliseconds");
			 } 
			 
			 
}			 



