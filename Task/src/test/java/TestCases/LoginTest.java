package TestCases;

import Pages.AccountPage;
import Pages.HomePage;
import TestBase.WebTestBase;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LoginTest extends WebTestBase {
    public HomePage homePage;           //Creating the object of HomePage
    public AccountPage accountPage;         //Creating the object of Accountpage
    @BeforeMethod
    public void prequest(){
        instilization();
        accountPage=new AccountPage();
        homePage=new HomePage();
    }
    @Test(description = "Verify the user is Sign in ")
    public void login(){
        SoftAssert softAssert=new SoftAssert();             //Using softAssert to verify Succesfully Login
        homePage.SignIn(prop.getProperty("username"),(prop.getProperty("password")));
softAssert.assertEquals(accountPage.homePageTex(),"Dashboard","Dashboard is visible");
   softAssert.assertAll();
    }
    @AfterMethod                                 //Closing the Browser
    public void teardown() {
        driver.close();
    }

}
