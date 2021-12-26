package pages;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;


//In this class we are defining the elements and methods that we'll work on during our tests for the second result page
public class SecondResultPage extends PageBase  {

	public SecondResultPage(WebDriver driver) {
		super(driver);
	
	}
 
	@FindBy (className = "g")
	static
	List<WebElement> pageOneLinks;	
	
	@FindBy (id = "pnprev")
	WebElement endOfPage2;
	
	@FindBy (id = "pnnext")
	WebElement nextPage2; 
	
	public void secondResultPageNavigation() 
	{
		System.out.println( "size equal: " + pageOneLinks.size());
		Assert.assertEquals(10, pageOneLinks.size());
		System.out.println( "assertion is done");
		System.out.println("End of Page two is found");
		Assert.assertTrue(endOfPage2.isDisplayed());
		Assert.assertTrue(nextPage2.isDisplayed());
		System.out.println(" Next Btn is displayed");
		clickButton(nextPage2);
	}
}
