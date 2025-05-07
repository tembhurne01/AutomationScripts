package SeleniumHindi;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagName_Locator {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://rediff.com/");
		
		//Find all links present in landing page
		List<WebElement> allList = driver.findElements(By.tagName("a"));
		System.out.println("The number of list on Webpage are: " + allList.size());
		
		//get all the links name
		for(int i=0; i<allList.size();i++) {
			System.out.println(allList.get(i).getText());
		}

	}

}
