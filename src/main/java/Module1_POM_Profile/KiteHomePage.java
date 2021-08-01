package Module1_POM_Profile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomePage 
{
	//1.declaration
		@FindBy(xpath="//span[@class='user-id']")private WebElement UserID;
		
		//2.initialisation
		public KiteHomePage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		//3.usage
		public String  getKiteHomePageUserID()
		{
			String actText=UserID.getText();
			return actText;
			
		}

}
