package automation.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NameExample extends annotations {
	
	@Test
	
	public void nameExample() {
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.name("checkBoxOption1")).click();
		driver.findElement(By.name("checkBoxOption2")).click();
		driver.findElement(By.name("checkBoxOption3")).click();
		driver.findElement(By.name("enter-name")).sendKeys("Suresh");
		driver.switchTo().alert().accept();
		driver.close();
		
	}

}
