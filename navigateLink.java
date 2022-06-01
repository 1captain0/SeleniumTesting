package selenium.test2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigateLink {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/Users/mekev/Downloads/chromedriver_win32/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		String url = "file:///C:/Users/mekev/Downloads/selenium-main/selenium-main/WorkingWithForms.html";
		driver.get(url);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.linkText("navigate to google.com")).click();
		System.out.println("Page title is : "+driver.getTitle());
		driver.navigate().back();
		driver.manage().window().setPosition(new Point(100,100));

	}

}
