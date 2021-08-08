package resources;

import java.io.IOException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class UtilityClass extends base
{ 
	
	public void  baseNavigation() throws IOException
	{
		driver= initializeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
				
	}
	
		
	public void scrollByVisibleElement(WebElement element)
	{
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", element);
		
	}
	
	public void quitDriver()
	{
		driver.quit();
		
	}
	
	public WebDriverWait waitInstance() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		return wait;
		
	}
	
	public Actions  actionInstance() {
		Actions actions= new Actions(driver);
		return actions;
		
	}
	public void scrollByPixel()
	{		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,2000)");
		
	}
	
	
	public void switchToNewWindow(WebDriver driver)
	{
		 for(String winHandle : driver.getWindowHandles()){
		 driver.switchTo().window(winHandle);
		
	}

   
	
 }
	
	
}
