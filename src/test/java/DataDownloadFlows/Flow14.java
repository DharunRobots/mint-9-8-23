package DataDownloadFlows;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import search.DataDownload;
import search.SearchPage;

public class Flow14 {

	WebDriver driver;
	SearchPage elem;
	DataDownload ele;

	@BeforeSuite
	public void beforeTest() {

		driver = new ChromeDriver();
		SearchPage elem1 = new SearchPage(driver);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://qa.mint360.in/#/auth/signin");
		driver.manage().window().maximize();
	}

	@BeforeTest
	public void login1() {
		elem = new SearchPage(driver);
		elem.enterUserName("sameera@gmail.in");
		elem.enterPassword("123456");
		elem.verifyLogin();

	}

	@Test
	public void dataDown() throws IOException {
		ele = new DataDownload(driver);
		ele.dataDownload();
		ele.selectProject();
		ele.selectStartdate();
		ele.selectEnddate();
		ele.leadStageNewREengaged();
		ele.leadSource_Online();
		ele.website();
		ele.Form_Fills();
		ele.LeadDays_SVTB();
		ele.Salesmanager();
		ele.max_budget();
		ele.No_of_sitevisit();
		ele.buy_reason();

		ele.Submit();

		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./scrrenshot14.png");
		FileHandler.copy(src, dest);

	}
	@AfterTest
	public void closeDriver() {
		driver.quit();
	}

}
