package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class test1 
{
	@Test
	public void m1()
	{
		System.setProperty("webdriver.chrome.driver", "\\D:\\Selenium\\chromedriver.exe\\");
		WebDriver  driver=new ChromeDriver();
		
	}

}
