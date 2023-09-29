package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class base {
	public static WebDriver driver;

	public static void initialise(String browserName) {

		if(browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			ChromeOptions chromeOptions =  new ChromeOptions();
			chromeOptions.addArguments("--start-maximized");
			chromeOptions.addArguments("--disable-extensions");
			driver =  new ChromeDriver(chromeOptions);
			driver.manage().window().maximize();
		}else if(browserName.equalsIgnoreCase("firefox")){
			WebDriverManager.firefoxdriver().setup();
			driver =  new FirefoxDriver();
			driver.manage().window().maximize();
		}
	}
}
