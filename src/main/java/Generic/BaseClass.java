package Generic;

import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;


public class BaseClass {
	public RemoteWebDriver driver;
	@Parameters("BROWSER")
	@BeforeClass
	public void config(String BROWSER) throws Throwable {
		URL url = new URL("http://192.168.134.15:5555/wd/hub");
		DesiredCapabilities cap = new DesiredCapabilities();
		if(BROWSER.equalsIgnoreCase("chrome")) {
			cap.setPlatform(Platform.WINDOWS);
			cap.setBrowserName("chrome");
		}else if(BROWSER.equalsIgnoreCase("firefox")) {
			cap.setPlatform(Platform.WINDOWS);
			cap.setBrowserName("firefox");
		}
		else if(BROWSER.equalsIgnoreCase("edge"))
		{
			cap.setPlatform(Platform.WINDOWS);
			cap.setBrowserName("edge");
		}
		driver = new RemoteWebDriver(url, cap);
	}
}
