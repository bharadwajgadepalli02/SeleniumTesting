package multipleclasse;

import org.testng.annotations.Test;

public class class1 {
  @Test(priority=1)
  public void login() {
	  System.out.println("Application opened");
  }
  @Test(priority=2)
  public void custdetails() {
	  System.out.println("Customer Details updated");
  }
  @Test(priority=3)
  public void productdetails() {
	  System.out.println("product details updated");
  }
}
