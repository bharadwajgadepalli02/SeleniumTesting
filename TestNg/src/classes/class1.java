package classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class class1 {
	WebDriver d;
  @BeforeTest
  public void open_browser() {
	  System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
	  d=new ChromeDriver();
	  d.get("https://www.amazon.com/");
	  d.manage().window().maximize();
  }
  @Test(priority=2)
  public void get_title() {
	  System.out.println(d.getTitle());
  }
}
