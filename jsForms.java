package test3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class jsForms {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/Users/mekev/Downloads/chromedriver_win32/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/mekev/Downloads/selenium-main/selenium-main/WorkingWithForms.html");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement submit = driver.findElement(By.name("submit"));
		
		driver.findElement(By.id("txtPassword")).sendKeys("kev");
		driver.findElement(By.id("txtConfPassword")).sendKeys("kevin");
		
		js.executeScript("arguments[0].click();", submit);
		
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String s = driver.switchTo().alert().getText();
		System.out.println(s);

	}

}
