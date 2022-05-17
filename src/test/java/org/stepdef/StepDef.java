package org.stepdef;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDef extends BaseClass {
	
	@Given("user is on TripAdvisor page on chrome browser")
	public void userIsOnTripAdvisorPageOnChromeBrowser() {
//	    getDriver();
//	    launchUrl("https://www.tripadvisor.in/");
	}

	@When("user should enter location and search")
	public void userShouldEnterLocationAndSearch() {
		driver.findElement(By.xpath("//span[text()='Trips']")).click();
		driver.findElement(By.xpath("//span[text()='Holiday homes']")).click();
		WebElement findSearch = driver.findElement(By.xpath("//input[@placeholder='Where do you want to go?']"));
		findSearch.sendKeys("Finland");
		WebElement checkIn = driver.findElement(By.id("SUBMIT_VACATION_RENTALS"));
		checkIn.click();
	}

	@When("user should enter trip details")
	public void userShouldEnterTripDetails() {
	    
	}

	@When("user should click booknow button")
	public void userShouldClickBooknowButton() {
	    
	}

	@Then("user should verify hotel is booked or not")
	public void userShouldVerifyHotelIsBookedOrNot() {
	    
	}


}
