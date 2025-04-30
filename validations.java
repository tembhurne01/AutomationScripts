package SeleniumHindi;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class validations {

	public static void main(String[] args) {
    //1. Launch a browser:	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.rediff.com/");
	driver.manage().window().maximize();
	
	System.out.println("The title of website: " + driver.getTitle());
	String ExpectedTile=  "Rediff.com: News | Rediffmail | Stock Quotes | Rediff Gurus";
	String ActualTitle = driver.getTitle();
	
	if(ActualTitle.equals(ExpectedTile)) {
		System.out.println("Test Case is pass");
	}else {
		System.out.println("Test Case Fail");
	}
	
	System.out.println("The current url:" + driver.getCurrentUrl());

	 //2. Validating Current url
	 String ActualUrl = driver.getCurrentUrl();
	 String ExpectedUrl = "https://www.rediff.com/";
	 if(ActualUrl.equals(ExpectedUrl)) {
		 System.out.println("Url test case is pass");
	 }else {
		 System.out.println("Url test case is failed");
	 }
		

	}

}
