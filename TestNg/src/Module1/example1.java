package Module1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class example1 {
	@BeforeClass
	  public void login() {
		  System.out.println("Welcome to amazon");
	  }
	  @Test
	  public void operation() {
		  System.out.println("First session class");
	  }
	  @AfterClass
	  public void logout() {
		  System.out.println("Application close");
	  }
}
