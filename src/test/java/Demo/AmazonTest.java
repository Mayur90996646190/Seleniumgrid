package Demo;

import org.testng.annotations.Test;

import Generic.BaseClass;

public class AmazonTest extends BaseClass{
	@Test
	public void amazonTest() {
		driver.get("https://www.Amazon.in/");
		driver.close();
	}
}
