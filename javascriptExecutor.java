package test3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class javascriptExecutor {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/Users/mekev/Downloads/chromedriver_win32/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();	
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		
		driver.get("https://en.wikipedia.org/wiki/Main_Page");
		driver.manage().window().maximize();
		
		for(int i=0;i<4;i++) {
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			jse.executeScript("window.scrollBy(0,300)");
			//Thread.sleep(1000);
			
		}

	}

}
