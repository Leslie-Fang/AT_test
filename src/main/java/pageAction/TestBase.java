package pageAction;

import Utility.Para;
import Utility.util;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class TestBase {
    public WebDriver driver;


    public WebDriver getDriver() {
        return driver;
    }

    @BeforeMethod
    public void beforeMethod() throws Exception {
        //System.out.println("This is before method");

        //chrome driver
        System.out.println("This is before method");
        System.setProperty("webdriver.chrome.driver", Para.chromeDriverPath);
       // System.setProperty("webdriver.chrome.driver","/home/han/selenium-testNG/chromedriver.exe");
        //System.out.println(System.getProperty("webdriver.chrome.driver"));
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        util.delay(Para.shortDelay);

        //firefox driver
     //   System.setProperty("webdriver.firefox.bin", "C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
        //System.setProperty("webdriver.firefox.bin", "/usr/bin/firefox");
     //   driver = new FirefoxDriver();
      //  FirefoxProfile profile = new FirefoxProfile();
      //  profile.setEnableNativeEvents(true);
      //  driver = new FirefoxDriver(profile);
        //driver.manage().window().maximize();
        //util.delay(Para.shortDelay);
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("This is an after method");
        //driver.close();
        driver.quit();
    }
}
