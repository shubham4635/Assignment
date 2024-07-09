package TestCases;

import Pages.AccountPage;
import Pages.CoustmerPage;
import Pages.HomePage;
import Pages.UserPage;
import TestBase.WebTestBase;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddingCoustmer extends WebTestBase {
    public HomePage homePage;   //Creating the object of Homepage
    public AccountPage accountPage;         //Creating the object of Accountpage
    public CoustmerPage coustmerPage;           //Creating the object of Coustmerpage
    public UserPage userPage;
    @BeforeMethod
    public void prequest(){
        instilization();
        homePage=new HomePage();
        userPage=new UserPage();
        accountPage=new AccountPage();
        coustmerPage=new CoustmerPage();
    }
@Test(description = "Creating A new Coustmer")
    public void NewCoustmer(){
    homePage.SignIn(prop.getProperty("username"),(prop.getProperty("password"))); // Sending the Username and Password
coustmerPage.coustmerClick();                                           //Clicking on the Coustmer DashBoard
coustmerPage.createNewCoustmer();                       //Creating new Coustmer
coustmerPage.CoustmerInfo(prop.getProperty("LeaadName"),(prop.getProperty("RefNumber") ));      // Sending the Details of coustmer
coustmerPage.primaryInfo(prop.getProperty("CpersonName"),(prop.getProperty("Mnumber")));
coustmerPage.primary1(prop.getProperty("TelephoneNumber"),(prop.getProperty("CDestinatio")),(prop.getProperty("EmailAdd")));
coustmerPage.Actions((prop.getProperty("CCountry")),(prop.getProperty("CState")),
        prop.getProperty("CCity"),(prop.getProperty("CLocality")),(prop.getProperty("CPincode")));


    }
    @AfterMethod                                                //Closing the Browser
    public void teardown() {
        driver.close();
    }

}

