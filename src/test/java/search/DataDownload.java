package search;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DataDownload {
	WebDriver driver;
	WebElement element;

	public DataDownload(WebDriver driver) {
		this.driver = driver;
	}

	By click_datDownload = By.xpath("//ion-item[@title='Data Download']");
	By select_project = By.xpath("//span[@class='dropdown-btn']");
	By select_projectDD = By.xpath("(//li/input[@type='checkbox'])[1]");
	By select_startDate1 = By.xpath("(//input[@placeholder='Select Date'])[1]");
	By select_startDate2 = By.xpath("(//td[@role='gridcell']/span[text()='5'])[1]");
	By select_endDate1 = By.xpath("(//input[@placeholder='Select Date'])[2]");
	By select_endDate2 = By.xpath("(//td[@role='gridcell']/span[text()='30'])[2]");

	By leadstage_new = By.xpath("//ion-checkbox[@cvalue='1:New']");
	By leadStageNew_Assigned = By.xpath("//ion-checkbox[@cvalue='2:Assigned']");
	By leadStageNew_Oppertunity = By.xpath("//ion-checkbox[@cvalue=\"6:Opportunity\"]");
	By leadStageNew_Drop = By.xpath("//ion-checkbox[@cvalue=\"7:Drop\"]");
	By leadStageNew_sitevisit = By.xpath("//ion-checkbox[@cvalue=\"8:Site Visit\"]");
	By leadStageNew_BookingOpp = By.xpath("//ion-checkbox[@cvalue=\"9:Booking Opportunity\"]");
	By leadstageNew_Booking = By.xpath("//ion-checkbox[@cvalue=\"10:Booking\"]");
	By select_BookingDrpo = By.xpath("//ion-checkbox[@cvalue=\"11:Booking Drop\"]");
	By leadStage_Reengaged = By.xpath("//ion-checkbox[@cvalue=\"2:Re-engaged\"]");
	By leadSource_Direct = By.xpath("//ion-checkbox[@cvalue=\"8:Direct visit\"]");
	By leadSourceDirect_Walkin = By.xpath("//ion-checkbox[@cvalue=\"39:Walk in\"]");
	By leadSource_Offline = By.xpath("//ion-checkbox[@cvalue='2:offline']");
	By Hoardings = By.xpath("//ion-checkbox[@cvalue=\"2:hoardings\"]");
	By Busback = By.xpath("//ion-checkbox[@cvalue=\"5:bus back\"]");
	By Pamphets = By.xpath("//ion-checkbox[@cvalue=\"14:pamphlets\"]");
	By Newspaper_ads = By.xpath("//ion-checkbox[@cvalue=\"15:newspaper ads\"]");
	By Btl_activities = By.xpath("//ion-checkbox[@cvalue=\"16:btl activities\"]");
	By Property_expo = By.xpath("//ion-checkbox[@cvalue=\"17:property expo\"]");
	By Fair_pro = By.xpath("//ion-checkbox[@cvalue=\"18:fair pro\"]");
	By Contest = By.xpath("//ion-checkbox[@cvalue=\"19:contest\"]");
	By Press_release = By.xpath("//ion-checkbox[@cvalue=\"20:press release\"]");
	By Events = By.xpath("//ion-checkbox[@cvalue=\"21:events\"]");
	By Bill_boards = By.xpath("//ion-checkbox[@cvalue=\"22:billboards\"]");
	By Lamp_post = By.xpath("//ion-checkbox[@cvalue=\"23:lamp post\"]");
	By Banners = By.xpath("//ion-checkbox[@cvalue=\"24:banners\"]");
	By Retail_ads = By.xpath("//ion-checkbox[@cvalue=\"25:retail advertising\"]");
	By Vehicle_ads = By.xpath("//ion-checkbox[@cvalue=\"26:vehicle advertising\"]");
	By Wallscapes = By.xpath("//ion-checkbox[@cvalue=\"27:wallscapes\"]");
	By Unipole_hoardings = By.xpath("//ion-checkbox[@cvalue=\"28:unipole hoarding\"]");
	By Magazine = By.xpath("//ion-checkbox[@cvalue=\"29:magazines\"]");
	By Radio = By.xpath("//ion-checkbox[@cvalue=\"30:radio\"]");
	By Television = By.xpath("//ion-checkbox[@cvalue=\"31:television\"]");
	By leadSource_Online = By.xpath("//ion-checkbox[@cvalue=\"1:online\"]");
	By Emailers = By.xpath("//ion-checkbox[@cvalue=\"3:emailers\"]");
	By chatbot = By.xpath("//ion-checkbox[@cvalue=\"13:chatbot\"]");
	By instagram = By.xpath("//ion-checkbox[@cvalue=\"32:instagram\"]");
	By Native_ads = By.xpath("//ion-checkbox[@cvalue=\"34:native ads\"]");
	By Whatsapp = By.xpath("//ion-checkbox[@cvalue=\"36:whatsapp\"]");
	By website = By.xpath("//ion-checkbox[@cvalue=\"12:website\"]");
	By Contact_form = By.xpath("//ion-checkbox[@cvalue=\"24:Contact Form\"]");
	By Afficate = By.xpath("//ion-checkbox[@cvalue=\"33:affiliate \"]");
	By Afficate_Email = By.xpath("//ion-checkbox[@cvalue=\"18:Affiliate Emails\"]");
	By Afficate_Calls = By.xpath("//ion-checkbox[@cvalue=\"19:Affiliate Calls\"]");
	By Linkdin = By.xpath("//ion-checkbox[@cvalue=\"38:linkedin\"]");
	By linkdin_led_Gen = By.xpath("//ion-checkbox[@cvalue=\"9:LinkedIn Lead Gen\"]");
	By Google = By.xpath("//ion-checkbox[@cvalue=\"1:google\"]");
	By Google_search = By.xpath("//ion-checkbox[@cvalue=\"1:Google Search\"]");
	By Google_youtube = By.xpath("//ion-checkbox[@cvalue=\"4:Google YouTube\"]");
	By Google_GPS = By.xpath("//ion-checkbox[@cvalue=\"6:Google GSP\"]");
	By Google_ShoppingAds = By.xpath("//ion-checkbox[@cvalue=\"7:Google shopping ads\"]");
	By Google_Display = By.xpath("//ion-checkbox[@cvalue=\"2:Google Display\"]");
	By Google_App = By.xpath("//ion-checkbox[@cvalue=\"8:Google App\"]");
	By Google_Remarket = By.xpath("//ion-checkbox[@cvalue=\"3:Google Remarketing\"]");
	By Google_RLSA = By.xpath("//ion-checkbox[@cvalue=\"5:Google RLSA\"]");
	By Google_calls = By.xpath("//ion-checkbox[@cvalue=\"37:google calls\"]");
	By Google_Searchcalls = By.xpath("//ion-checkbox[@cvalue=\"20:Google Search Call\"]");
	By Google_Displaycalls = By.xpath("//ion-checkbox[@cvalue=\"21:Google Display Call\"]");
	By Google_Youtubecalls = By.xpath("//ion-checkbox[@cvalue=\"23:Google YouTube Call\"]");
	By Google_Remarketcalls = By.xpath("//ion-checkbox[@cvalue=\"22:Google Remarketing Call\"]");
	By Facebook = By.xpath("//ion-checkbox[@cvalue=\"4:facebook\"]");
	By Facebook_Boost = By.xpath("//ion-checkbox[@cvalue=\"13:Facebook Boost\"]");
	By Facebook_WebsiteTraff = By.xpath("//ion-checkbox[@cvalue=\"14:Facebook Website Traffic\"]");
	By Facebook_LeadGen = By.xpath("//ion-checkbox[@cvalue=\"11:Facebook Lead Gen\"]");
	By Facebook_EventResp = By.xpath("//ion-checkbox[@cvalue=\"15:Facebook Event Response\"]");
	By Facebook_Messaging = By.xpath("//ion-checkbox[@cvalue=\"16:Facebook Messaging\"]");
	By Facebook_Reach = By.xpath("//ion-checkbox[@cvalue=\"12:Facebook Reach\"]");
	By Facebook_chat = By.xpath("//ion-checkbox[@cvalue=\"17:Facebook Chat\"]");
	By Form_Fills = By.xpath("//ion-checkbox[@cvalue='1:Form Fills']");
	By Calls = By.xpath("//ion-checkbox[@cvalue=\"2:Calls\"]");
	By LeadDays_ISD = By.xpath("//ion-checkbox[@cvalue=\"1:ISD\"]");
	By LeadDays_IOPD = By.xpath("//ion-checkbox[@cvalue=\"2:IOPD\"]");
	By LeadDays_ISV = By.xpath("//ion-checkbox[@cvalue=\"3:ISV\"]");
	By LeadDays_SVTB = By.xpath("//ion-checkbox[@cvalue=\"4:SVTB\"]");
	By LeadDays_SVTBD = By.xpath("//ion-checkbox[@cvalue=\"5:SVTBD\"]");
	By No_of_calls_made = By.xpath("//ion-checkbox[@cvalue=\"1:No of calls made.\"]");
	By No_of_Emails_sent = By.xpath("//ion-checkbox[@cvalue=\"2:No of emails sent.\"]");
	By Interested_Active_Buyer = By.xpath("//ion-checkbox[@cvalue=\"1:Interested / Active Buyer\"]");
	By Information_Seeker = By.xpath("//ion-checkbox[@cvalue=\"2:Information Seeker\"]");
	By Property_Buyer = By.xpath("//ion-checkbox[@cvalue=\"3:Property Buyer\"]");
	By FTHB = By.xpath("//ion-checkbox[@cvalue=\"4:First time home buyer\"]");
	By second_time = By.xpath("//ion-checkbox[@cvalue=\"5:Second time investor\"]");
	By Looking_for_Loan = By.xpath("//ion-checkbox[@cvalue=\"6:Looking for Loan\"]");
	By CCB = By.xpath("//ion-checkbox[@cvalue=\"7:Check with competitor and come back\"]");
	By F_F = By.xpath("//ion-checkbox[@cvalue=\"8:Check with Family/Friends\"]");
	By Telecaller = By.xpath("//ion-checkbox[@cvalue='1:Telecaller']");
	By Salesmanager = By.xpath("//ion-checkbox[@cvalue=\"2:Salesmanager\"]");
	
	By bhk = By.xpath("//ion-checkbox[@formcontrolname=\"bhk\"]");
	By size = By.xpath("//ion-checkbox[@formcontrolname=\"size\"]");
	By floor = By.xpath("//ion-checkbox[@formcontrolname=\"floor\"]");
	By min_budget = By.xpath("//ion-checkbox[@formcontrolname=\"minimum_budget\"]");
	By max_budget = By.xpath("//ion-checkbox[@formcontrolname=\"maximum_budget\"]");
	By no_of_site_visit = By.xpath("//ion-checkbox[@formcontrolname=\"site_visit\"]");
	
	By age = By.xpath("//ion-checkbox[@formcontrolname=\"age_group\"]");
	By funds = By.xpath("//ion-checkbox[@formcontrolname=\"fund\"]");
	By occupation = By.xpath("//ion-checkbox[@formcontrolname=\"occupation\"]");
	By buy_reason = By.xpath("//ion-checkbox[@formcontrolname=\"buy_reason\"]");
	By current_location = By.xpath("//ion-checkbox[@formcontrolname=\"current_location\"]");
	By marrital_status = By.xpath("//ion-checkbox[@formcontrolname=\"marital_status\"]");
	By current_residental_address = By.xpath("//ion-checkbox[@formcontrolname=\"current_residential_status\"]");
	
	
	By Submit_btn = By.xpath("//button[text()=\" Submit \"]");

	public void dataDownload() {
		element = driver.findElement(click_datDownload);
		clickElement(element);
	}

	public void selectProject() {
		element = driver.findElement(select_project);
		clickElement(element);
		element = driver.findElement(select_projectDD);
		clickElement(element);
	}

	public void selectStartdate() {
		element = driver.findElement(select_startDate1);
		clickElement(element);
		element = driver.findElement(select_startDate2);
		clickElement(element);
	}

	public void selectEnddate() {
		element = driver.findElement(select_endDate1);
		clickElement(element);
		element = driver.findElement(select_endDate2);
		clickElement(element);
	}

	public void leadStageNew() {
		element = driver.findElement(leadstage_new);
		clickElement(element);
	}

	public void leadStageNewAssigned() {
		element = driver.findElement(leadStageNew_Assigned);
		clickElement(element);
	}

	public void leadStageNewOppertunity() {
		element = driver.findElement(leadStageNew_Oppertunity);
		clickElement(element);
	}

	public void leadStageNewDrop() {
		element = driver.findElement(leadStageNew_Drop);
		clickElement(element);
	}

	public void leadStageNewsitevisit() {
		element = driver.findElement(leadStageNew_sitevisit);
		clickElement(element);
	}

	public void leadStageNewBookingopp() {
		element = driver.findElement(leadStageNew_BookingOpp);
		clickElement(element);
	}

	public void leadStageNewBooking() {
		element = driver.findElement(leadstageNew_Booking);
		clickElement(element);
	}

	public void leadStageNewBookingDrop() {
		element = driver.findElement(select_BookingDrpo);
		clickElement(element);
	}

	public void leadStageNewREengaged() {
		element = driver.findElement(leadStage_Reengaged);
		clickElement(element);
	}

	public void leadSourceDirect() {
		element = driver.findElement(leadSource_Direct);
		clickElement(element);
	}

	public void leadSourceDirectWalkin() {
		element = driver.findElement(leadSourceDirect_Walkin);
		clickElement(element);
	}

	public void Offline() {
		element = driver.findElement(leadSource_Offline);
		clickElement(element);
	}

	public void Hoardings() {
		element = driver.findElement(Hoardings);
		clickElement(element);
	}

	public void Busback() {
		element = driver.findElement(Busback);
		clickElement(element);
	}

	public void Pamphets() {
		element = driver.findElement(Pamphets);
		clickElement(element);
	}

	public void Newspaper_ads() {
		element = driver.findElement(Newspaper_ads);
		clickElement(element);
	}

	public void Btl_activities() {
		element = driver.findElement(Btl_activities);
		clickElement(element);
	}

	public void Property_expo() {
		element = driver.findElement(Property_expo);
		clickElement(element);
	}

	public void Fair_pro() {
		element = driver.findElement(Fair_pro);
		clickElement(element);
	}

	public void Contest() {
		element = driver.findElement(Contest);
		clickElement(element);
	}

	public void Press_release() {
		element = driver.findElement(Press_release);
		clickElement(element);
	}

	public void Events() {
		element = driver.findElement(Events);
		clickElement(element);
	}

	public void Bill_boards() {
		element = driver.findElement(Bill_boards);
		clickElement(element);
	}

	public void Lamp_post() {
		element = driver.findElement(Lamp_post);
		clickElement(element);
	}

	public void Banners() {
		element = driver.findElement(Banners);
		clickElement(element);
	}

	public void Retail_ads() {
		element = driver.findElement(Retail_ads);
		clickElement(element);
	}

	public void Vehicle_ads() {
		element = driver.findElement(Vehicle_ads);
		clickElement(element);
	}

	public void Wallscapes() {
		element = driver.findElement(Wallscapes);
		clickElement(element);
	}

	public void Unipole_hoardings() {
		element = driver.findElement(Unipole_hoardings);
		clickElement(element);
	}

	public void Magazine() {
		element = driver.findElement(Magazine);
		clickElement(element);
	}

	public void Radio() {
		element = driver.findElement(Radio);
		clickElement(element);
	}

	public void Television() {
		element = driver.findElement(Television);
		clickElement(element);
	}

	public void leadSource_Online() {
		element = driver.findElement(leadSource_Online);
		clickElement(element);
	}

	public void Emailers() {
		element = driver.findElement(Emailers);
		clickElement(element);
	}

	public void chatbot() {
		element = driver.findElement(chatbot);
		clickElement(element);
	}

	public void instagram() {
		element = driver.findElement(instagram);
		clickElement(element);
	}

	public void Native_ads() {
		element = driver.findElement(Native_ads);
		clickElement(element);
	}

	public void Whatsapp() {
		element = driver.findElement(Whatsapp);
		clickElement(element);
	}

	public void website() {
		element = driver.findElement(website);
		clickElement(element);
	}

	public void Contact_form() {
		element = driver.findElement(Contact_form);
		clickElement(element);
	}

	public void Afficate() {
		element = driver.findElement(Afficate);
		clickElement(element);
	}

	public void Afficate_Email() {
		element = driver.findElement(Afficate_Email);
		clickElement(element);
	}

	public void Afficate_Calls() {
		element = driver.findElement(Afficate_Calls);
		clickElement(element);
	}

	public void Linkdin() {
		element = driver.findElement(Linkdin);
		clickElement(element);
	}

	public void linkdin_led_Gen() {
		element = driver.findElement(linkdin_led_Gen);
		clickElement(element);
	}

	public void Google() {
		element = driver.findElement(Google);
		clickElement(element);
	}

	public void Google_search() {
		element = driver.findElement(Google_search);
		clickElement(element);
	}

	public void Google_youtube() {
		element = driver.findElement(Google_youtube);
		clickElement(element);
	}

	public void Google_GPS() {
		element = driver.findElement(Google_GPS);
		clickElement(element);
	}

	public void Google_ShoppingAds() {
		element = driver.findElement(Google_ShoppingAds);
		clickElement(element);
	}

	public void Google_Display() {
		element = driver.findElement(Google_Display);
		clickElement(element);
	}

	public void Google_App() {
		element = driver.findElement(Google_App);
		clickElement(element);
	}

	public void Google_Remarket() {
		element = driver.findElement(Google_Remarket);
		clickElement(element);
	}

	public void Google_RLSA() {
		element = driver.findElement(Google_RLSA);
		clickElement(element);
	}

	public void Google_calls() {
		element = driver.findElement(Google_calls);
		clickElement(element);
	}

	public void Google_Searchcalls() {
		element = driver.findElement(Google_Searchcalls);
		clickElement(element);
	}

	public void Google_Displaycalls() {
		element = driver.findElement(Google_Displaycalls);
		clickElement(element);
	}

	public void Google_Youtubecalls() {
		element = driver.findElement(Google_Youtubecalls);
		clickElement(element);
	}

	public void Google_Remarketcalls() {
		element = driver.findElement(Google_Remarketcalls);
		clickElement(element);
	}

	public void Facebook() {
		element = driver.findElement(Facebook);
		clickElement(element);
	}

	public void Facebook_Boost() {
		element = driver.findElement(Facebook_Boost);
		clickElement(element);
	}

	public void Facebook_WebsiteTraff() {
		element = driver.findElement(Facebook_WebsiteTraff);
		clickElement(element);
	}

	public void Facebook_LeadGen() {
		element = driver.findElement(Facebook_LeadGen);
		clickElement(element);
	}

	public void Facebook_EventResp() {
		element = driver.findElement(Facebook_EventResp);
		clickElement(element);
	}

	public void Facebook_Messaging() {
		element = driver.findElement(Facebook_Messaging);
		clickElement(element);
	}

	public void Facebook_Reach() {
		element = driver.findElement(Facebook_Reach);
		clickElement(element);
	}

	public void Facebook_chat() {
		element = driver.findElement(Facebook_chat);
		clickElement(element);
	}

	public void Form_Fills() {
		element = driver.findElement(Form_Fills);
		clickElement(element);
	}

	public void Calls() {
		element = driver.findElement(Calls);
		clickElement(element);
	}

	public void LeadDays_ISD() {
		element = driver.findElement(LeadDays_ISD);
		clickElement(element);
	}

	public void LeadDays_IOPD() {
		element = driver.findElement(LeadDays_IOPD);
		clickElement(element);
	}

	public void LeadDays_ISV() {
		element = driver.findElement(LeadDays_ISV);
		clickElement(element);
	}

	public void LeadDays_SVTB() {
		element = driver.findElement(LeadDays_SVTB);
		clickElement(element);
	}

	public void LeadDays_SVTBD() {
		element = driver.findElement(LeadDays_SVTBD);
		clickElement(element);
	}

	public void No_of_calls_made() {
		element = driver.findElement(No_of_calls_made);
		clickElement(element);
	}

	public void No_of_Emails_sent() {
		element = driver.findElement(No_of_Emails_sent);
		clickElement(element);
	}

	public void Interested_Active_Buyer() {
		element = driver.findElement(Interested_Active_Buyer);
		clickElement(element);
	}

	public void Information_Seeker() {
		element = driver.findElement(Information_Seeker);
		clickElement(element);
	}

	public void Property_Buyer() {
		element = driver.findElement(Property_Buyer);
		clickElement(element);
	}

	public void FTHB() {
		element = driver.findElement(FTHB);
		clickElement(element);
	}

	public void second_time() {
		element = driver.findElement(second_time);
		clickElement(element);
	}

	public void Looking_for_Loan() {
		element = driver.findElement(Looking_for_Loan);
		clickElement(element);
	}

	public void CCB() {
		element = driver.findElement(CCB);
		clickElement(element);
	}

	public void F_F() {
		element = driver.findElement(F_F);
		clickElement(element);
	}

	public void Telecaller() {
		element = driver.findElement(Telecaller);
		clickElement(element);
	}

	public void Salesmanager() {
		element = driver.findElement(Salesmanager);
		clickElement(element);
	}
	
	public void size() {
		element = driver.findElement(size); 
		clickElement(element); 
		}
	
	public void min_budget() {
		element = driver.findElement(min_budget); 
		clickElement(element); 
		}
	
	public void max_budget() {
		element = driver.findElement(max_budget); 
		clickElement(element); 
		}
	
	public void No_of_sitevisit() {
		element = driver.findElement(no_of_site_visit); 
		clickElement(element); 
		}
	
	public void age() {
		element = driver.findElement(age); 
		clickElement(element); 
		}
	
	public void funds() {
		element = driver.findElement(funds); 
		clickElement(element); 
		}
	
	public void buy_reason() {
		element = driver.findElement(buy_reason); 
		clickElement(element); 
		}
	
	public void current_location() {
		element = driver.findElement(current_location); 
		clickElement(element); 
		}
	
	public void marrital_status() {
		element = driver.findElement(marrital_status); 
		clickElement(element); 
		}
	
	public void current_residental_address() {
		element = driver.findElement(current_residental_address); 
		clickElement(element); 
		}
	
	
	public void Submit() { 
		element = driver.findElement(Submit_btn); 
		clickElement(element); 
	}
	

	private void clickElement(WebElement element) {
		// TODO Auto-generated method stub
		try {
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].click();", element);
			Thread.sleep(1000);
		} catch (Exception e) {
			System.out.println("Failed to click element: " + e.getMessage());
		}

	}

	public void floor() {
		element = driver.findElement(floor); 
		clickElement(element); 
		
	}

	public void bhk() {
		element = driver.findElement(bhk); 
		clickElement(element); 
		
	}

	public void occupation() {
		element = driver.findElement(occupation); 
		clickElement(element); 
		
	}

	

}
