package TestScenarios;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import search.DataDownload;
import search.SearchPage;

public class TestMethodTelecaller {
	WebDriver driver;
	SearchPage elem;
	DataDownload ele;
	
	@BeforeTest
	public void beforeTest() {
		
		driver = new ChromeDriver();
		SearchPage elem1=new SearchPage(driver);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://qa.mint360.in/#/auth/signin");
		driver.manage().window().maximize();
	}
	
	@Test(priority = 1)
	public void login1() {
		elem=new SearchPage(driver);
		elem.enterUserName("suji@gmail.com");
		elem.enterPassword("Suji@123");
		elem.verifyLogin();
		
	}
	
}
