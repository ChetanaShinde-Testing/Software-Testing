package Nov_18;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Practice {
	WebDriver dr= new ChromeDriver();
	
  @Test
  public void facebookLogin() throws InterruptedException {
	  Thread.sleep(1000);
	  dr.findElement(By.id("email")).sendKeys("97XXXXXXXX");
	  Thread.sleep(1000);
	  dr.findElement(By.id("pass")).sendKeys("Shital@239");
	  Thread.sleep(2000);
	  dr.findElement(By.id("loginbutton")).click();
	  dr.findElement(By.xpath("//div[@class='recaptcha-checkbox-border']")).click();
  }
  
  
  @BeforeTest
  public void beforeTest() throws InterruptedException {
  
  dr.get("https://www.facebook.com/login/");
  Thread.sleep(2000);
  dr.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() throws InterruptedException {
	  Thread.sleep(3000);
	//  dr.close();
  }

}
