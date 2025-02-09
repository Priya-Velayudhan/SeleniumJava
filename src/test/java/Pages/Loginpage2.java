package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage2 {

	WebDriver driver;
	
	//Constructor
	public Loginpage2(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//locators
	    //By TxtUser= By.xpath("//input[@name='username']");
	    //By TxtPass=By.xpath("//input[@name='password']");
	    //By Click=By.xpath("//button[@type='submit']");
	    
	    @FindBy(xpath="//input[@name='username']") WebElement TxtUser;
	    @FindBy(xpath="//input[@name='password']") WebElement TxtPass;
	    @FindBy(xpath="//button[@type='submit']") WebElement Click;
	    @FindBy(tagName="a") List<WebElement> links;
	    
	//Actions methods
	    
	 public void username(String user) {
		 //driver.findElement(TxtUser).sendKeys(user);
		 TxtUser.sendKeys(user);
	 }
	 public void password(String pass) {
		 //driver.findElement(TxtPass).sendKeys(pass);
		 TxtPass.sendKeys(pass);
	 }
	 public void loginclick() {
		 //driver.findElement(Click).click();
		 Click.click();
	 }
	 
	    
	   
	    
}
