package pageAction;

/**
 * Created by I331490 on 6/23/2016.
 */
import Utility.Para;
import Utility.util;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;


public class UserLogon extends TestBase {


    @BeforeMethod(dependsOnMethods = {"TestBase.beforeMethod"})
    @Parameters()
    public static void withAdmin(WebDriver driver) throws Exception{

        //String URL1 = "http://10.58.184.216:8001/sap/tm/trp/ui/#/home";
        driver.get(Para.URL);
        // WebElement user = util.waitToBeVisible(driver,"xpath","/html/body/div[2]/div[1]/div[1]/div[1]/div[2]/section[1]/div[1]/div[3]/div[1]/input[1]");
        WebElement user = util.waitToBeClickable(driver,"xpath","//input[1]");
       // WebElement user = util.waitToBeClickable(driver,"xpath","//*[@id=\"xs_username-inner\"]");

        //*[@id="xs_username-inner"]
        //*[@id="xs_password-inner"]
        //WebElement user = util.waitToBeClickable(driver,"id","xs_username-inner");
        //WebElement user = driver.findElement(By.id("xs_username-inner"));
        // if (user == null) throw new AssertionError();
        user.sendKeys("TRPADM");
        util.delay(Para.shortDelay);

        WebElement pwd = driver.findElement(By.id("xs_password-inner"));
        pwd.sendKeys("Abcd1234");
        util.delay(Para.shortDelay);

        WebElement logon = driver.findElement(By.id("logon_button"));
        logon.click();
        util.delay(Para.longDelay);
        driver.switchTo().defaultContent();//??
        util.delay(Para.longDelay);

    }

    public static void withNWBC(WebDriver driver) throws Exception{

        //String URL1 = "http://10.58.184.216:8001/sap/tm/trp/ui/#/home";
        driver.get("https://ldcix0m.wdf.sap.corp:44311/nwbc/%2fSCMTMS%2fTRANSPORTATION_MGR_V2/?sap-client=800&sap-language=EN&sap-nwbc-node=root");
        // WebElement user = util.waitToBeVisible(driver,"xpath","/html/body/div[2]/div[1]/div[1]/div[1]/div[2]/section[1]/div[1]/div[3]/div[1]/input[1]");
        WebElement user = util.waitToBeClickable(driver,"xpath","//input[contains(@id,'sap-user')]");
        //WebElement user = driver.findElement(By.id("xs_username-inner"));
        // if (user == null) throw new AssertionError();
        user.sendKeys("i067095");
        util.delay(Para.shortDelay);
        WebElement pwd = util.waitToBeClickable(driver,"xpath","//input[contains(@id,'sap-password')]");
        // WebElement pwd = driver.findElement(By.id("xs_password-inner"));
        pwd.sendKeys("Abcd1234");
        util.delay(Para.shortDelay);

        WebElement logon = driver.findElement(By.id("LOGON_BUTTON"));
        logon.click();
        util.delay(Para.longDelay);
        // driver.switchTo().defaultContent();//??
        //util.delay(Para.longDelay);

    }
    public static void withOther(WebDriver driver, String URL, String User, String Password) throws Exception{

        driver.navigate().to(URL);
        WebElement user = driver.findElement(By.id("xs_username-inner"));
        user.sendKeys(User);
        util.delay(Para.shortDelay);

        WebElement pwd = driver.findElement(By.id("xs_password-inner"));
        pwd.sendKeys(Password);
        util.delay(Para.shortDelay);

        WebElement logon = driver.findElement(By.id("logon_button"));
        logon.click();
        util.delay(Para.longDelay);
        driver.switchTo().defaultContent();
        util.delay(Para.longDelay);

    }
}
