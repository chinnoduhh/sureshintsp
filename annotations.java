package automation.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class annotations {
	
	public WebDriver driver;
	
	//https://rahulshettyacademy.com/AutomationPractice/
	@BeforeMethod
	public void annotations() {
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	}




    @Test
    public void lunchrahul() {
    driver.findElement(By.name("checkBoxOption1")).click();
	driver.findElement(By.name("checkBoxOption2")).click();
	driver.findElement(By.name("checkBoxOption3")).click();
	driver.findElement(By.name("enter-name")).sendKeys("Suresh");
	driver.findElement(By.id("alertbtn")).click();
	driver.switchTo().alert().accept();
	
	}
	
	}
