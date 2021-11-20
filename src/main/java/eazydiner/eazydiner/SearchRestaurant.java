package eazydiner.eazydiner;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchRestaurant {
	@Test
	private void RestaurantSearch() throws InterruptedException
    {
	
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--disable-notifications");
	System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
	WebDriver driver = new ChromeDriver(options);
     driver.manage().window().maximize();


driver.get("https://www.eazydiner.com/delhi-ncr?loc=connaught-place-central-delhi");
//driver.findElement(By.xpath("//*[@id=\"srchbar\"]")).click();	
//driver.findElement(By.xpath("//*[@data-city=\"Chennai\"]")).click();
driver.findElement(By.xpath("//*[@id=\"home-search\"]")).sendKeys("Bombay Brasserie" + Keys.ENTER);
//driver.findElement(By.xpath("//*[@id=\"home-search\"]")).click();
Thread.sleep(300);
WebElement element =driver.findElement(By.xpath("//span[text()=\"Search\"]"));
JavascriptExecutor executor = (JavascriptExecutor) driver;
executor.executeScript("arguments[0].click();", element);
String s=driver.findElement(By.xpath("//h2[@class=\"font-20 bold grey\"]")).getText();
//verification
Assert.assertEquals("Bombay Brasserie", s);
System.out.println(s);
}
}
