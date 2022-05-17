package org.stepdef;

import org.base.BaseClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class HooksClass extends BaseClass {

	@Before
	public void beforeScenario() {
		getDriver();
		launchUrl("https://www.tripadvisor.in/");
	}
	
//	@After
//	public void afterScenario(Scenario S) {
//
//		if (S.isFailed()) {
//			TakesScreenshot ts = (TakesScreenshot) driver;
//			byte[] screenshotAs = ts.getScreenshotAs(OutputType.BYTES);
//			S.embed(screenshotAs, "fblogin.png");
//		}
//		driver.quit();
//	}
}
