package test;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolldown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		WebDriver dr= new ChromeDriver();
		dr.get("https://testyou.in/Login.aspx");
		dr.manage().window().maximize();
		
		JavascriptExecutor JE= (JavascriptExecutor)dr; //syntax to handle scrollbar
		Thread.sleep(5000);
		JE.executeScript("window.scrollBy(0,200);"); //scrolls vertically (Up-down)
		
		Thread.sleep(5000);
		JE.executeScript("window.scrollBy(0,-150);"); //scrolls vertically (Down-up)
		
		
		
		
		
		
		Thread.sleep(3000);
		dr.close();
		
		
	}

}
