package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {

	WebDriver driver;
	
	//Constructor
	public Loginpage(WebDriver driver){
		this.driver=driver;
		//PageFactory.initElements(driver, this);
	}
	
	//locators
	    By TxtUser= By.xpath("//input[@name='username']");
	    By TxtPass=By.xpath("//input[@name='password']");
	    By Click=By.xpath("//button[@type='submit']");
	    
	//Actions methods
	    
	 public void username(String user) {
		 driver.findElement(TxtUser).sendKeys(user);
	 }
	 public void password(String pass) {
		 driver.findElement(TxtPass).sendKeys(pass);
	 }
	 public void loginclick() {
		 driver.findElement(Click).click();
	 }
}
