package Module1;

import org.testng.annotations.Test;

public class program1 {
	  @Test(priority=1)
	  public void open_browser() {
		  System.out.println("application opened successfully");
	  }
	  @Test(priority=2)
	  public void Cust_details() {
		  System.out.println("Customer Details successfully updated");
	  }
	  @Test(priority=3)
	  public void Product_details() {
		  System.out.println("Product Details successfully updated");
	  }
	  @Test(priority=5)
	  public void payment_details() {
		  System.out.println("payment through credit card");
	  }
	  @Test(priority=4)
	  public void delivery_process() {
		  System.out.println("Delivered to right address");
	  }
	  @Test(enabled=false)//It skips this method
	  public void feedback_process() {
		  System.out.println("Feedback successfully collected");
	  }
	  @Test(priority=7)
	  public void logoff() {
		  System.out.println("Application successfully closed");
	  }
}
