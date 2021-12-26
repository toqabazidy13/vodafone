package pages;

import org.openqa.selenium.WebDriver;
import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

//In this class we are defining the elements and methods that we'll work on during our tests for the third result page
public class ThirdResultPage extends PageBase  {

	public ThirdResultPage(WebDriver driver) {
		super(driver);
	
	}
	
	@FindBy (className = "g")
	List<WebElement> pageTwoLinks;
	
	
	

	public void thirdPageAssertion()
	{
		System.out.println( "size equal: " + pageTwoLinks.size());
		Assert.assertEquals(10, pageTwoLinks.size());
		System.out.println( "assertion2 is done");
		
		Assert.assertEquals(pages.SecondResultPage.pageOneLinks.size(), pageTwoLinks.size());
		System.out.println( "Search results in page 2 = search result in page 3");
	}
	

	
	
}
