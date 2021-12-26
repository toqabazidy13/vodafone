package pages;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;



//This class is intended to initialize the driver that deals with web elements
//As well as defining a common functionality "Click" that is used across the whole screens

public class PageBase {

	protected static WebDriver driver;  
	
	public PageBase (WebDriver driver)
	{
		PageFactory.initElements(driver, this);

	}

	protected static void clickButton (WebElement button)
	{
		button.click();
	}
	

}

