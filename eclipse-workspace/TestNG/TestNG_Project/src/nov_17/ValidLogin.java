package nov_17;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class ValidLogin {
	
	
	
	WebDriver dr = new ChromeDriver();
  @Test
    
  public void ValidLogin() throws InterruptedException {
	  
	  dr.findElement(By.id("username")).sendKeys("student");
	  Thread.sleep(2000);
	  dr.findElement(By.id("password")).sendKeys("Password123");
	  Thread.sleep(2000);
	  dr.findElement(By.id("submit")).click();
	  Thread.sleep(2000);
	  dr.findElement(By.xpath("//*[@id=\"loop-container\"]/div/article/div[2]/div/div/div/a")).click();
  }
  
  
  @BeforeTest
  public void beforeTest() throws InterruptedException {
	  dr.get("https://practicetestautomation.com/practice-test-login/");
	  Thread.sleep(2000);
	  dr.manage().window().maximize();
  }

  
  
  @AfterTest
  public void afterTest() {
	  
	 // dr.close();
  }

}
