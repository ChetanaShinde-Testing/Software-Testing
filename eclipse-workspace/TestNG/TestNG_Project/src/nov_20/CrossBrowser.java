package nov_20;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowser {
	@Parameters	({"Browser"})

	@Test 
	public void BrowserOpening(String Browser) {
	
	if(Browser.equalsIgnoreCase("Chrome")) {
		
		WebDriver dr = new ChromeDriver();
		dr.get("http://testphp.vulnweb.com/login.php");
		dr.manage().window().maximize();
		
	}else if (Browser.equalsIgnoreCase("Firefox")) {
		WebDriver dr = new FirefoxDriver();
		dr.get("https://chatgpt.com/");
		
	}else if (Browser.equalsIgnoreCase("Edge")) {
		WebDriver dr = new EdgeDriver();
		dr.get("https://www.ilovepdf.com/");
		
	}else {
	System.out.println("Invalid Input Try Again........");
	}
}
}
