package major_ok;

import Utility.Para;
import Utility.util;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.testng.annotations.Test;
import pageAction.NavigateAction;
import pageAction.TestBase;
import pageAction.UserLogon;

/**
 * Created by I331490 on 6/22/2016.
 */
public class testcase_test extends TestBase {

    @Test
    public void first_test () throws Exception
    {

        /*
       driver.get("http://www.baidu.com");
        WebElement element = driver.findElement(By.id("kw"));
        element.sendKeys("Cheese!");
        element.submit();
        (new WebDriverWait(driver, 10)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getTitle().toLowerCase().startsWith("cheese!");
            }
       });
       */
        UserLogon.withAdmin(driver);
        NavigateAction.NavigateToRailCar(driver);
        NavigateAction.NavigateToTab(driver,"RESOURCE VISIBILITY");
        NavigateAction.NavigateToSubtab(driver,"RESOURCE VISIBILITY","Change History");

        driver.quit();
    }


}
