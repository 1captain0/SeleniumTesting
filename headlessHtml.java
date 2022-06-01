package selenium.test2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;


public class headlessHtml {
	public static void main(String[] args) {
		HtmlUnitDriver driver = new HtmlUnitDriver();
		driver.get("https://www.google.com");
		
		System.out.println("Page title : "+driver.getTitle());
		
		WebElement searchbox = driver.findElement(By.name("q"));
		searchbox.sendKeys("Selenium");
		
		WebElement button = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]"));
		button.click();
		
		System.out.println("Page title : "+driver.getTitle());
	}
}
