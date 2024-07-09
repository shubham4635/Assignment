package Pages;

import TestBase.WebTestBase;
import Utility.WebdriverUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountPage extends WebTestBase {
    @FindBy(xpath = "//div[@id='kt_subheader']/div/div/h3")         //Text of user page After login
    WebElement homePageText;

    public AccountPage(){
        PageFactory.initElements(driver,this);
    }
    public String homePageTex(){
        WebdriverUtil.getTextofElement(homePageText);
        return null;

    }


}
