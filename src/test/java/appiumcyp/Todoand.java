package appiumcyp;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;

import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utils.JsonReader;

public class Todoand extends TestBase{
	CreatTaskPage createTaskPage;
	TaskListPage taskpage;
	@DataProvider(name="Tasck Data")
	public Object[][] passData() throws FileNotFoundException, IOException, ParseException{
		String JSON_path;
		return JsonReader.getSONData(System.getProperty("user.dir")+"/data/task.json","Tasck Data", 2);
	}
	@Test(dataProvider="Tasck Data")
	public void addtask(String taskName,String DescName) throws MalformedURLException {
		Android_setUp();
		taskpage =new TaskListPage(driver);
		createTaskPage=new CreatTaskPage(driver);
		taskpage.clickAddTaskBtn();
		createTaskPage.enterTaskName("cypress");
		createTaskPage.enterTaskDesc("finish cypress");		
		driver.hideKeyboard();
		createTaskPage.saveBtn();
		tearDown();

	}

}
