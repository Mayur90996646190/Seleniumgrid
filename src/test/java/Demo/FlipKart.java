package Demo;

import org.testng.annotations.Test;

import Generic.BaseClass;
import Generic.BaseClass1;

public class FlipKart extends BaseClass{
	@Test
	public void flipkartTest() throws Throwable {
		driver.get("https://www.flipkart.com");
		Thread.sleep(3000);
		driver.close();
	}
}
