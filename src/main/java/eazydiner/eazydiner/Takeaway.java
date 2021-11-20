package eazydiner.eazydiner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Takeaway {
	
	public static void main( String[] args )
    {
    	ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(options);
         driver.manage().window().maximize();


driver.get("https://www.eazydiner.com/delhi-ncr?loc=connaught-place-central-delhi");
driver.findElement(By.xpath("//a[@href=\"https://www.eazydiner.com/restaurants?location=connaught-place-central-delhi&deal_types[]=delivery&tags[]=delivery_offer\"]")).click();
driver.findElement(By.xpath("//a[@href=\"/delhi-ncr/mamagoto-khan-market-110146\"]")).click();


driver.findElement(By.xpath("//div[text()=\"Delivery\"]")).click();
driver.findElement(By.xpath("//button[@data-product=\"459839\"]")).click();
System.out.println(driver.findElement(By.xpath("//div[@class=\"orderSum w-6-12 w-lg-4-12 bg-white margin-l-20 padding-15 showEl\"]")).getText());
//driver.findElement(By.xpath("//button[text()=\"Login to Continue\"]")).click();

//driver.findElement(By.xpath("//input[@name=\"mobile\"]")).sendKeys("89764523");

    }

}
