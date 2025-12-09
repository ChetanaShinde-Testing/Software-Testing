package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tabhandling1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver dr= new ChromeDriver();
		
		String PT= dr.getWindowHandle(); //PT: Parent tab
		dr.get("https://www.facebook.com"); //PT Tab
		dr.manage().window().maximize();
		dr.switchTo().newWindow(WindowType.TAB);
		
		
		
		String CT= dr.getWindowHandle(); //CT: Child Tab
		dr.get("https://www.cricbuzz.com/"); //CT tab
		dr.switchTo().newWindow(WindowType.TAB);
		
		
		String AB= dr.getWindowHandle(); //AB: Parent tab
		dr.get("https://www.redbus.in/");
		
		
		dr.switchTo().window(PT);
		
		dr.switchTo().window(CT);
		
		dr.switchTo().window(AB);
		
		dr.switchTo().window(PT);
		
		dr.close();

		dr.quit();
		

	
	}

}
