package Module10_POM_Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLogin2Page 
{
	//1.declaration
		@FindBy(xpath="//input[@id='pin']")private WebElement PIN;
		@FindBy(xpath="//button[@class='button-orange wide']")private WebElement contBtn;
		
		//2.initialization
		public KiteLogin2Page(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		//3.usage
		
		public void inpKiteLogin2PagePin(String pinvalue)
		{
			PIN.sendKeys(pinvalue);
		}
		public void clickKiteLogin2PageContinueBtn()
		{
			contBtn.click();
		}

}
