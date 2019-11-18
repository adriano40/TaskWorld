package TaskWorldTest;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import TaskWorldPage.LoginPage;

//Base Class for initialize driver
public class Base_Class {
public   WebDriver driver;

@BeforeSuite

@Test
public void initialize() throws IOException{
//Location of chrome driver exe file	
System.setProperty("webdriver.chrome.driver", "C:\\Selenium Files\\chromedriver.exe");
//initialize chrome driver
driver = new ChromeDriver();
//To open web page 
driver.get("https://enterprise.taskworld.com");
//To maximize browser
driver.manage().window().maximize();
//Implicit wait
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//To enter user name and password and Login
LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
loginpage.setEmail("adrianobtest@gmail.com");
loginpage.setPassword("adranko318");
loginpage.clickOnLoginButton();
//Assert LoginPage url
String actual = driver.getCurrentUrl();
Assert.assertEquals(actual, "https://enterprise.taskworld.com/login");

}

   
@AfterSuite
//Test cleanup
public void TeardownTest()
{
driver.quit();
}
}
