package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class shippingAddressPage {

	public WebDriver driver;
	By addressTab =By.xpath("//li[contains(@class,'third')]");
	By checkOutBtn = By.xpath("//button[@name='processAddress']");
		
	public shippingAddressPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public WebElement getAddressTab()
	{
		return driver.findElement(addressTab);
	}
	
	public WebElement getCheckoutBtn()
	{
		return driver.findElement(checkOutBtn);
	}
	
	
}
