package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class addCartAckPage 

{	
	public WebDriver driver;
	By addCartAckText = By.xpath("//div[@class='clearfix']//h2[1]");
	By closeWndwIcon =By.xpath("//span[@title='Close window']");
	By checkOutBtn = By.cssSelector(".cart-buttons [id='button_order_cart']");
	
	public addCartAckPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public WebElement getAddCadrtAckText()
	{
		return driver.findElement(addCartAckText);
	}
	
	public WebElement getCloseWndwIcon()
	{
		return driver.findElement(closeWndwIcon);
	}
	
	public WebElement getCheckOutBtn()
	{
		return driver.findElement(checkOutBtn);
	}
	
	public By getCloseIconBy()
	{
		return closeWndwIcon;
	}
	

}
