package automation.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Lunchfacebook {
	
	@Test
	public void browser() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[@aria-label='Create new account']")).click();
		Thread.sleep(3000);
		boolean surnameDispleyed = driver.findElement(By.xpath("//label[text()='Surname']")).isDisplayed();
		if(surnameDispleyed) {
			System.out.println("Surname is displayed");
		}
		else {
			System.out.println("Surname is not displayed");
		}
		}
		
	}

