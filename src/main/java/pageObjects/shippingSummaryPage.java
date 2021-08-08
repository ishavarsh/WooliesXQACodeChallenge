package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class shippingSummaryPage {
	
	public WebDriver driver;
	By summaryTab = By.xpath("//li[contains(@class,'first')]");
	By productsQty= By.id("summary_products_quantity");
	By proceedToCheckout=By.cssSelector(".cart_navigation.clearfix a[title='Proceed to checkout']");	
	By addressProceedBtn= By.cssSelector(".cart_navigation.clearfix button");
			
	public shippingSummaryPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public WebElement getSummaryTab()
	{
		return driver.findElement(summaryTab);
	}
		
	public WebElement getProceedToCheckout()
	{
		return driver.findElement(proceedToCheckout);
	}
		
	public WebElement getProductsQuantity()
	{
		return driver.findElement(productsQty);
	} 
	
	
	public WebElement getAddressProceedBtn()
	{
		return driver.findElement(addressProceedBtn);
	} 
	
	
	
	 

}
