package test;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class CaptureScreenshot {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		WebDriver dr= new ChromeDriver();
		dr.get("https://www.saucedemo.com/");
		
		File f1= ((TakesScreenshot)dr).getScreenshotAs(OutputType.FILE);
		
		Files.copy(f1, new File ("C:\\Users\\Chetana\\Downloads\\Automation SS images\\screenshoot.png"));
		
		
		Thread.sleep(3000);
		dr.close();

	}

}
