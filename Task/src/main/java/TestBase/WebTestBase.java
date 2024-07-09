package TestBase;

import Utility.WebdriverUtil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class WebTestBase {

    public Properties prop;
    public static WebDriver driver;
    public  WebTestBase()  {
        FileInputStream fileInputStream=null;
        try{
            fileInputStream =new FileInputStream ( System.getProperty("user.dir")+"/src/main/resources/Properties/Config.properties");
        }catch (Exception e ){
            e.printStackTrace();
        }


        prop=new Properties();
        try {
            prop.load(fileInputStream);
        }catch (IOException e){
            throw new RuntimeException(e);
        }
    }
    public void instilization(){
        String browser =prop.getProperty("browserName");
        if (browser.equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//src//main//resources//Drivers//chromedriver.exe");
            driver=new ChromeDriver();
        }else {
            throw new RuntimeException("Not available");
        }
        driver.get(prop.getProperty("url"));
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(WebdriverUtil.PAGE_LOAD_TIMEOUT));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(WebdriverUtil.IMPLICIT_WAIT));
    }

}
