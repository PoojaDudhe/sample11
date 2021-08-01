package Module1_Test__Profile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Config_files.BaseClass;
import Config_files.Utility;
import Module10_POM_Login.KiteLogin1Page;
import Module10_POM_Login.KiteLogin2Page;
import Module1_POM_Profile.KiteHomePage;

public class KiteLoginTest1 extends BaseClass
{
	KiteLogin1Page login1;
	KiteLogin2Page login2;
	KiteHomePage home;
	int TCID;
	
	
	@BeforeClass
	public void openBrowser() throws EncryptedDocumentException, IOException
	{
		Reporter.log("---open browser---");
		initializeBrowser();
		login1=new KiteLogin1Page(driver);
		 login2=new KiteLogin2Page(driver);
		 home=new KiteHomePage(driver);
		
	}
	@BeforeMethod
	public void loginToApplication() throws EncryptedDocumentException, IOException
	{
		Reporter.log("---login to app----");
		
		login1.inpKiteLogin1PageUsername(Utility.readPropertyFileData("UN"));
		login1.inpKiteLogin1PagePassword(Utility.readPropertyFileData("PWD"));
		login1.clickKiteLogin1PageLoginBtn();
		login2.inpKiteLogin2PagePin(Utility.readPropertyFileData("pin"));
		login2.clickKiteLogin2PageContinueBtn();
		
	}
	@Test
	public void verifyProfileName() throws EncryptedDocumentException, IOException
	{
		TCID= 200;
		Reporter.log("---running Test script---");
		String actUserID= "gewsfthh";         //home.getKiteHomePageUserID();
		String expUserID=Utility.getTestData(0, 3);
		//home.verifykiteHomePageUserID();
		
		Assert.assertEquals(actUserID, expUserID,"actUserID & expUserID are different");
		//Utility.captureScreenshot( driver, TCID);
		
		
	}
	@AfterMethod
	public void logoutFromApplication(ITestResult result) throws IOException
	{
		Reporter.log("---logout from Application---");
		

		Reporter.log("---capture screenshot of only failed test case---");
		if(result.getStatus()==ITestResult.FAILURE)
		{
			Utility.captureScreenshot(driver, TCID);
		}
		
	}
	@AfterClass
	public void closeBrowser() throws InterruptedException
	{
		Reporter.log("---close browser----");
		Thread.sleep(3000);
		driver.close();
		
		login1=null;
		login2=null;
		home=null;
		
	}

}
