package Module10_POM_Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLogin1Page
{
	//1.declaration
		@FindBy(xpath="//input[@id='userid']") private WebElement UN; // private webElement UN=driver.findElement(By.xpath("Xpath Expression"))
		@FindBy(xpath="//input[@id='password']")private WebElement PWD;//private webElement PWD=driver.findElement(By.xpath("Xpath Expression"))
		@FindBy(xpath="//button[@class='button-orange wide']")private WebElement login; //private webElement PWD=driver.findElement(By.xpath("Xpath Expression"))
		
		//2.initialisation
		
		public KiteLogin1Page(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		//3.usage
		public void inpKiteLogin1PageUsername(String usename)
		{
			UN.sendKeys(usename);
		}
		public void inpKiteLogin1PagePassword(String Password)
		{
			PWD.sendKeys(Password);
		}
		public void clickKiteLogin1PageLoginBtn()
		{
			login.click();
		}

}
