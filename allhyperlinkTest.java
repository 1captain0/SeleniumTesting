package selenium.test2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class allhyperlinkTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:/Users/mekev/Downloads/geckodriver-v0.31.0-win64/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.gmail.com");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		List<WebElement> linkElements = driver.findElements(By.tagName("a"));
		String[] linkTexts = new String[linkElements.size()];
		
		int i=0;
		for(WebElement e : linkElements) {
			linkTexts[i] = e.getText();
			System.out.println("Hyper link "+i+" is : "+linkTexts[i]);
			i += 1;
		}
		
		for(String l : linkTexts) {
			driver.findElement(By.linkText(l)).click();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.navigate().back();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}
		driver.close();

	}

}
