package appiumcyp;



import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.cucumber.testng.AbstractTestNGCucumberTests;

public class TestBase extends AbstractTestNGCucumberTests{
	public static AppiumDriver driver;	
	@BeforeTest
		public void Android_setUp() throws MalformedURLException {
		
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "noug");
		caps.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,"com.jeffprod.todo.ActivityMain");
		caps.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,"com.jeffprod.todo");
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),caps);

	}
	@AfterTest
	public void tearDown() {
		if(null != driver) {
			driver.quit();
		}
	}
	

}
