package eazydiner.eazydiner;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Help {
	@Test
	public void testHelpTC() {


    	ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(options);
         driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		// load URL
		driver.get("https://www.eazydiner.com/");

		// click on help 
		WebElement element = driver.findElement(By.xpath("//span[@id='help']"));
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", element);

		// get the title
		String title = driver.getTitle();

		// verify that contact page is displayed or not
		Assert.assertEquals("Contact Us | EazyDiner", title);
	}

}
