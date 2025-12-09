package Demo_classes;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class CaptureScreenshot1 {

	public static void main(String[] args) throws IOException, InterruptedException {
	WebDriver dr = new ChromeDriver();
	dr.manage().window().maximize();
	dr.get("https://www.flipkart.com/");
	
	File f1 = ((TakesScreenshot)dr).getScreenshotAs(OutputType.FILE);
	
	Files.copy(f1, new File ("C:\\Users\\Chetana\\Downloads\\SS\\flipcart.png"));
	
	Thread.sleep(2000);
	dr.close();

	}

}
