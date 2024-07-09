package Pages;

import TestBase.WebTestBase;
import Utility.WebdriverUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.net.IDN;

public class HomePage extends WebTestBase {
    @FindBy(xpath = "//input[@id='mat-input-0']")           //xpath of email text box
    WebElement emailTextBox;
    @FindBy(xpath = "//input[@id='mat-input-1']")
WebElement passwordTextbox;                         //xpath of the password textbox
    @FindBy(id = "kt_login_signin_submit")
    WebElement loginBtn;                    //xpath of the login button
    public HomePage(){
        PageFactory.initElements(driver,this);
    }
public void SignIn(String userName,String password){

    WebdriverUtil.sendkeysByMethod(emailTextBox,userName);
    WebdriverUtil.sendkeysByMethod(passwordTextbox,password);
   WebdriverUtil.waitUntilElementIsClickable(loginBtn);
    }

}
