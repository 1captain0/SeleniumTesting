package selenium.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/Users/mekev/Downloads/chromedriver_win32/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();		
		
		String baseUrl="file:///C:/Users/mekev/Downloads/selenium-main/selenium-main/PopupWin.html";
		
		driver.get(baseUrl);
		String parentwindow = driver.getWindowHandle().toString();
		
		
		try {
			driver.findElement(By.name("Open")).click();
			driver.switchTo().window("PopupWindow");
			Thread.sleep(5000);
			driver.close();
			Thread.sleep(2000);
			driver.switchTo().window(parentwindow);
			driver.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
