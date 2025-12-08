package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {

	public static void main(String[] args) {

	WebDriver dr = new ChromeDriver();
	dr.get("https://practicesoftwaretesting.com/auth/login");
	
	List<WebElement> we1 = dr.findElements(By.tagName("a"));
	System.out.println(we1.size());
	
	
	WebElement we2 = dr.findElement(By.id("password"));
	we2.sendKeys("Chetana");
		
		
		
		
	dr.close();	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
