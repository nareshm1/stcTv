package stepDefinations;



import dev.failsafe.internal.util.Assert;
import io.cucumber.java8.Fa;
import org.apache.hc.core5.util.Asserts;
import org.asynchttpclient.util.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Utilties.utils;
import base.base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.time.Duration;

public class ActionSteps extends base {

	@Given("^I am navigating to the \"([^\"]*)\"$")
	public static void urlNavigator(String url) {
		driver.get(url);
	}
	
	@Given("^I am opening the \"([^\"]*)\" browser$")
	public static void openBrowser(String browserName) {
		 initialise(browserName);
	}
	
	@And("^I am waiting for \"([^\"]*)\" milliseconds$")
	public static void sleepMode(int waitTime) {
		try {
			Thread.sleep(waitTime);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	@Then("^I am waiting for the element \"([^\"]*)\" for \"([^\"]*)\"$")
	public static void waitForTheElement(WebElement element, Duration waitTime, String timeFrequency) {
		utils.waitUntilVisibilityofElement(waitTime,element);
	}
	
	@Given("^I am clicking the element \"([^\"]*)\"$")
	public static void clickElement(WebElement element) {
		driver.findElement((By)element).click();
	}

	@Then("^I am validating the text \"([^\"]*)\" in element \"([^\"]*)\"$")
	public static void validateText(WebElement element,String text){
		WebElement ele = driver.findElement((By)element);
		String textValidate = ele.getText();
		boolean b =  false;
		if(textValidate.contains(text)) b=true;
		if(b==false){
			throw  new AssertionError("Text is not matching");
		}
	}

}
