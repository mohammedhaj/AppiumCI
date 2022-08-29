package appiumcyp;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class TaskListPage extends PageBase{

	public TaskListPage(AppiumDriver appiumDriver) {
		super(appiumDriver);
		// TODO Auto-generated constructor stub
	}
@AndroidFindBy(id="fab")
MobileElement addTaskBtn;

public void clickAddTaskBtn() {
	clic(addTaskBtn);
}
}
