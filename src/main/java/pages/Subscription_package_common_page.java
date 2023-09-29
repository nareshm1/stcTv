package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.base;

public class Subscription_package_common_page extends base {

	@FindBy(xpath="//a[@id='translation-btn' and contains(text(),'English')]")
	static WebElement EnglishLanguageTranslation;
	
	@FindBy(xpath="//a[@id='country-btn']//span[@id='country-name']")
	static WebElement CountryChangeButton;
	
	@FindBy(xpath="//*[@id=\"bh\"]//span[contains(text(),'Bahrain')]")
	static WebElement BahrainCountryOption;
	
	@FindBy(xpath="//*[@id=\"bh\"]//span[contains(text(),'KSA')]")
	static WebElement KSACountryOption;
	
	@FindBy(xpath="//*[@id=\"bh\"]//span[contains(text(),'Kuwait')]")
	static WebElement KuwaitCountryOption;
	
	@FindBy(xpath="//div[@class='plan-names']//strong[contains(text(),'Lite')]")
	static WebElement PlanLiteHeader;
	
	@FindBy(xpath="//div[@class='plan-names']//strong[contains(text(),'Classic')]")
	static WebElement PlanClassicHeader;
	
	@FindBy(xpath="//div[@class='plan-names']//strong[contains(text(),'Premium')]")
	static WebElement PlanPremiumHeader;
	
	@FindBy(xpath="//div[@class='price' and  @id='currency-lite']//i")
	static WebElement CurrencyLite;
	
	@FindBy(xpath="//div[@class='price' and  @id='currency-classic']//i")
	static WebElement CurrencyClassic;
	
	@FindBy(xpath="//div[@class='price' and  @id='currency-premium']//i")
	static WebElement CurrencyPremium;
	
	@FindBy(xpath="//div[@class='price' and  @id='currency-lite']//b")
	static WebElement LiteSusbscriptionPrice;
	
	@FindBy(xpath="//div[@class='price' and  @id='currency-classic']//b")
	static WebElement ClassicSusbscriptionPrice;
	
	@FindBy(xpath="//div[@class='price' and  @id='currency-premium']//b")
	static WebElement PremiumSusbscriptionPrice;
	
	public Subscription_package_common_page(WebDriver driver) {
		PageFactory.initElements(driver, this);
    }
	
	    
}   
