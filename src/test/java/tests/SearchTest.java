package tests;


import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import pages.FirstResultPage;
import pages.SearchPage;
import pages.SecondResultPage;
import pages.ThirdResultPage;

public class SearchTest extends TestBase {

	// Creating objects from the page classes
	SearchPage searchPage;
	FirstResultPage firstResultPage;
	SecondResultPage secondResultPage;
	ThirdResultPage thirdResultPage;

	CSVReader reader;


	@Test (priority = 1)
	//TC01: Testing if the user can type and search using the search box
	//Expected result: Success > Navigation to the first result page
	public void userSearch() throws CsvValidationException, IOException
	{
		String CSV_file = System.getProperty("user.dir")+"\\src\\test\\java\\data\\SearchWord.csv";
		reader = new CSVReader(new FileReader(CSV_file));

		String[] csvCell;

		if ((csvCell = reader.readNext()) != null)
		{
			String searchValue = csvCell[0];

			searchPage = new SearchPage(driver);
			searchPage.search(searchValue);	

		}

		else System.out.println("Search Box is empty!");


	}

	

	@Test (priority = 2)
	//TC02: Testing if the user is navigated to first result page and 
	//      Next button can navigate him to the second result page
	//Expected result: Success > Scrolling down the first result page and  Navigation to the second result page
	public void firstScreenNavigation() throws CsvValidationException, IOException
	{

		firstResultPage = new FirstResultPage(driver);
		firstResultPage.firstResultPageNavigation();

	}
	


	@Test (priority = 3)
	//TC03: Testing if the user is navigated to second result page and 
	//      Next button can navigate him to the third result page
	//      Counting the displayed search results
	//Expected result: Success > Scrolling down the second result page, counting the results number and  Navigation to the third result page
	public void SecondScreenNavigation()
	{

		secondResultPage = new SecondResultPage(driver);
		secondResultPage.secondResultPageNavigation();
	}
	
	
	
	@Test (priority = 4)
	//TC04: Testing if the user is navigated to the third result page and 
	//      Counting the displayed search results
	//      Comparing the number of search results to the results in the second page
	//Expected result: Success > Counting the results number and  comparing to the results number in the second page
	public void ThirdScreenNavigation()
	{

		thirdResultPage = new ThirdResultPage(driver);
		thirdResultPage.thirdPageAssertion();

	}
	
	@AfterMethod 

	public void takeScreenShot (ITestResult result) throws IOException
	{
		if (ITestResult.FAILURE == result.getStatus())
		{
			TakesScreenshot ts = (TakesScreenshot)driver;

			File source = ts.getScreenshotAs(OutputType.FILE);

			FileUtils.copyFile(source, new File("./Screenshoots/"+ result.getName()+".png"));
		}
	}

}
