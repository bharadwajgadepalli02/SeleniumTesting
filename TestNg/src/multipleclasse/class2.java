package multipleclasse;

import org.testng.annotations.Test;

public class class2 extends class1 {
  @Test(priority=4)
  public void paymentdetails() {
	  System.out.println("Payment completed");
  }
  @Test(priority=5)
  public void rating() {
	  System.out.println("Rating given");
  }
}
