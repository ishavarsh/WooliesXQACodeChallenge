package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class shippingDetailsPage {

	public WebDriver driver;	
	By shippingTab=By.xpath("//li[contains(@class,'four')]");
	By termsCheckbox=By.id("cgv");
	By checkOutBtn = By.xpath("//button[@name='processCarrier']");
	
	public shippingDetailsPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public WebElement getShippingTab()
	{
		return driver.findElement(shippingTab);
	}
	
	public WebElement getTermsCheckbox()
	{
		return driver.findElement(termsCheckbox);
	}
	
	public WebElement getCheckOutBtn()
	{
		return driver.findElement(checkOutBtn);
	}
	
	
}

