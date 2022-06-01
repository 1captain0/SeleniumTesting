package selenium.test2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class firefoxTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:/Users/mekev/Downloads/geckodriver-v0.31.0-win64/geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.selenium.dev/");
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		System.out.println("Page title : "+driver.getTitle());

	}

}
