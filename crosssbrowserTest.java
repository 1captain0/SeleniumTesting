package selenium.test2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class crosssbrowserTest {

	public static void main(String[] args) {
		WebDriver driver = null;
		String browser = "Microsoft Edge";
		
		if(browser.equalsIgnoreCase("FireFox")) {
			System.setProperty("webdriver.gecko.driver", "C:/Users/mekev/Downloads/geckodriver-v0.31.0-win64/geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:/Users/mekev/Downloads/chromedriver_win32/chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("Microsoft Edge")) {
			System.setProperty("webdriver.edge.driver", "C:/Users/mekev/Downloads/edgedriver_win64/msedgedriver.exe");
			driver = new EdgeDriver();
		}
		else {
			System.out.println("No browser is specified");
		}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.com");

	}

}
