package selenium.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class passwordTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/Users/mekev/Downloads/chromedriver_win32/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();		
		
		String baseUrl="file:///C:/Users/mekev/Downloads/selenium-main/selenium-main/WorkingWithForms.html";
		
		driver.get(baseUrl);
		driver.findElement(By.name("txtPwd")).sendKeys("kev@001");
		driver.findElement(By.className("Format")).sendKeys("kev@002");
		
		driver.findElement(By.name("submit")).click();
		
		String message = driver.switchTo().alert().getText();
		if(message.equals("Passwords donot match!")) {
			System.out.println("Alert is displayed");
			driver.switchTo().alert().accept();
			driver.findElement(By.name("txtPwd")).clear();
			driver.findElement(By.className("Format")).clear();
			driver.findElement(By.name("txtPwd")).sendKeys("kev@001");
			driver.findElement(By.className("Format")).sendKeys("kev@001");
		}
		else {
			System.out.println("Alert message not displayed, need to fix defect");
		}
		
		//String alertMessage;

	}

}
