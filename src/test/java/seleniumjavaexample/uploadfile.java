package seleniumjavaexample;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class uploadfile {
@Test
	public void Login() throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//input[@id='singleFileInput']"))).build().perform();
		driver.findElement(By.xpath("//input[@id='singleFileInput']")).sendKeys("C:\\Users\\Priya MV\\Downloads\\UserAssessmentReport_197186@ust.com_1730181321270.pdf");
		Thread.sleep(2000);
		driver.quit();
		

	}
@Test
   public void actionclass() throws InterruptedException {
	   WebDriver driver =new ChromeDriver();
	   driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   
	   Actions a=new Actions(driver);
	   a.moveToElement(driver.findElement(By.id("mousehover"))).build().perform();
	  
	   driver.findElement(By.linkText("Top")).click();
	   //Thread.sleep(3000);
	   
	   
	   
   }
@Test
 public void action() throws IOException {

	WebDriver driver = new ChromeDriver();
	driver.get("https://testautomationpractice.blogspot.com/");
	driver.manage().window().maximize();
	//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	Actions a = new Actions(driver);
	a.scrollByAmount(0, 2000).build().perform();
	a.moveToElement(driver.findElement(By.xpath("//button[@ondblclick='myFunction1()']"))).doubleClick().build().perform();
	
	//driver.findElement(By.id("draggable")).click();
	//WebElement drop =driver.findElement(By.id("droppable"));
	a.dragAndDrop(driver.findElement(By.id("draggable")), driver.findElement(By.id("droppable"))).build().perform();
	a.sendKeys(Keys.PAGE_UP).build().perform();
	
	File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(src, new File("C:\\Users\\Priya MV\\screenshot1.png"));
	
	 
	
}

}
