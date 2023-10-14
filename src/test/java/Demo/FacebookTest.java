package Demo;

import org.testng.annotations.Test;

import Generic.BaseClass;

public class FacebookTest extends BaseClass {
	@Test
	public void facebookTest() {
		driver.get("https://www.facebook.com/");
		driver.close();
	}
}
