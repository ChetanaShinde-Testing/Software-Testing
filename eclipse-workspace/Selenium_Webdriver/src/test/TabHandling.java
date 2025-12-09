package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class TabHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver dr= new ChromeDriver();
		String PT= dr.getWindowHandle(); //PT: Parent tab
		dr.get("https://www.google.com"); //PT Tab
		dr.manage().window().maximize();
		dr.switchTo().newWindow(WindowType.TAB); //In same window another tab will open
		String CT= dr.getWindowHandle(); //CT: Child Tab
		dr.get("https://www.gmail.com"); //CT tab
		//dr.navigate().back(); // only work on tab 
		dr.switchTo().window(PT);
	}

}
