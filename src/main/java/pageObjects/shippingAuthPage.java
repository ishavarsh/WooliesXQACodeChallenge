package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class shippingAuthPage {
	
	public WebDriver driver;	
	By signInTab = By.xpath("//li[contains(@class,'second')]");
	By emailAddress= By.cssSelector(".form-group .validate.account_input[id=email]");
	By password= By.cssSelector(".form-group .validate.account_input[id=passwd]");
	By submitLogin= By.id("SubmitLogin");
	
	
	public shippingAuthPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public WebElement getSignInTab()
	{
		return driver.findElement(signInTab);
	}
	
	public WebElement getEmailAddress()
	{
		return driver.findElement(emailAddress);
	}
	public WebElement getPassword()
	{
		return driver.findElement(password);
	}
	
	public WebElement getSignInBtn()
	{
		return driver.findElement(submitLogin);
	}
	
	public By getSignInTabBy()
	{
		return signInTab;
	}

}
