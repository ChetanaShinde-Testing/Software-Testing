package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicitwait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			
		WebDriver dr= new ChromeDriver();
		dr.get("https://www.saucedemo.com/");
		dr.manage().window().maximize();
		
		
		WebElement we1 = dr.findElement(By.id("user-name"));
		we1.sendKeys("Chetana");
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //syntax for implicit wait
		
		
		WebElement we2 = dr.findElement(By.id("password"));
		we2.sendKeys("Password@123");
		
		WebElement we3 = dr.findElement(By.id("login-button"));
		we3.click();
		
		dr.close();
	}

}
