package Config_files;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseClass 
{
	public WebDriver driver;
	public void initializeBrowser() throws IOException
	{
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\Selenium\\Browsers\\chromedriver.exe");
		 driver=new ChromeDriver(options);
		 
		 driver.get(Utility.readPropertyFileData("URL"));
		driver.get("https://kite.zerodha.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}

}
