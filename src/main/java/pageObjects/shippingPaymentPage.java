package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class shippingPaymentPage {

	public WebDriver driver;	
	By paymentTab=By.id("step_end");
	By payByWire = By.cssSelector(".bankwire");
	By pageHeading = By.cssSelector(".page-heading");
	By confirmOrder = By.cssSelector(".cart_navigation button");
	By confirmText =By.cssSelector(".cheque-indent .dark");
	
	
	public shippingPaymentPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public WebElement getPaymentTab()
	{
		return driver.findElement(paymentTab);
	}
	
	public WebElement getPayWire()
	{
		return driver.findElement(payByWire);
	}
	
	
	public WebElement getPageHeading()
	{
		return driver.findElement(pageHeading);
	}
	
	public WebElement getConfirmOrder()
	{
		return driver.findElement(confirmOrder);
	}
	

	public WebElement getConfirmText()
	{
		return driver.findElement(confirmText);
	}
}
