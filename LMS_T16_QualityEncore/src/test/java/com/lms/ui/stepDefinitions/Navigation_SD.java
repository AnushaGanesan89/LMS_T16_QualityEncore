package com.lms.ui.stepDefinitions;

import org.openqa.selenium.WebDriver;

import com.lms.ui.driver.DriverFactory;
import com.lms.ui.pageObject.Navigation_obj;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Navigation_SD {

	WebDriver driver =DriverFactory.getDriver();
	Navigation_obj objng = new Navigation_obj(driver);
	

@When("Admin clicks Student button in the navigation bar")
public void admin_clicks_student_button_in_the_navigation_bar() {
 
	objng.studntclickmethod();
}

@When("Admin clicks Program button in the navigation bar")
public void admin_clicks_program_button_in_the_navigation_bar() {
   objng.prgmclickmethod();
}

@When("Admin clicks Batch button in the navigation bar")
public void admin_clicks_batch_button_in_the_navigation_bar() {
    objng.btchclickmethod();
}

@When("Admin clicks User button in the navigation bar")
public void admin_clicks_user_button_in_the_navigation_bar() {
    objng.usrclickmethod();
}

@When("Admin clicks Assignment button in the navigation bar")
public void admin_clicks_assignment_button_in_the_navigation_bar() {
    objng.assgnclickmethod();
}

@When("Admin clicks Attendance button in the navigation bar")
public void admin_clicks_attendance_button_in_the_navigation_bar() {
   objng.attnclickmethod();
}

@When("Admin clicks Logout button in the navigation bar")
public void admin_clicks_logout_button_in_the_navigation_bar() {
   objng.logoutclickmethod();
}


@Then("Admin should able to land on student page")
public void admin_should_able_to_land_on_student_page() {
    objng.msgchckstdnchk();
    
}

@Then("Admin should able to land on program page")
public void admin_should_able_to_land_on_program_page() {
    objng.msgchckprgmchk();
    
}

@Given("Admin is in Manage class")
public void admin_is_in_manage_class() {
    
    
}

@Then("Admin should able to land on batch page")
public void admin_should_able_to_land_on_batch_page() {
    objng.msgchckbtchmchk();
    
}

@Then("Admin should able to land on user page")
public void admin_should_able_to_land_on_user_page() {
    objng.msgchcusrmchk();
    
}

@Then("Admin should able to land on Assignment page")
public void admin_should_able_to_land_on_assignment_page() {
    objng.msgchckassignmchk();
    
}

@Then("Admin should able to land on Attendance page")
public void admin_should_able_to_land_on_attendance_page() {
    objng.msgchckattdnmchk();
    
}

@Then("Admin should able to land on login page")
public void admin_should_able_to_land_on_login_page() {
    
    objng.msgchlogoutchk();
}

//Student module

@Given("Admin is on student details page")
public void admin_is_on_student_details_page() {
 
}

@When("Admin clicks on program link on student page")
public void admin_clicks_on_program_link_on_student_page() {
	objng.prgmclickmethod();
}

@Then("Admin is redirected to Program page")
public void admin_is_redirected_to_program_page() {
	objng.msgchckprgmchk();
}

@When("Admin clicks on Batch link on student page")
public void admin_clicks_on_batch_link_on_student_page() {
	objng.btchclickmethod();
}

@Then("Admin is redirected to Batch page")
public void admin_is_redirected_to_batch_page() {
	objng.msgchckbtchmchk();
}

@When("Admin clicks on Class link on student page")
public void admin_clicks_on_class_link_on_student_page() {
	objng.classclickmethod();
}

@Then("Admin is redirected to Class page")
public void admin_is_redirected_to_class_page() {
    objng.msgclasschk();
}

@When("Admin clicks on User link on student page")
public void admin_clicks_on_user_link_on_student_page() {
   
}

@Then("Admin is redirected to User page")
public void admin_is_redirected_to_user_page() {
	 objng.msgchcusrmchk();
}

@When("Admin clicks on Assignment link on student page")
public void admin_clicks_on_assignment_link_on_student_page() {
	objng.assgnclickmethod();
}

@Then("Admin is redirected to Assignment page")
public void admin_is_redirected_to_assignment_page() {
	  objng.msgchckassignmchk();    
}

@When("Admin clicks on Attendance link on student page")
public void admin_clicks_on_attendance_link_on_student_page() {
	objng.attnclickmethod();
}

@Then("Admin is redirected to Attendance page")
public void admin_is_redirected_to_attendance_page() {
	 objng.msgchckattdnmchk();
	    
}

@When("Admin clicks on Logout link on student page")
public void admin_clicks_on_logout_link_on_student_page() {
	objng.logoutclickmethod();
}

@Then("Admin is redirected to Login page")
public void admin_is_redirected_to_login_page() {
	 objng.msgchlogoutchk();
}

}
