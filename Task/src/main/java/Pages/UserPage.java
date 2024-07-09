package Pages;

import TestBase.WebTestBase;
import Utility.WebdriverUtil;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class UserPage extends WebTestBase {
    @FindBy(xpath = "//div[@id='kt_header']/kt-topbar/div/kt-user-punch/div/div[2]/button")
    WebElement punchInBtn;
    public UserPage(){
        PageFactory.initElements(driver,this);
    }
public void PunchInClick(){
    WebdriverUtil.waitUntilElementIsClickable(punchInBtn);
    Alert alert=driver.switchTo().alert();
    alert.accept();                                     //First Alert Accepted
    Alert alert1=driver.switchTo().alert();
    alert1.accept();                                    //Second Alert Accepted

    }
}
