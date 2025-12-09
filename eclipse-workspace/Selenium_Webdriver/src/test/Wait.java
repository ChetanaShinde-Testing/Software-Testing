package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Wait {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		
		WebDriver dr= new ChromeDriver();
		dr.get("https://www.saucedemo.com/");
		dr.manage().window().maximize();
		
		WebElement we1 = dr.findElement(By.id("user-name"));
		WebElement we2 = dr.findElement(By.id("password"));
		Thread.sleep(3000);
		we1.sendKeys("Chetana");
		Thread.sleep(5000);
		we2.sendKeys("Password@123");
		
		
		
		Thread.sleep(3000);  //mandatory wait
		dr.close();
	}

}
