package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;


//In this class we are defining the elements and common methods that we'll work on during search
public class SearchPage extends PageBase 
{

	

	public SearchPage(WebDriver driver) {
		super(driver);	
	}
	

	
//   CSVReader reader2;
//	 public String readElement() throws CsvValidationException, IOException
//	{
//		String CSV_file = System.getProperty("user.dir")+"\\src\\test\\java\\data\\elementsLocatorsSearchTest.csv";
//		reader2 = new CSVReader(new FileReader(CSV_file));
//		String[] csvCell2;
//		if ((csvCell2 = reader2.readNext()) != null)
//		{
//			String searchBox= csvCell2[0];
//			return  searchBox ;
//		}
//		else
//			return null;
//	}

 
	@FindBy(name="q")	
	WebElement searchBox;
	



	public void search(String searchWord)
	{
		Assert.assertTrue(searchBox.isDisplayed());
		searchBox.clear();
		searchBox.sendKeys(searchWord);
		searchBox.submit();
		   
	}

}


