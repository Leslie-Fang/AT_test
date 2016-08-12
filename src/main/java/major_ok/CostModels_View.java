package major_ok;

import Utility.util;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pageAction.NavigateAction;
import pageAction.TestBase;
import pageAction.UserLogon;

/**
 * Created by I331490 on 7/4/2016.
 */
public class CostModels_View extends TestBase{
    /** Check the Cost Models main table.  ID:TRP-CostModels-View-CM-01*/
    @Test
    public void check_CostModels_Maintable () throws Exception {
        UserLogon.withAdmin(driver);
        NavigateAction.NavigateToRailCar(driver);
        NavigateAction.NavigateToTab(driver, "PLANS");
        NavigateAction.NavigateToSubtab(driver, "PLANS", "Cost Models");
        Thread.sleep(5000);

        Actions action = new Actions(driver);
        WebElement search_box= util.waitToBeClickable(driver,"xpath","//input[contains(@id,'searchbox-tf-input')]");
        // locationFilter_input2.clear();

        action.sendKeys(search_box,"hello").build().perform();
        //action.moveToElement(search_box).build().perform();
        Thread.sleep(10000);

        driver.quit();
    }

}
