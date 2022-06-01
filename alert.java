package selenium.test;

//import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;

public class alert {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:/Users/mekev/Downloads/chromedriver_win32/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();		
		
		String baseUrl="file:///C:/Users/mekev/Downloads/selenium-main/selenium-main/AlertExample.html";
		
		driver.get(baseUrl);
		String alertMessage;
		
		try {
			driver.findElement(By.name("btnAlert")).click();
			alertMessage = driver.switchTo().alert().getText();
			Thread.sleep(2000);
			driver.switchTo().alert().accept();
			Thread.sleep(2000);
			driver.close();
			System.out.println(alertMessage);
		}
		catch(Exception e){
			
		}
		
		
		driver.close();

	}

}
