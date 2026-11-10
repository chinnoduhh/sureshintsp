package automation.selenium;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class IFrames extends annotations {
	
	@Test
	
	public void iframe() {
		        driver.switchTo().frame("courses-iframe");
		        driver.findElement(By.xpath("//a[text()='Courses']")).click();
		
	}

}
