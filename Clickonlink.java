package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clickonlink {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver dr= new ChromeDriver();
		dr.get("https://testyou.in/Login.aspx");
		dr.manage().window().maximize();
		
		//WebElement we= dr.findElement(By.id("ctl00_CPHContainer_hprlnkForgetPassword"));
		//	Thread.sleep(3000);
		//	we.click();
		
		//WebElement we1= dr.findElement(By.linkText("Forgot Password ?"));  //By.linkText: Paste extact link/words here
		//	we1.click();
		//	Thread.sleep(3000);
		
		//WebElement we1= dr.findElement(By.partialLinkText("Password ?"));  //By.partialLinkText: Paste matching link/word here
		//we1.click();
		//Thread.sleep(3000);
		
		//WebElement we1= dr.findElement(By.linkText("Or Signup for TestYou"));  //By.linkText: Paste extact link/words here
		//we1.click();
		//Thread.sleep(3000);
		
		WebElement we1= dr.findElement(By.partialLinkText("Or Signup for"));  //By.partialLinkText: Paste matching link/word here
		Thread.sleep(3000);
		we1.click();
		
		
		
		Thread.sleep(3000);
		dr.close();
	}

}
