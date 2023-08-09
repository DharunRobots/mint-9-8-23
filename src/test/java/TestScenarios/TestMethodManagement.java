package TestScenarios;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
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

public class TestMethodManagement {
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
	
		elem = new SearchPage(driver);
		elem.enterUserName("sameera@gmail.in");
		elem.enterPassword("123456");
		elem.verifyLogin();
		// driver.switchTo().alert().accept();

	}

	@Test
	public void dataDown() throws IOException {
		ele = new DataDownload(driver);
		ele.dataDownload();
		ele.selectProject();
		ele.selectStartdate();
		ele.selectEnddate();
		ele.leadStageNew();
		ele.leadStageNewAssigned();
		ele.leadStageNewOppertunity();
		ele.leadStageNewDrop();
		ele.leadStageNewsitevisit();
		ele.leadStageNewBookingopp();
		ele.leadStageNewBooking();
		ele.leadStageNewBookingDrop();
		ele.leadStageNewREengaged();
		ele.leadSourceDirect();
		ele.leadSourceDirectWalkin();
		ele.Offline();
		ele.Hoardings();
		ele.Busback();
		ele.Pamphets();
		ele.Newspaper_ads();
		ele.Btl_activities();
		ele.Property_expo();
		ele.Fair_pro();
		ele.Contest();
		ele.Press_release();
		ele.Events();
		ele.Bill_boards();
		ele.Lamp_post();
		ele.Banners();
		ele.Retail_ads();
		ele.Vehicle_ads();
		ele.Wallscapes();
		ele.Unipole_hoardings();
		ele.Magazine();
		ele.Radio();
		ele.Television();
		ele.leadSource_Online();
		ele.Emailers();
		ele.chatbot();
		ele.instagram();
		ele.Native_ads();
		ele.Whatsapp();
		ele.website();
		ele.Contact_form();
		ele.Afficate();
		ele.Afficate_Email();
		ele.Afficate_Calls();
		ele.Linkdin();
		ele.linkdin_led_Gen();
		ele.Google();
		ele.Google_search();
		ele.Google_youtube();
		ele.Google_GPS();
		ele.Google_ShoppingAds();
		ele.Google_Display();
		ele.Google_App();
		ele.Google_Remarket();
		ele.Google_RLSA();
		ele.Google_calls();
		ele.Google_Searchcalls();
		ele.Google_Displaycalls();
		ele.Google_Youtubecalls();
		ele.Google_Remarketcalls();
		ele.Facebook();
		ele.Facebook_Boost();
		ele.Facebook_WebsiteTraff();
		ele.Facebook_LeadGen();
		ele.Facebook_EventResp();
		ele.Facebook_Messaging();
		ele.Facebook_Reach();
		ele.Facebook_chat();
		ele.Form_Fills();
		ele.Calls();
		ele.LeadDays_ISD();
		ele.LeadDays_IOPD();
		ele.LeadDays_ISV();
		ele.LeadDays_SVTB();
		ele.LeadDays_SVTBD();
		ele.No_of_calls_made();
		ele.No_of_Emails_sent();
		ele.Interested_Active_Buyer();
		ele.Information_Seeker();
		ele.Property_Buyer();
		ele.FTHB();
		ele.second_time();
		ele.Looking_for_Loan();
		ele.CCB();
		ele.F_F();
		ele.Telecaller();
		ele.Salesmanager();

		ele.bhk();
		ele.floor();
		ele.size();
		ele.min_budget();
		ele.max_budget();
		ele.No_of_sitevisit();

		ele.age();
		ele.funds();
		ele.occupation();
		ele.buy_reason();
		ele.current_location();
		ele.marrital_status();
		ele.current_residental_address();

		ele.Submit();

		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./scrrenshot.png");
		FileHandler.copy(src, dest);

	}
	@AfterTest
	public void driverclose() {
		driver.quit();
	}

}
