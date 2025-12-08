package test;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class CaptureScreenshot2 {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		WebDriver dr= new ChromeDriver();
		dr.get("https://www.saucedemo.com/");
		
		WebElement we1= dr.findElement(By.id("user-name"));
		WebElement we2= dr.findElement(By.id("password"));
		
		we1.sendKeys("Chetana Shinde");
		we2.sendKeys("123");
		
		
		File f1= we1.getScreenshotAs(OutputType.FILE);
		Files.copy(f1, new File ("C:\\Users\\Chetana\\Downloads\\Automation SS images\\username.png"));
		
		File f2= we2.getScreenshotAs(OutputType.FILE);
		Files.copy(f2, new File("C:\\Users\\Chetana\\Downloads\\Automation SS images\\password.png")); //path where image save
		
		Thread.sleep(3000);
		dr.close();
		
		

	}

}
