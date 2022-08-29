
package appiumcyp;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class CreatTaskPage extends PageBase{

	public CreatTaskPage(AppiumDriver appiumDriver) {
		super(appiumDriver);
		// TODO Auto-generated constructor stub
	}
	@AndroidFindBy(id = "editTextTitre")
	MobileElement taskNameTxt;
	@AndroidFindBy(id= "editTextNote")
	MobileElement taskDescTxt;
	@AndroidFindBy(id = "action_save")
	MobileElement  saveBtn;


	public void  enterTaskName(String taskName) {
		clear(taskNameTxt);
		sendrtxt(taskNameTxt, taskName);

	}
	public void  enterTaskDesc(String DescName) {
		clear(taskDescTxt);
		sendrtxt(taskDescTxt, DescName);

	}
	public void saveBtn() {
		clic(saveBtn);
	}
}
