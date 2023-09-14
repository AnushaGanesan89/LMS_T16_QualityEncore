package com.lms.ui.appHooks;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


import com.lms.ui.driver.DriverFactory;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.qameta.allure.Allure;

public class Hooks {
	private static DriverFactory driverFactory =new DriverFactory();
	static boolean firstSession=true;
	
	
	
	@Before
	public void bf()
	{
		if (firstSession)
		{
			
			driverFactory.setDriver();
			
			firstSession=false;
		}
	}
	
	@After
	public static void aftAll()
	{
		try {
			try {
				driverFactory.getDriver().quit();
			} catch (Exception e) {
				
				e.printStackTrace();
			}
		} catch (Exception e) {
	
			e.printStackTrace();
		}
	
	/*	if (scenario.isFailed()) {
			// take screenshot:
				String screenshotName = scenario.getName().replaceAll(" ", "_");
				byte[] sourcePath = ((TakesScreenshot)BaseClass.driver).getScreenshotAs(OutputType.BYTES);
				//scenario.attach(sourcePath, "image/png", screenshotName);
				Allure.addAttachment("Failed screenshots", new ByteArrayInputStream(sourcePath));
		}
*/
}
}
