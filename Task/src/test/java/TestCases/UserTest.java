package TestCases;

import Pages.HomePage;
import Pages.UserPage;
import TestBase.WebTestBase;
import org.openqa.selenium.Alert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class UserTest extends WebTestBase {
    public HomePage homePage;       //Creating the object of HomePage
    public UserPage userPage;   //Creating the object of UserPage
    @BeforeMethod
    public void prequest(){
        instilization();
        homePage=new HomePage();
        userPage=new UserPage();
    }
    @Test(description = "Verify wheather the alerts")
    public void userInterface(){
        homePage.SignIn(prop.getProperty("username"),(prop.getProperty("password")));
userPage.PunchInClick();                        //Verfing the Button is clickable
    }
    @AfterMethod                                                //Closing the Browser
    public void teardown() {
        driver.close();
    }

}

