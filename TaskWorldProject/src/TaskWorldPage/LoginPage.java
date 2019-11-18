package TaskWorldPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
public class LoginPage {
WebDriver driver;
public LoginPage(WebDriver driver){
this.driver=driver;
}
//Using FindBy for locating elements
@FindBy(how=How.XPATH, using="//input[@placeholder='Email address']") WebElement emailTextBox;
@FindBy(how=How.XPATH, using="//input[@placeholder='Password']") WebElement passwordTextBox;
@FindBy(how=How.XPATH, using="//button[@class='tw-button --size-42px --padding-normal --full-width ax-login-form__login-button']") WebElement signinButton;

// Defining all the user actions (Methods) that can be performed for user login on page
 
// This method is to set Email in the email text box
public void setEmail(String strEmail){
   emailTextBox.sendKeys(strEmail);
}
// This method is to set Password in the password text box
public void setPassword(String strPassword){
    passwordTextBox.sendKeys(strPassword);
}
// This method is to click on Login Button
public void clickOnLoginButton(){
   signinButton.click();
}

}
