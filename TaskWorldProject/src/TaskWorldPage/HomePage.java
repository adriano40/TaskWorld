package TaskWorldPage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
 
public class HomePage {
WebDriver driver;

//Using FindBy for locating elements
@FindBy(how=How.XPATH, using="//div[@class='tw-button__main-container']//span[contains(text(),'New Project')]") WebElement Newproject_Button;
@FindBy(how=How.XPATH, using="//input[@placeholder='e.g. Website design']") WebElement NewProject_Textbox;
@FindBy(how=How.XPATH, using="//span[contains(text(),'Next: Choose a template')]") WebElement Next_Button;
@FindBy(how=How.XPATH, using="//div[contains(text(),'Create Project')]") WebElement Create_Button;
@FindBy(how=How.XPATH, using="//input[@placeholder='Tasklist title']") WebElement Tasklist_Textbox;
@FindBy(how=How.XPATH, using="//input[@placeholder='Tasklist title']") WebElement Return_Keys;
@FindBy(how=How.XPATH, using="//div[@class='tw-click-area tw-tasklist-header__add-icon ax-add-task-button']//i[@class='tw-icon tw-icon-add --name_add']") WebElement TaskList_Task_Button;
@FindBy(how=How.XPATH, using="//textarea[@placeholder='Create a new task']") WebElement Task_Textbox;
@FindBy(how=How.XPATH, using="//textarea[@placeholder='Create a new task']") WebElement Return_Key;
@FindBy(how=How.XPATH, using="//div[@class='tw-button__main-container']//span[contains(text(),'Create')]") WebElement Create_Task;
@FindBy(how=How.XPATH, using="//div[@class='tw-kanban-item tw-tasklist__kanban-item']") WebElement Completed;
@FindBy(how=How.XPATH, using="//div[@class='tw-click-area tw-task-checkbox ax-task-checkbox --size-large']") WebElement Completed_Checkbox;






public HomePage(WebDriver driver){
this.driver=driver;
}

// Defining  the user actions (Methods) that can be performed in the  home page for this task


//This method to click "new project button" for new project creation
public void Project_Button(){
	Newproject_Button.click();
	
}


//This method to add value to  new project name text box
public void Project_Textbox(String task){
	
   NewProject_Textbox.sendKeys(task);
	
}

//This method to click "next and create buttons" for new project creation
public void Create_Button() throws InterruptedException{
	
	Next_Button.click();
	Thread.sleep(10000);
	Create_Button.click();
}

//This method to add value to new task list text box
public void Add_Tasklist_Textbox(String newtasklist){
	Tasklist_Textbox.sendKeys(newtasklist);
	
}
//This method for "enter" keyboard key
public void Tasklist_Enter(){
	
  Return_Keys.sendKeys(Keys.RETURN);
  Return_Keys.sendKeys(Keys.ESCAPE);
}
//This method to click on add task 	for task list button
public void Add_Task_Button(){
	
   //driver.navigate().refresh();
	TaskList_Task_Button.click();
}



//This method to add value to new task list task text box
public void Add_Task_Textbox(String newtask){
	
	Task_Textbox.sendKeys(newtask);
	
}

//This method for click on create task button
public void Add_Task_Enter(){
	
	Create_Task .click();  
}


//This method to complete task and show task details
public void Completed(){
	Completed.click();
	
}        
public void Completed_Checkbox() throws InterruptedException{
	Thread.sleep(10000);
	Completed_Checkbox.click();
} 
}