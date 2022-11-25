package classes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class class2 extends class1 {
	@Test(priority=3)
	  public void get_url() {
		  System.out.println(d.getCurrentUrl());
	  }
	@Test(priority=4)
	public void dropdown() {
//		d.findElement(By.id("searchDropdownBox")).click();
		WebElement a = d.findElement(By.id("searchDropdownBox"));
		List<WebElement> b = a.findElements(By.tagName("option"));
		System.out.println(b.size());
		for(int i=0;i<b.size();i++) {
			System.out.println(b.get(i).getText());
		}
	}
}
