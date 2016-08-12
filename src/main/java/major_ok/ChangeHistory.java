package major_ok;

import Utility.util;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pageAction.NavigateAction;
import pageAction.TestBase;
import pageAction.UserLogon;

/**
 * Created by I331490 on 7/4/2016.
 */
public class ChangeHistory extends TestBase {
    /** check getting data from location filter.  ID:TRP_R&V_ChangeHistory_FilterSearch_01*/
    @Test
    public void checkGetDataByLocationFilter () throws Exception {
        UserLogon.withAdmin(driver);
        NavigateAction.NavigateToRailCar(driver);
        //System.out.println("Get driver");
        NavigateAction.NavigateToTab(driver, "RESOURCE VISIBILITY");
       // System.out.println("Get re_vi");
        NavigateAction.NavigateToSubtab(driver, "RESOURCE VISIBILITY", "Change History");

        //contains(@id,'startDate-icon')
        WebElement FROMDATE = util.waitToBeClickable(driver,"xpath","//*[contains(@id,'startDate-icon')]");
        // WebElement FROMDATE = util.waitToBeClickable(driver,"xpath","//*[@id=\"__xmlview3--startDate-icon\"]");
        FROMDATE.click();
        Thread.sleep(2000);
        WebElement FROMDATE_start = util.waitToBeClickable(driver,"xpath","//*[contains(@id,'startDate-cal--Month0-20150902')]");
        FROMDATE_start.click();
        Thread.sleep(2000);

        try {
            //  WebElement ENDDATE = util.waitToBeClickable(driver, "xpath", "//*[@id=\"__xmlview3--endDate-icon\"]");
            WebElement ENDDATE = util.waitToBeClickable(driver, "xpath", "//*[contains(@id,'endDate-icon')]");
            ENDDATE.click();
            Thread.sleep(2000);
            // WebElement ENDDATE_end = util.waitToBeClickable(driver, "xpath", "//*[@id=\"__xmlview3--endDate-cal--Month0-20160902\"]");
            WebElement ENDDATE_end = util.waitToBeClickable(driver, "xpath", "//*[contains(@id,'endDate-cal--Month0-20160902')]");
            ENDDATE_end.click();
            Thread.sleep(2000);
        }
        catch (Exception e)
        {
            //  WebElement EXTENDING = util.waitToBeClickable(driver, "xpath", "//*[@id=\"__xmlview3--toolbar-mn\"]");
            WebElement EXTENDING = util.waitToBeClickable(driver, "xpath", "//*[contains(@id,'toolbar-mn')]");
            EXTENDING.click();
            Thread.sleep(2000);

            //   WebElement ENDDATE = util.waitToBeClickable(driver, "xpath", "//*[@id=\"__xmlview3--endDate-icon\"]");
            WebElement ENDDATE = util.waitToBeClickable(driver, "xpath", "//*[contains(@id,'endDate-icon')]");
            ENDDATE.click();
            Thread.sleep(2000);
            //  WebElement ENDDATE_end = util.waitToBeClickable(driver, "xpath", "//*[@id=\"__xmlview3--endDate-cal--Month0-20160902\"]");
            WebElement ENDDATE_end = util.waitToBeClickable(driver, "xpath", "//*[contains(@id,'endDate-cal--Month0-20160902')]");
            ENDDATE_end.click();
            Thread.sleep(2000);
        }

        WebElement locationFilter = util.waitToBeClickable(driver,"xpath","//input[contains(@id,'locationFilter-input')]");
        locationFilter.clear();
        Thread.sleep(2000);

        //*[@id="__xmlview3--locationFilter-icon"]
        //    WebElement locationFilter_img=util.waitToBeClickable(driver,"xpath","//*[@id=\"__xmlview3--locationFilter-icon\"]");
        WebElement locationFilter_img=util.waitToBeClickable(driver,"xpath","//*[contains(@id,'locationFilter-icon')]");
        locationFilter_img.click();
        WebElement choose_location_filter=util.waitToBeClickable(driver,"xpath","//*[contains(@id,'col0-row1')]");
        choose_location_filter.click();
        Thread.sleep(2000);
        // WebElement ok_button=util.waitToBeClickable(driver,"xpath","//button[contains(text(),'OK')]");
        WebElement ok_button=util.waitToBeClickable(driver,"xpath","//*[contains(@id,'locationFilterValueHelpDialog')]//button[contains(text(),'OK')]");
        ok_button.click();
        Thread.sleep(2000);

    }


    /** Check get data by resource filter.  ID:TRP_R&V_ChangeHistory_FilterSearch_02*/
    @Test
    public void checkGetDataByResourceFilter () throws Exception {
        UserLogon.withAdmin(driver);
        NavigateAction.NavigateToRailCar(driver);
        NavigateAction.NavigateToTab(driver, "RESOURCE VISIBILITY");
        NavigateAction.NavigateToSubtab(driver, "RESOURCE VISIBILITY", "Change History");

        //contains(@id,'startDate-icon')
        WebElement FROMDATE = util.waitToBeClickable(driver,"xpath","//*[contains(@id,'startDate-icon')]");
        // WebElement FROMDATE = util.waitToBeClickable(driver,"xpath","//*[@id=\"__xmlview3--startDate-icon\"]");
        FROMDATE.click();
        Thread.sleep(2000);
        WebElement FROMDATE_start = util.waitToBeClickable(driver,"xpath","//*[contains(@id,'startDate-cal--Month0-20150902')]");
        FROMDATE_start.click();
        Thread.sleep(2000);

        try {
            //  WebElement ENDDATE = util.waitToBeClickable(driver, "xpath", "//*[@id=\"__xmlview3--endDate-icon\"]");
            WebElement ENDDATE = util.waitToBeClickable(driver, "xpath", "//*[contains(@id,'endDate-icon')]");
            ENDDATE.click();
            Thread.sleep(2000);
            // WebElement ENDDATE_end = util.waitToBeClickable(driver, "xpath", "//*[@id=\"__xmlview3--endDate-cal--Month0-20160902\"]");
            WebElement ENDDATE_end = util.waitToBeClickable(driver, "xpath", "//*[contains(@id,'endDate-cal--Month0-20160902')]");
            ENDDATE_end.click();
            Thread.sleep(2000);
        }
        catch (Exception e)
        {
            //  WebElement EXTENDING = util.waitToBeClickable(driver, "xpath", "//*[@id=\"__xmlview3--toolbar-mn\"]");
            WebElement EXTENDING = util.waitToBeClickable(driver, "xpath", "//*[contains(@id,'toolbar-mn')]");
            EXTENDING.click();
            Thread.sleep(2000);

            //   WebElement ENDDATE = util.waitToBeClickable(driver, "xpath", "//*[@id=\"__xmlview3--endDate-icon\"]");
            WebElement ENDDATE = util.waitToBeClickable(driver, "xpath", "//*[contains(@id,'endDate-icon')]");
            ENDDATE.click();
            Thread.sleep(2000);
            //  WebElement ENDDATE_end = util.waitToBeClickable(driver, "xpath", "//*[@id=\"__xmlview3--endDate-cal--Month0-20160902\"]");
            WebElement ENDDATE_end = util.waitToBeClickable(driver, "xpath", "//*[contains(@id,'endDate-cal--Month0-20160902')]");
            ENDDATE_end.click();
            Thread.sleep(2000);
        }

        WebElement resourceFilter = util.waitToBeClickable(driver,"xpath","//input[contains(@id,'resourceFilter-input')]");
        resourceFilter.clear();
        Thread.sleep(2000);

        //*[@id="__xmlview3--locationFilter-icon"]
        //    WebElement locationFilter_img=util.waitToBeClickable(driver,"xpath","//*[@id=\"__xmlview3--locationFilter-icon\"]");
        WebElement resourceFilter_img=util.waitToBeClickable(driver,"xpath","//*[contains(@id,'resourceFilter-icon')]");
        resourceFilter_img.click();
        WebElement choose_resource_filter=util.waitToBeClickable(driver,"xpath","//*[contains(@id,'col0-row9')]");
        choose_resource_filter.click();
        Thread.sleep(2000);
        // WebElement ok_button=util.waitToBeClickable(driver,"xpath","//button[contains(text(),'OK')]");
        WebElement ok_button=util.waitToBeClickable(driver,"xpath","//*[contains(@id,'resourceFilterValueHelpDialog')]//button[contains(text(),'OK')]");
        ok_button.click();
        Thread.sleep(2000);

    }

    /** Check get data by calendar filter.  ID:TRP_R&V_ChangeHistory_FilterSearch_03*/
    @Test
    public void checkGetDataByCalendarFilter () throws Exception {
        UserLogon.withAdmin(driver);
        NavigateAction.NavigateToRailCar(driver);
        NavigateAction.NavigateToTab(driver, "RESOURCE VISIBILITY");
        NavigateAction.NavigateToSubtab(driver, "RESOURCE VISIBILITY", "Change History");
        WebElement FROMDATE = util.waitToBeClickable(driver,"xpath","//*[contains(@id,'startDate-icon')]");
        // WebElement FROMDATE = util.waitToBeClickable(driver,"xpath","//*[@id=\"__xmlview3--startDate-icon\"]");
        FROMDATE.click();
        Thread.sleep(2000);
        WebElement FROMDATE_start = util.waitToBeClickable(driver,"xpath","//*[contains(@id,'startDate-cal--Month0-20150902')]");
        FROMDATE_start.click();
        Thread.sleep(2000);

        try {
            //  WebElement ENDDATE = util.waitToBeClickable(driver, "xpath", "//*[@id=\"__xmlview3--endDate-icon\"]");
            WebElement ENDDATE = util.waitToBeClickable(driver, "xpath", "//*[contains(@id,'endDate-icon')]");
            ENDDATE.click();
            Thread.sleep(2000);
            // WebElement ENDDATE_end = util.waitToBeClickable(driver, "xpath", "//*[@id=\"__xmlview3--endDate-cal--Month0-20160902\"]");
            WebElement ENDDATE_end = util.waitToBeClickable(driver, "xpath", "//*[contains(@id,'endDate-cal--Month0-20160902')]");
            ENDDATE_end.click();
            Thread.sleep(2000);
        }
        catch (Exception e)
        {
            //  WebElement EXTENDING = util.waitToBeClickable(driver, "xpath", "//*[@id=\"__xmlview3--toolbar-mn\"]");
            WebElement EXTENDING = util.waitToBeClickable(driver, "xpath", "//*[contains(@id,'toolbar-mn')]");
            EXTENDING.click();
            Thread.sleep(2000);

            //   WebElement ENDDATE = util.waitToBeClickable(driver, "xpath", "//*[@id=\"__xmlview3--endDate-icon\"]");
            WebElement ENDDATE = util.waitToBeClickable(driver, "xpath", "//*[contains(@id,'endDate-icon')]");
            ENDDATE.click();
            Thread.sleep(2000);
            //  WebElement ENDDATE_end = util.waitToBeClickable(driver, "xpath", "//*[@id=\"__xmlview3--endDate-cal--Month0-20160902\"]");
            WebElement ENDDATE_end = util.waitToBeClickable(driver, "xpath", "//*[contains(@id,'endDate-cal--Month0-20160902')]");
            ENDDATE_end.click();
            Thread.sleep(2000);
        }

    }

    /** Table view sort / filter.  ID:TRP_R&V_ChangeHistory_FilterSearch_04*/

    /* not done */
    @Test
    public void tableViewSortFilter () throws Exception {
        UserLogon.withAdmin(driver);
        NavigateAction.NavigateToRailCar(driver);
        NavigateAction.NavigateToTab(driver, "RESOURCE VISIBILITY");
        NavigateAction.NavigateToSubtab(driver, "RESOURCE VISIBILITY", "Change History");

    }

}
