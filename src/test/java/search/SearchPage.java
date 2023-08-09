package search;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchPage {
	WebDriver driver;
	public SearchPage(WebDriver driver){
		this.driver=driver;
	}
	
	By Username_editbox = By.xpath("//input[@placeholder=\"Enter Email\"]");
	By password_editbox = By.xpath("//input[@placeholder=\"Enter your password\"]");
	By Login_Btn = By.xpath("//button[@class=\"btnSignIn\"]");
	
	
	
	public void enterUserName(String mail) {
		// TODO Auto-generated method stub
		driver.findElement(Username_editbox).click();
		driver.findElement(Username_editbox).sendKeys(mail);
	}
	
	public void enterPassword(String pass) {
		driver.findElement(password_editbox).click();
		driver.findElement(password_editbox).sendKeys(pass);
	}
	public void verifyLogin() {
		driver.findElement(Login_Btn).click();
		//driver.switchTo().alert().accept();
		  String tittle =driver.getTitle();
		  assertEquals(tittle, "MINT360");
		 
	}
	

}
