package test;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class CaptureScreenshot1 {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		WebDriver dr= new ChromeDriver();
		dr.get("https://www.amazon.in/");
		dr.manage().window().maximize();
		
		File f1= ((TakesScreenshot)dr).getScreenshotAs(OutputType.FILE);
		
		Files.copy(f1, new File ("C:\\Users\\Chetana\\Downloads\\Automation SS images\\amazon.png")); //path where image save
		
		Thread.sleep(5000);
		dr.close();
		

	}

}
