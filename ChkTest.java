package selenium.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChkTest {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/Users/mekev/Downloads/chromedriver_win32/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();		
		
		String baseUrl="https://www.selenium.dev/";
		
		String expectedTitle="Selenium";
		String actualTitle="";
		
		driver.get(baseUrl);
		actualTitle=driver.getTitle();
		
		if(actualTitle.contentEquals(expectedTitle))
		{
			System.out.println("Test Passed");
		}
		else
		{
			System.out.println("Test Failed");
		}
	//driver.close();
	}
}
