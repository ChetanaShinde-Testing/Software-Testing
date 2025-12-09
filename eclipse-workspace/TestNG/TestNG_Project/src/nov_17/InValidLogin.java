package nov_17;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class InValidLogin {
	
	
	
	 WebDriver dr= new ChromeDriver();
	 
	 @Test
	 public void Loginpage() throws InterruptedException {
			  
		  
	  dr.findElement(By.id("username")).sendKeys("Chetana");
	  Thread.sleep(2000);
	  dr.findElement(By.id("password")).sendKeys("123");
	  Thread.sleep(2000);
	  dr.findElement(By.id("submit")).click();
	  Thread.sleep(3000);
//	  dr.findElement(By.xpath("//*[@id=\"loop-container\"]/div/article/div[2]/div/div/div/a")).click();
	  
	  WebElement we = dr.findElement(By.id("error"));
	  System.out.println(we.getText());
	  
 }
 
 
	 @BeforeTest
	 public void beforeTest() throws InterruptedException {
	 
	  dr.get("https://practicetestautomation.com/practice-test-login/");
	  dr.manage().window().maximize();
	  Thread.sleep(5000);
 }

 
   
	 @AfterTest
	 public void afterTest() {
	// dr.close();
}
}



	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
 
