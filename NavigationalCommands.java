package SeleniumHindi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationalCommands {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rediff.com/");
		
		driver.navigate().to("https://money.rediff.com/index.html");
		
		driver.navigate().to("https://workmail.rediff.com/?sc_cid=inhome");
		System.out.println("Current url:" + driver.getCurrentUrl());
		
		driver.navigate().back();
		System.out.println("Current Url" + driver.getCurrentUrl());
		
		driver.navigate().forward();
		System.out.println("Current Url : " + driver.getCurrentUrl() );
		
		driver.navigate().refresh();

	}

}
