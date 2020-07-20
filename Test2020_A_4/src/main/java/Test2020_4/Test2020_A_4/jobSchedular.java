package Test2020_4.Test2020_A_4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class jobSchedular {

	@Test
	public void test()
	{
		System.out.println("Testing");
		String path = "C:/geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", path);
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		String d = driver.getTitle().toString().trim();
		System.out.println(d);
	}
	
}
