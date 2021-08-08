package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class storePage {

	public WebDriver driver;
	By itemName1 = By.xpath("//ul[@id='homefeatured']//child::li[1]/descendant::a[@class='product-name']");
	By itemName2 = By.xpath("//ul[@id='homefeatured']//child::li[2]/descendant::a[@class='product-name']");
	By item1AddToCart=By.cssSelector(".homefeatured .button-container .button[data-id-product='1']");
	By item2AddToCart=By.cssSelector(".homefeatured .button-container .button[data-id-product='2']");
	By cartLink=By.cssSelector(".shopping_cart a");
	
	public storePage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public WebElement getItemFirst()
	{
		return driver.findElement(itemName1);
	}
			
	public WebElement getItemSecond()
	{
		return driver.findElement(itemName2);
	}
	
	public WebElement getItem1AddToCart()
	{

		return driver.findElement(item1AddToCart);
	}
	
	public WebElement getItem2AddToCart()
	{

		return driver.findElement(item2AddToCart);
	}
	
	
	public WebElement getcartLink()
	{
		return driver.findElement(cartLink);
	}
	
	
	
	
}
