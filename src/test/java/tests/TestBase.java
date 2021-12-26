package tests;


import java.io.FileReader;
import java.io.IOException;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

//This class is intended to:
//1. Drive the drivers to execute on any needed browser based on the testng.xml parameter
//2. Define the execution of before and after test suites that is used among all the tests
//3. Close the browser at the end of the execution
//4. Read the website URL using CSV reader
public class TestBase {

	public static WebDriver driver;

	CSVReader reader1;

	@BeforeSuite
	@Parameters ({"browser"})

	public void startDriver(@Optional("chrome") String browserName) throws CsvValidationException, IOException
	{
		String CSV_file = System.getProperty("user.dir")+"\\src\\test\\java\\data\\URLs.csv";
		reader1 = new CSVReader(new FileReader(CSV_file));

		String[] csvCell1;

		if ((csvCell1 = reader1.readNext()) != null)
		{

			String UrlValue = csvCell1[0];

			if (browserName.equalsIgnoreCase("chrome")) 
			{
				System.setProperty("webdriver.chrome.driver", 
						System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
				driver = new ChromeDriver();
			}
			else if (browserName.equalsIgnoreCase("firefox")) 
			{
				System.setProperty("webdriver.gecko.driver", 
						System.getProperty("user.dir")+"\\Drivers\\geckodriver.exe");
				driver = new  FirefoxDriver();
			}
			else if (browserName.equalsIgnoreCase("edge")) 
			{
				System.setProperty("webdriver.edge.driver", 
						System.getProperty("user.dir")+"\\Drivers\\msedgedriver.exe");
				driver = new EdgeDriver();
			}


			driver.manage().window().maximize();
			driver.navigate().to(UrlValue);

		}

	}

	@AfterSuite
	public void closeDriver()
	{
		driver.quit();
	}
}
