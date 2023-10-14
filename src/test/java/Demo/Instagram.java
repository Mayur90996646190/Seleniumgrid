package Demo;

import org.testng.annotations.Test;

import Generic.BaseClass;
import Generic.BaseClass1;

public class Instagram extends BaseClass{
	@Test
	public void InstaTest() throws Throwable {
		driver.get("http://www.instagram.com");
		Thread.sleep(3000);	
		driver.close();
	}
}
