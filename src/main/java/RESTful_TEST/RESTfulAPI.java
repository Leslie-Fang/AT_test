package RESTful_TEST;

import Utility.Para;
import Utility.util;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


/**
 * Created by I331490 on 7/15/2016.
 */
public class RESTfulAPI {
    public WebDriver driver;

    @Test
    public void TestRESTfulAPI() throws Exception{
        System.setProperty("webdriver.chrome.driver", Para.chromeDriverPath);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        util.delay(Para.shortDelay);
        //driver.get("https://ldcix0m.wdf.sap.corp:44311/nwbc/%2fSCMTMS%2fTRANSPORTATION_MGR_V2/?sap-client=800&sap-language=EN&sap-nwbc-node=root");
        driver.get("https://www.baidu.com");
        util.delay(Para.shortDelay);
        driver.quit();

    }


}
