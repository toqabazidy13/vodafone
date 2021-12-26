package pages;



import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import com.opencsv.exceptions.CsvValidationException;

//In this class we are defining the elements and methods that we'll work on during our tests for the first result page

public class FirstResultPage extends PageBase  {
	

	public FirstResultPage(WebDriver driver) {
		super(driver);
	}
	

 
	@FindBy (id ="footcnt")
	WebElement endOfPage1;
	
	@FindBy (id = "pnnext")
	WebElement nextPage; 
	
	
	public void firstResultPageNavigation() throws CsvValidationException, IOException
	{
				
				Assert.assertTrue(endOfPage1.isDisplayed());
				System.out.println("End of Page1 is found");
				Assert.assertTrue(nextPage.isDisplayed());
				clickButton(nextPage);
		  

	}
}
