package classes;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class class3 extends class2 {
	@Test(priority=5)
	  public void screenshot() throws IOException {
		  File a = ((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		  FileUtils.copyFile(a,new File("C://Chakradhar//ts.png"));
	  }
	  @AfterTest
	  public void close_browser() {
		  d.close();
	  }
}
