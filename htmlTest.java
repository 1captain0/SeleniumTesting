package selenium.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class htmlTest {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/Users/mekev/Downloads/chromedriver_win32/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();		
		
		String baseUrl="file:///C:/Users/mekev/Downloads/selenium-main/selenium-main/WorkingWithForms.html";
		
		driver.get(baseUrl);
		
		driver.findElement(By.id("txtUserName")).sendKeys("Kevin");
		driver.findElement(By.name("txtPwd")).sendKeys("kev@001");
		driver.findElement(By.className("Format")).sendKeys("kev@001");
		driver.findElement(By.name("txtLN")).sendKeys("Benny");
		driver.findElement(By.cssSelector("input.Format1")).sendKeys("Kevin");
		driver.findElement(By.cssSelector("input[value='Male']")).click();
		driver.findElement(By.id("DOB")).sendKeys("06/11/2000");
		driver.findElement(By.id("txtEmail")).sendKeys("kevin@a.com");
		
		Select drpcity = new Select(driver.findElement(By.name("City")));
		drpcity.selectByVisibleText("Mumbai");
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr[11]/td[2]/input")).sendKeys("4856985478");
		
		List <WebElement> ele = driver.findElements(By.name("chkHobbies"));
		
		for(WebElement el:ele) {
			el.click();
		}
		
		Boolean b = driver.getPageSource().contains("Email Registration");
		if(b) {
			System.out.println("Heading is as expected");
		}
		else {
			System.out.println("Heading is not as expected");
		}
		
		System.out.println("Page URL is = "+driver.getCurrentUrl());
		
		//driver.findElement(By.name("submit")).click();
		
		//driver.close();
	}
}
