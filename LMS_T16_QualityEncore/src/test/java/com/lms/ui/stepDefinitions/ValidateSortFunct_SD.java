package com.lms.ui.stepDefinitions;



import com.lms.ui.pageObject.validationSortFunct_obj;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ValidateSortFunct_SD {
	validationSortFunct_obj sortobj=new validationSortFunct_obj();
	
	@When("Clicks on assignment name column header to sort")
	public void clicks_on_assignment_name_column_header_to_sort() {
		sortobj.clicks_on_assignment_name_column_header_to_sort();
	   
	}
	@Then("Displays data tables sorts in ascending order")
	public void displays_data_tables_sorts_in_ascending_order() {
		sortobj.displays_data_tables_sorts_in_ascending_order();
	   
	}

	@Then("Displays data tables sorts in descending order")
	public void displays_data_tables_sorts_in_descending_order() {
		sortobj.displays_data_tables_sorts_in_descending_order();
		   
	}

}
