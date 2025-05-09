package SeleniumHindi;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getMethods {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		//1.Using get method
		driver.get("https://rediff.com/");
		driver.manage().window().maximize();
		
		//2.Get current url
		System.out.println("The current url is:"+ driver.getCurrentUrl());
		
		//3. Get complete page source
		//System.out.println(driver.getPageSource());
		
		//4.Get all link text 
		driver.findElement(By.linkText("Rediffmail")).click();
		
	   //5// Get title of page
		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);
		
		//6. Get single window handle
		String win1= driver.getWindowHandle();
		System.out.println("WindowId : "+win1);
		
		//7. Get multiple window Handles
		 driver.findElement(By.linkText("Enterprise Email")).click();
		Set<String> allWin1 = driver.getWindowHandles();
		System.out.println(allWin1);

	}

}
