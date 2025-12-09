package test;



import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Customdefine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver dr= new ChromeDriver();
		dr.get("https://www.google.com");
		Dimension d1= new Dimension(500, 400);  //use proper package i.e. selenium.dimesion
		dr.manage().window().setSize(d1);
		
		dr.manage().window().maximize();
		System.out.println(dr.manage().window().getSize());
		
		
		
		
		
	}

}
