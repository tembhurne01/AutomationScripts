package SeleniumProject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.lang.Thread;

public class ZoomIn_ZoomOut{

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rediff.com/");
		driver.manage().window().maximize();
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		Thread.sleep(3000);
		System.out.println("Zoomin with 250%");
		
		//Zoom-in 200%
		jse.executeScript("document.body.style.zoom='250%'");
		
		System.out.println("Zoom-out 50%");
		jse.executeScript("document.body.style.zoom='50%'");
		Thread.sleep(3000);
		
		System.out.println("Zoom-in 250%");
		jse.executeScript("document.body.style.zoom='280%'");
		
		
	    
		
		

	}

}
