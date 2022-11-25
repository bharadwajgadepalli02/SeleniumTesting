package Module1;

//import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class example {
  @BeforeMethod
  public void login() {
	  System.out.println("Welcome to amazon Before Method");
  }
  @Test
  public void operation() {
	  System.out.println("First session method");
  }
  @AfterMethod
  public void logout() {
	  System.out.println("Application close After Method");
  }
}
