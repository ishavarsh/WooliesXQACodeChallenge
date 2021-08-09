package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class base 
{
	
	public static WebDriver driver;
	public WebDriver initializeDriver() throws IOException
	
	{
		Properties prop = new Properties();
		FileInputStream fis= new FileInputStream("C:\\Users\\v_2vi\\eclipse-workspace\\QACodeChallenge\\src\\main\\java\\resources\\data.properties");
		prop.load(fis);
		String browserName=prop.getProperty("browser");
		if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\work\\drivers\\chromedriver.exe");
			 driver=new ChromeDriver();
			
		}
		
		else if (browserName.equals("firefox"))
		{
			driver =new FirefoxDriver();
			
		}
		
		else if (browserName.equals("IE"))
		{
			driver=new InternetExplorerDriver();
		}
			
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		return driver;
		
		
		
	}

}
