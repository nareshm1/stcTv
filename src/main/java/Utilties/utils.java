package Utilties;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverListener;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.base;

public class utils extends base {

	
	public static WebDriverWait ExplicitWait(Duration waitTime) {
		WebDriverWait wait =  new WebDriverWait(driver,waitTime);
		return wait;
	}
	
	public static void  implicitWait(Duration waitTime) {
		driver.manage().timeouts().implicitlyWait(waitTime);
	}
	
	public static void waitUntilVisibilityofElement(Duration waitTime,WebElement element) {
		ExplicitWait(waitTime).until(ExpectedConditions.visibilityOfElementLocated((By) element));
	}
	
	
	
}
