package automation.selenium;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class SeleniumAxisExample extends IDExample{
	
	@Test
	public void axisexample() {
		int a[];
		String[] str;
		//collections
		//list
		//set
		List<String> strlist = new ArrayList<>();
		strlist.add("suresh");
		strlist.add("testing");
		strlist.add("reddy");
		//String text = driver.findElement(By.xpath("//table[@id='product']//tbody//tr[2]//td")).getText();
		System.out.println(strlist);

	}
	
}
