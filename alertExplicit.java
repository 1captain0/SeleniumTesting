package selenium.test2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class alertExplicit {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:/Users/mekev/Downloads/geckodriver-v0.31.0-win64/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("file:///C:/Users/mekev/Downloads/selenium-main/selenium-main/WorkingWithForms.html");
		
		driver.findElement(By.id("txtPassword")).sendKeys("kevin12");
		driver.findElement(By.id("txtConfPassword")).sendKeys("kevin123");
		driver.findElement(By.className("Format")).sendKeys(Keys.TAB);
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.alertIsPresent());
		
		String msg = driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		
		wait.until(ExpectedConditions.elementToBeClickable(By.name("submit")));
		driver.findElement(By.name("submit")).click();
		
		System.out.println(msg);

	}

}
