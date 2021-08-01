package Config_files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility
{
	public static String getTestData(int rowIndex,int colIndex) throws EncryptedDocumentException, IOException
	{
		
		// @Author name: Pooja
		// this method is use to get inputs from excel sheet
		// need to pass 2 parameters ie. 1.rowIndex 2. colIndex
		FileInputStream file=new FileInputStream("C:\\Users\\DELL\\eclipse-workspace\\Selenium\\TestData\\Apr21A.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("DDF");
		String value = sh.getRow(rowIndex).getCell(colIndex).getStringCellValue();
		return value;
		
		// @Author name: pooja
		// this method is use to capture Screenshot
		// need to pass 2 parameters ie. 1.driver value 2. Test case ID
		
	}

	public static void captureScreenshot(WebDriver driver, int ID ) throws IOException 
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest =new File("C:\\Users\\DELL\\eclipse-workspace\\Sample\\screenshot\\TestcaseID"+ID+".jpg");
		FileHandler.copy(src, dest);
	}
	
	public static String readPropertyFileData(String key) throws IOException
	{
		Properties obj=new Properties();
		 FileInputStream file=new FileInputStream("C:\\Users\\DELL\\eclipse-workspace\\Selenium\\propertyfile.properties");
				 obj.load(file);
		String value = obj.getProperty(key);
		return value;
		
		
	}

	


	
	
	
}
 