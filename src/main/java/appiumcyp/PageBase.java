package appiumcyp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class PageBase {
	WebDriver driver;
	public static final long WAIT = 15;
	public PageBase(AppiumDriver appiumDriver) {
		PageFactory.initElements(new AppiumFieldDecorator(appiumDriver),this);

		driver= appiumDriver;
	}
	public void waitForVisiblilty(MobileElement element) {

		WebDriverWait wait = new WebDriverWait(driver, WAIT);
		wait.until(ExpectedConditions.visibilityOf(element));

	}
	public void clear(MobileElement element) {
		waitForVisiblilty(element);
		element.clear();
	}
	public void clic(MobileElement element) {
		waitForVisiblilty(element);
		element.click();
	}
	public void sendrtxt(MobileElement element,String text) {
		waitForVisiblilty(element);
		element.sendKeys(text);
	}
	public String getAtrribute(MobileElement element,String attribute) {
		waitForVisiblilty(element);
		return element.getAttribute(attribute);

	}
}