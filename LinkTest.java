package automation.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LinkTest {

	@Test
	
	public void linkTestExample() throws InterruptedException {
	    WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	    driver.findElement(By.linkText("I'ii help you prepare for your next QA job - Explore the QA Career Accelerator.")).click();
	    Thread.sleep(5000);
	    driver.close();
	}
	    
}
