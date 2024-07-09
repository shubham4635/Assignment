package Pages;

import TestBase.WebTestBase;
import Utility.WebdriverUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoustmerPage extends WebTestBase {
    @FindBy(xpath = "//div[@id='kt_aside_menu']/ul/li[2]/a/img")          //Xpath of the coustmer Icon
    WebElement CoustmerIcon;
    @FindBy(xpath = "//div[@id='kt_content']/div/ng-component/kt-customers-list/mat-drawer-container/mat-drawer-content/kt-portlet/div/kt-portlet-header/div[4]/button[1]")
    WebElement newCoustmerBtn;              //xpath of the create a new button
    @FindBy(xpath = "//input[@id='mat-input-66']")
    WebElement CoustmerNameD;               //xpath of the coustmerName textbox
    @FindBy(xpath = "//input[@id='mat-input-67']")
    WebElement coustmerRefno;       //xpath of the RefNo textbox
    @FindBy(xpath ="//input[@id='mat-input-68']")
    WebElement contactPersonName;               ////xpath of the person Name textbox
    @FindBy(xpath = "//input[@id='mat-input-69']")
    WebElement mobileNumber;            //xpath of the mobile no textbox
    @FindBy(xpath = "//input[@id='mat-input-70']")
    WebElement telephoneNo;             //xpath of the Telephone no textbox
    @FindBy(xpath = "//input[@id='mat-input-71']")
    WebElement email;               //xpath of the email textbox
    @FindBy(xpath = "//input[@id='mat-input-72']")
    WebElement destination;             //xpath of the destination textbox
    @FindBy(xpath = "//input[@id='mat-input-73']")
    WebElement address;                 //xpath of the address textbox
    @FindBy(xpath = "//*[@id='mat-dialog-1']/kt-address-dialog/kt-portlet/div/kt-portlet-body/div[2]/button/span")
    WebElement addDoneBtn;                  ////xpath of the Done btn After selecting the address
    @FindBy(xpath = "//mat-select[@id='mat-select-33']/div/div[2]/div")
    WebElement country;     //xpath of the down Arrow of Country textbox
    @FindBy(xpath = "//input[@id='mat-input-74']")
    WebElement countrySearch;           //xpath of Country Search TextBox
    @FindBy(xpath = "//*[@id=\"mat-select-34\"]/div/div[2]")
    WebElement state;           //xpath of the down Arrow of state textbox
    @FindBy(xpath = "//input[@id='mat-input-75']")
    WebElement stateSearch;         //xpath of State Search TextBox
    @FindBy(xpath = "//*[@id='mat-select-35']/div/div[2]/div")
    WebElement city;        //xpath of the down Arrow of City textbox
    @FindBy(xpath = "//input[@id='mat-input-76']")
    WebElement citySearch;          //xpath of State Search TextBox
    @FindBy(xpath = "//*[@id='mat-select-36']/div/div[2]")
    WebElement locality;            //xpath of the down Arrow of Locality textbox
    @FindBy(xpath = "//input[@id='mat-input-77']")
    WebElement localitySearch;              //xpath of locality Search TextBox
    @FindBy(xpath ="//input[@id='mat-input-78']")
    WebElement pincode;             //xpath of the pincode TextBox
    @FindBy(xpath = "//mat-dialog-container[@id='mat-dialog-7']/kt-customers-edit-dialog/div[2]/div/div/div/button[2]/span")
    WebElement savebtn;     //xpath of the savebutton

public CoustmerPage(){
    PageFactory.initElements(driver,this);
}
public void coustmerClick(){
    WebdriverUtil.waitUntilElementIsClickable(CoustmerIcon);
}
public void createNewCoustmer(){
    WebdriverUtil.waitUntilElementIsClickable(newCoustmerBtn);
}
public void CoustmerInfo(String coustmerName,String coustmerRef){
    WebdriverUtil.sendkeysByMethod(CoustmerNameD,coustmerName);
    WebdriverUtil.sendkeysByMethod(coustmerRefno,coustmerRef);
}
public void primaryInfo(String ContactPname,String MobNo) {
    WebdriverUtil.sendkeysByMethod(contactPersonName, ContactPname);
    WebdriverUtil.sendkeysByMethod(mobileNumber, MobNo);
}
public void primary1(String TelephoneNo,String Email,String Destination){
    WebdriverUtil.sendkeysByMethod(telephoneNo, TelephoneNo);
    WebdriverUtil.sendkeysByMethod(email, Email);
    WebdriverUtil.sendkeysByMethod(destination, Destination);
}
    public void Actions(String Country,String State,String City,String Locality,String Pincode){
        Actions a = new Actions(driver);
        a.doubleClick(address).build();
        a.click(addDoneBtn).build().perform();
        a.click(country).build().perform();
        WebdriverUtil.sendkeysByMethod(countrySearch, Country);
        a.click(state).build().perform();
        WebdriverUtil.sendkeysByMethod(stateSearch, State);
        a.click(city).build().perform();
        WebdriverUtil.sendkeysByMethod(citySearch, City);
        a.click(locality).build().perform();
        WebdriverUtil.sendkeysByMethod(localitySearch, Locality);
        WebdriverUtil.sendkeysByMethod(pincode, Pincode);
        WebdriverUtil.waitUntilElementIsClickable(savebtn);
    }
}
