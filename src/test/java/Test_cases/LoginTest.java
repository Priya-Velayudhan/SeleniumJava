package Test_cases;

import java.time.Duration;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Pages.Loginpage;
import Pages.Loginpage2;

public class LoginTest {
	
	WebDriver driver;
	
	@BeforeClass
	void Setup() {
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	@Test
	void loginTest() {
		//Loginpage lp =new Loginpage(driver);
		Loginpage2 lp= new Loginpage2(driver);
		lp.username("Admin");
		lp.password("admin123");
		lp.loginclick();
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
	}
	
	@AfterClass
	void Teardown() {
		driver.quit();
	}

}
