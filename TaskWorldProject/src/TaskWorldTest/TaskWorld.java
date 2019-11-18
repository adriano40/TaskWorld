package TaskWorldTest;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import TaskWorldPage.HomePage;

public class TaskWorld extends Base_Class { 


	
//Create new project
@Test (priority=1)
public void Create_Project() throws InterruptedException {
	
   HomePage homepage = PageFactory.initElements(driver, HomePage.class);
   homepage.Project_Button();
   homepage.Project_Textbox("test1");
   homepage.Create_Button();
   //Assert new project name
   String actual = driver.findElement(By.xpath("//div[@class='tw-editable-textfield__text'][contains(text(),'test1')]")).getText();
   Assert.assertEquals(actual, "test1");

}
//Create new task list in the project
@Test (priority=2)
public void Create_Tasklist() {
	
	HomePage homepage = PageFactory.initElements(driver, HomePage.class);
    homepage.Add_Tasklist_Textbox("new tasklist");
    homepage.Tasklist_Enter();
    //Assert new task list in project
    String actual = driver.findElement(By.xpath("//div[@class='tw-editable-textfield__text'][contains(text(),'new tasklist')]")).getText();
    Assert.assertEquals(actual, "new tasklist");
}
//Add new task to the task list
@Test (priority=3)
public void Add_Task()  {
	
    HomePage homepage = PageFactory.initElements(driver, HomePage.class);
    homepage.Add_Task_Button();
    homepage.Add_Task_Textbox("new task");
     //Assert new task in task list
    String actual = driver.findElement(By.xpath("//textarea[@placeholder='Create a new task']")).getText();
    Assert.assertEquals(actual, "new task");
    homepage.Add_Task_Enter();
}
//The mark task as completed and open completed task to see its details
@Test (priority=4)
public void Completed_Task() throws InterruptedException {
	
	HomePage homepage = PageFactory.initElements(driver, HomePage.class);
	homepage.Completed();
	homepage.Completed_Checkbox();
	
	//Assert completed task
	String actual =driver.findElement(By.xpath("//span[@class='tw-task-completed-stat__message-stat']//span[contains(text(),'Completed')]")).getText();
	 Assert.assertEquals(actual, "Completed Today");
 
}

}