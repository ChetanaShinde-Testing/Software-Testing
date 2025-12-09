package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitwait {

	public static void main(String[] args) {
	
		WebDriver dr= new ChromeDriver();
		dr.get("https://www.saucedemo.com/");
		dr.manage().window().maximize();
		
		
		WebElement we1 = dr.findElement(By.id("user-name"));
		we1.sendKeys("Chetana");
		WebDriverWait wt = new WebDriverWait(dr, Duration.ofSeconds(10)); //syntax for explicit wait
		wt.until(ExpectedConditions.visibilityOf(we1));                   //syntax for explicit wait
		
		
		WebElement we2 = dr.findElement(By.id("password"));
		we2.sendKeys("Password@123");
		
		WebElement we3 = dr.findElement(By.id("login-button"));
		we3.click();
		
		dr.close();	
		
		
		
		

	}

}
