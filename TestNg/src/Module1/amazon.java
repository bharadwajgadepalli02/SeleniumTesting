package Module1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class amazon {
	WebDriver d;
  @BeforeMethod
  public void open_browser() {
	  System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
	  d=new ChromeDriver();
	  d.get("https://www.amazon.com/");
	  d.manage().window().maximize();
  }
  @Test(priority=1)
  public void get_title() {
	  System.out.println(d.getTitle());
  }
  @Test(priority=2)
  public void get_url() {
	  System.out.println(d.getCurrentUrl());
  }
  @Test(priority=3)
  public void screenshot() throws IOException {
	  File a = ((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
	  FileUtils.copyFile(a,new File("C://Chakradhar//ts.png"));
  }
  @AfterMethod
  public void close_browser() {
	  d.close();
  }
}
