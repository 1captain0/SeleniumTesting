package selenium.test2;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;

public class phantomTest {

	public static void main(String[] args) {
		System.setProperty("phantomjs.binary.path", "C:/Users/mekev/Downloads/phantomjs-2.1.1-windows/phantomjs-2.1.1-windows/bin/phantomjs.exe");
		
		WebDriver driver=new PhantomJSDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
	}

}
