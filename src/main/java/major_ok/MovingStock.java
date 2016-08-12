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
public class MovingStock extends TestBase {

    /** check  overview.  ID:TRP_RAIL_R&V_MovingStock_TablewView_VehicleResources_01*/
    @Test
    public void checkOverview () throws Exception {
        UserLogon.withAdmin(driver);
        NavigateAction.NavigateToRailCar(driver);
        NavigateAction.NavigateToTab(driver, "RESOURCE VISIBILITY");
        NavigateAction.NavigateToSubtab(driver, "RESOURCE VISIBILITY", "MOVING STOCK");
        Thread.sleep(2000);

        WebElement map_view= util.waitToBeClickable(driver,"xpath","//*[contains(@title,'Map View')]");
        map_view.click();
        Thread.sleep(2000);

        WebElement Load_and_Discharge= util.waitToBeClickable(driver,"xpath","//li[contains(@id,'loadDischarge')]");
        Load_and_Discharge.click();
        Thread.sleep(2000);

        WebElement VehicleResourceTab= util.waitToBeClickable(driver,"xpath","//li[contains(@id,'vehicleResourceTab')]");
        VehicleResourceTab.click();
        Thread.sleep(2000);
    }

    /** check location filter & resource filter.  ID:TRP_RAIL_R&V_MovingStock_TablewView_VehicleResources_02*/
    @Test
    public void checkLRFilter () throws Exception {
        UserLogon.withAdmin(driver);
        NavigateAction.NavigateToRailCar(driver);
        NavigateAction.NavigateToTab(driver, "RESOURCE VISIBILITY");
        NavigateAction.NavigateToSubtab(driver, "RESOURCE VISIBILITY", "MOVING STOCK");
        Thread.sleep(10000);

        //make sure don't move the mouse during the test
        Actions action = new Actions(driver);
        WebElement locationFilter_input2= util.waitToBeClickable(driver,"xpath","//input[contains(@id,'locationFilter-input')]");
        // locationFilter_input2.clear();
        action.moveToElement(locationFilter_input2).build().perform();
        Thread.sleep(10000);

        //change Location Filter
        WebElement locationFilter_input= util.waitToBeClickable(driver,"xpath","//input[contains(@id,'locationFilter-input')]");
        locationFilter_input.clear();
        Thread.sleep(2000);
        WebElement locationFilter_icon= util.waitToBeClickable(driver,"xpath","//img[contains(@id,'locationFilter-icon')]");
        locationFilter_icon.click();
        Thread.sleep(2000);
        WebElement locationFilter_n1= util.waitToBeClickable(driver,"xpath","//td[contains(@id,'table-rows-row0-col0')]");
        locationFilter_n1.click();
        Thread.sleep(2000);
        WebElement LF_OK= util.waitToBeClickable(driver,"xpath","//*[contains(text(),'OK')]");
        LF_OK.click();
        Thread.sleep(2000);

        //make sure don't move the mouse during the test
        Actions action2 = new Actions(driver);
        WebElement resourceFilter_input2= util.waitToBeClickable(driver,"xpath","//input[contains(@id,'resourceFilter-input')]");
        // locationFilter_input2.clear();
        action2.moveToElement(resourceFilter_input2).build().perform();
        Thread.sleep(10000);

        //change Resource Filter
        WebElement ResourceFilter_input= util.waitToBeClickable(driver,"xpath","//input[contains(@id,'resourceFilter-input')]");
        ResourceFilter_input.clear();
        Thread.sleep(2000);
        WebElement ResourceFilter_icon= util.waitToBeClickable(driver,"xpath","//img[contains(@id,'resourceFilter-icon')]");
        ResourceFilter_icon.click();
        Thread.sleep(2000);
        WebElement ResourceFilter_n1= util.waitToBeClickable(driver,"xpath","//td[contains(@id,'table-rows-row0-col0')]");
        ResourceFilter_n1.click();
        Thread.sleep(2000);
        WebElement RF_OK= util.waitToBeClickable(driver,"xpath","//*[contains(text(),'OK')]");
        RF_OK.click();
        Thread.sleep(2000);

        Thread.sleep(2000);
    }

    /** check filter by & resource filter.  ID:TRP_Rail_R&V_MovingStock_TablewView_VehicleResources_03*/
    @Test
    public void checkFilterBy () throws Exception {
        UserLogon.withAdmin(driver);
        NavigateAction.NavigateToRailCar(driver);
        NavigateAction.NavigateToTab(driver, "RESOURCE VISIBILITY");
        NavigateAction.NavigateToSubtab(driver, "RESOURCE VISIBILITY", "MOVING STOCK");
        Thread.sleep(2000);

        try {
            //  WebElement ENDDATE = util.waitToBeClickable(driver, "xpath", "//*[@id=\"__xmlview3--endDate-icon\"]");
            WebElement filterby = util.waitToBeClickable(driver, "xpath", "//input[contains(@id,'timeFilterBy-input')]");
            filterby.clear();
            Thread.sleep(2000);
            // WebElement ENDDATE_end = util.waitToBeClickable(driver, "xpath", "//*[@id=\"__xmlview3--endDate-cal--Month0-20160902\"]");
            WebElement filterby_icon = util.waitToBeClickable(driver, "xpath", "//*[contains(@id,'timeFilterBy-icon')]");
            filterby_icon.click();
            Thread.sleep(2000);
            WebElement Departure_Time = util.waitToBeClickable(driver, "xpath", "//*[contains(@title,'Departure Time')]");
            Departure_Time.click();
            Thread.sleep(5000);

        }
        catch (Exception e)
        {
            //  WebElement EXTENDING = util.waitToBeClickable(driver, "xpath", "//*[@id=\"__xmlview3--toolbar-mn\"]");
            WebElement EXTENDING = util.waitToBeClickable(driver, "xpath", "//*[contains(@id,'toolbar-mn')]");
            EXTENDING.click();
            Thread.sleep(2000);

            //   WebElement ENDDATE = util.waitToBeClickable(driver, "xpath", "//*[@id=\"__xmlview3--endDate-icon\"]");
            WebElement filterby = util.waitToBeClickable(driver, "xpath", "//input[contains(@id,'timeFilterBy-input')]");
            filterby.clear();
            Thread.sleep(2000);
            // WebElement ENDDATE_end = util.waitToBeClickable(driver, "xpath", "//*[@id=\"__xmlview3--endDate-cal--Month0-20160902\"]");
            WebElement filterby_icon = util.waitToBeClickable(driver, "xpath", "//*[contains(@id,'timeFilterBy-icon')]");
            filterby_icon.click();
            Thread.sleep(2000);

            WebElement Departure_Time = util.waitToBeClickable(driver, "xpath", "//*[contains(@title,'Departure Time')]");
            Departure_Time.click();
            Thread.sleep(5000);
        }

        try {

            WebElement filterby = util.waitToBeClickable(driver, "xpath", "//input[contains(@id,'timeFilterBy-input')]");
            filterby.clear();
            Thread.sleep(2000);

            WebElement filterby_icon = util.waitToBeClickable(driver, "xpath", "//*[contains(@id,'timeFilterBy-icon')]");
            filterby_icon.click();
            Thread.sleep(2000);
            WebElement Departure_Time = util.waitToBeClickable(driver, "xpath", "//*[contains(@title,'Planned Arrival Time')]");
            Departure_Time.click();
            Thread.sleep(5000);

        }
        catch (Exception e)
        {

            WebElement EXTENDING = util.waitToBeClickable(driver, "xpath", "//*[contains(@id,'toolbar-mn')]");
            EXTENDING.click();
            Thread.sleep(2000);

            WebElement filterby = util.waitToBeClickable(driver, "xpath", "//input[contains(@id,'timeFilterBy-input')]");
            filterby.clear();
            Thread.sleep(2000);

            WebElement filterby_icon = util.waitToBeClickable(driver, "xpath", "//*[contains(@id,'timeFilterBy-icon')]");
            filterby_icon.click();
            Thread.sleep(2000);

            WebElement Departure_Time = util.waitToBeClickable(driver, "xpath", "//*[contains(@title,'Planned Arrival Time')]");
            Departure_Time.click();
            Thread.sleep(5000);
        }

        Thread.sleep(2000);

    }

    /** check facet filter & resource filter.  ID:TRP_Rail_R&V_MovingStock_TablewView_VehicleResources_04*/
    @Test
    public void checkFacetFilter () throws Exception {
        UserLogon.withAdmin(driver);
        NavigateAction.NavigateToRailCar(driver);
        NavigateAction.NavigateToTab(driver, "RESOURCE VISIBILITY");
        NavigateAction.NavigateToSubtab(driver, "RESOURCE VISIBILITY", "MOVING STOCK");
        Thread.sleep(2000);

        WebElement Facetfilter= util.waitToBeClickable(driver,"xpath","//*[contains(@title,'Filters')]");
        Facetfilter.click();
        Thread.sleep(2000);
        Thread.sleep(2000);

    }


    /** check Column Setting Button.  ID:TRP_Rail_R&V_MovingStock_TablewView_VehicleResources_05*/
    @Test
    public void checkColumnSettingButton () throws Exception {
        UserLogon.withAdmin(driver);
        NavigateAction.NavigateToRailCar(driver);
        NavigateAction.NavigateToTab(driver, "RESOURCE VISIBILITY");
        NavigateAction.NavigateToSubtab(driver, "RESOURCE VISIBILITY", "MOVING STOCK");
        Thread.sleep(2000);

        WebElement SettingButton= util.waitToBeClickable(driver,"xpath","//*[contains(@title,'Configure Table Layout')]");
        SettingButton.click();
        Thread.sleep(2000);

        WebElement StandardColumns= util.waitToBeClickable(driver,"xpath","//*[contains(@id,'staticColumnsSelectAll')]");
        boolean isselected=StandardColumns.isSelected();
        if(isselected != true) {
            StandardColumns.click();
        }
        Thread.sleep(2000);

        WebElement ExtendedColumns= util.waitToBeClickable(driver,"xpath","//*[contains(@id,'extendedColumnsSelectAll')]");
        isselected=ExtendedColumns.isSelected();
        if(isselected != true) {
            ExtendedColumns.click();
        }
        Thread.sleep(2000);

        WebElement Restore_to_Default= util.waitToBeClickable(driver,"xpath","//*[contains(text(),'Restore to Default')]");
        Restore_to_Default.click();
        Thread.sleep(5000);

        WebElement RF_OK= util.waitToBeClickable(driver,"xpath","//*[contains(text(),'OK')]");
        RF_OK.click();
        Thread.sleep(2000);

        Thread.sleep(2000);

    }

    /** Check Planned Stops display.  ID:TRP_Rail_R&V_MovingStock_TablewView_VehicleResources_06*/
    @Test
    /*undone need specific test data to verify*/
    public void checkPlannedStopsDisplay () throws Exception {
        UserLogon.withAdmin(driver);
        NavigateAction.NavigateToRailCar(driver);
        NavigateAction.NavigateToTab(driver, "RESOURCE VISIBILITY");
        NavigateAction.NavigateToSubtab(driver, "RESOURCE VISIBILITY", "MOVING STOCK");
        Thread.sleep(2000);

        Thread.sleep(2000);

    }

    /** Check stock hyperlink display.  ID:TRP_Rail_R&V_MovingStock_TablewView_VehicleResources_07*/
    @Test
    /*undone need test data to verify*/
    public void checkStockHyperlinkDisplay () throws Exception {
        UserLogon.withAdmin(driver);
        NavigateAction.NavigateToRailCar(driver);
        NavigateAction.NavigateToTab(driver, "RESOURCE VISIBILITY");
        NavigateAction.NavigateToSubtab(driver, "RESOURCE VISIBILITY", "MOVING STOCK");
        Thread.sleep(2000);

        Thread.sleep(2000);

    }

    /** LoadAndDischarg Overview.  ID:TRP_RAIL_R&V_MovingStock_TablewView_LoadAndDischarg_01*/
    @Test
    /*need specific test data to verify*/
    public void loadAndDischargeOverview () throws Exception {
        UserLogon.withAdmin(driver);
        NavigateAction.NavigateToRailCar(driver);
        NavigateAction.NavigateToTab(driver, "RESOURCE VISIBILITY");
        NavigateAction.NavigateToSubtab(driver, "RESOURCE VISIBILITY", "MOVING STOCK");
        Thread.sleep(2000);

        WebElement Load_and_Discharge= util.waitToBeClickable(driver,"xpath","//li[contains(@id,'loadDischarge')]");
        Load_and_Discharge.click();
        Thread.sleep(2000);

        try {
            //  WebElement ENDDATE = util.waitToBeClickable(driver, "xpath", "//*[@id=\"__xmlview3--endDate-icon\"]");
            WebElement filterby = util.waitToBeClickable(driver, "xpath", "//input[contains(@id,'timeFilterBy-input')]");
            filterby.clear();
            Thread.sleep(2000);
            // WebElement ENDDATE_end = util.waitToBeClickable(driver, "xpath", "//*[@id=\"__xmlview3--endDate-cal--Month0-20160902\"]");
            WebElement filterby_icon = util.waitToBeClickable(driver, "xpath", "//*[contains(@id,'timeFilterBy-icon')]");
            filterby_icon.click();
            Thread.sleep(2000);
            WebElement Departure_Time = util.waitToBeClickable(driver, "xpath", "//*[contains(@title,'Departure Time')]");
            Departure_Time.click();
            Thread.sleep(5000);

        }
        catch (Exception e)
        {
            //  WebElement EXTENDING = util.waitToBeClickable(driver, "xpath", "//*[@id=\"__xmlview3--toolbar-mn\"]");
            WebElement EXTENDING = util.waitToBeClickable(driver, "xpath", "//*[contains(@id,'toolbar-mn')]");
            EXTENDING.click();
            Thread.sleep(2000);

            //   WebElement ENDDATE = util.waitToBeClickable(driver, "xpath", "//*[@id=\"__xmlview3--endDate-icon\"]");
            WebElement filterby = util.waitToBeClickable(driver, "xpath", "//input[contains(@id,'timeFilterBy-input')]");
            filterby.clear();
            Thread.sleep(2000);
            // WebElement ENDDATE_end = util.waitToBeClickable(driver, "xpath", "//*[@id=\"__xmlview3--endDate-cal--Month0-20160902\"]");
            WebElement filterby_icon = util.waitToBeClickable(driver, "xpath", "//*[contains(@id,'timeFilterBy-icon')]");
            filterby_icon.click();
            Thread.sleep(2000);

            WebElement Departure_Time = util.waitToBeClickable(driver, "xpath", "//*[contains(@title,'Departure Time')]");
            Departure_Time.click();
            Thread.sleep(5000);
        }

        /*problem: no planned arrival time */
        /*in the email the planned arrival time is removed*/
        /*
        try {
            WebElement filterby = util.waitToBeClickable(driver, "xpath", "//input[contains(@id,'timeFilterBy-input')]");
            filterby.clear();
            Thread.sleep(2000);

            WebElement filterby_icon = util.waitToBeClickable(driver, "xpath", "//*[contains(@id,'timeFilterBy-icon')]");
            filterby_icon.click();
            Thread.sleep(2000);
            WebElement Departure_Time = util.waitToBeClickable(driver, "xpath", "//*[contains(@title,'Planned Arrival Time')]");
            Departure_Time.click();
            Thread.sleep(5000);

        }
        catch (Exception e)
        {
            WebElement EXTENDING = util.waitToBeClickable(driver, "xpath", "//*[contains(@id,'toolbar-mn')]");
            EXTENDING.click();
            Thread.sleep(2000);

            WebElement filterby = util.waitToBeClickable(driver, "xpath", "//input[contains(@id,'timeFilterBy-input')]");
            filterby.clear();
            Thread.sleep(2000);

            WebElement filterby_icon = util.waitToBeClickable(driver, "xpath", "//*[contains(@id,'timeFilterBy-icon')]");
            filterby_icon.click();
            Thread.sleep(2000);

            WebElement Departure_Time = util.waitToBeClickable(driver, "xpath", "//*[contains(@title,'Planned Arrival Time')]");
            Departure_Time.click();
            Thread.sleep(5000);
        }
*/
        Thread.sleep(2000);
    }

    /** check location filter & resource filter for LoadAndDischarg.  ID:TRP_RAIL_R&V_MovingStock_TablewView_LoadAndDischarg_02*/
    @Test
    /**/
    public void checkLRFilterForLoadAndDischarge () throws Exception {
        UserLogon.withAdmin(driver);
        NavigateAction.NavigateToRailCar(driver);
        NavigateAction.NavigateToTab(driver, "RESOURCE VISIBILITY");
        NavigateAction.NavigateToSubtab(driver, "RESOURCE VISIBILITY", "MOVING STOCK");
        Thread.sleep(2000);

        WebElement Load_and_Discharge= util.waitToBeClickable(driver,"xpath","//li[contains(@id,'loadDischarge')]");
        Load_and_Discharge.click();
        Thread.sleep(2000);

        //make sure don't move the mouse during the test
        Actions action = new Actions(driver);
        WebElement locationFilter_input2= util.waitToBeClickable(driver,"xpath","//input[contains(@id,'locationFilter-input')]");
        // locationFilter_input2.clear();
        action.moveToElement(locationFilter_input2).build().perform();
        Thread.sleep(10000);

        //change Location Filter
        WebElement locationFilter_input= util.waitToBeClickable(driver,"xpath","//input[contains(@id,'locationFilter-input')]");
        locationFilter_input.clear();
        Thread.sleep(2000);
        WebElement locationFilter_icon= util.waitToBeClickable(driver,"xpath","//img[contains(@id,'locationFilter-icon')]");
        locationFilter_icon.click();
        Thread.sleep(2000);
        WebElement locationFilter_n1= util.waitToBeClickable(driver,"xpath","//td[contains(@id,'table-rows-row0-col0')]");
        locationFilter_n1.click();
        Thread.sleep(2000);
        WebElement LF_OK= util.waitToBeClickable(driver,"xpath","//*[contains(text(),'OK')]");
        LF_OK.click();
        Thread.sleep(2000);

        //make sure don't move the mouse during the test
        Actions action2 = new Actions(driver);
        WebElement resourceFilter_input2= util.waitToBeClickable(driver,"xpath","//input[contains(@id,'resourceFilter-input')]");
        // locationFilter_input2.clear();
        action2.moveToElement(resourceFilter_input2).build().perform();
        Thread.sleep(10000);

        //change Resource Filter
        WebElement ResourceFilter_input= util.waitToBeClickable(driver,"xpath","//input[contains(@id,'resourceFilter-input')]");
        ResourceFilter_input.clear();
        Thread.sleep(2000);
        WebElement ResourceFilter_icon= util.waitToBeClickable(driver,"xpath","//img[contains(@id,'resourceFilter-icon')]");
        ResourceFilter_icon.click();
        Thread.sleep(2000);
        WebElement ResourceFilter_n1= util.waitToBeClickable(driver,"xpath","//td[contains(@id,'table-rows-row0-col0')]");
        ResourceFilter_n1.click();
        Thread.sleep(2000);
        WebElement RF_OK= util.waitToBeClickable(driver,"xpath","//*[contains(text(),'OK')]");
        RF_OK.click();
        Thread.sleep(2000);

        Thread.sleep(2000);

    }

    /** check facet filter.  ID:TRP_Rail_R&V_MovingStock_TablewView_LoadAndDischarge_03*/
    @Test
    /*No */
    public void checkFacetFilterLoadAndDischarge () throws Exception {
        UserLogon.withAdmin(driver);
        NavigateAction.NavigateToRailCar(driver);
        NavigateAction.NavigateToTab(driver, "RESOURCE VISIBILITY");
        NavigateAction.NavigateToSubtab(driver, "RESOURCE VISIBILITY", "MOVING STOCK");
        Thread.sleep(2000);

        WebElement Load_and_Discharge= util.waitToBeClickable(driver,"xpath","//li[contains(@id,'loadDischarge')]");
        Load_and_Discharge.click();
        Thread.sleep(2000);

        WebElement Facetfilter= util.waitToBeClickable(driver,"xpath","//*[contains(@title,'Filters')]");
        Facetfilter.click();
        Thread.sleep(2000);
        Thread.sleep(2000);

        /*No filter data*/

    }

    /** Freight Order hyperlink.  ID:TRP_Rail_R&V_MovingStock_TablewView_LoadAndDischarge_03*/
    @Test
    /*No Freight Booking data*/
    public void freightOrderHyperlinkLoadAndDischarge () throws Exception {
        UserLogon.withAdmin(driver);
        NavigateAction.NavigateToRailCar(driver);
        NavigateAction.NavigateToTab(driver, "RESOURCE VISIBILITY");
        NavigateAction.NavigateToSubtab(driver, "RESOURCE VISIBILITY", "MOVING STOCK");
        Thread.sleep(2000);

        WebElement Load_and_Discharge= util.waitToBeClickable(driver,"xpath","//li[contains(@id,'loadDischarge')]");
        Load_and_Discharge.click();
        Thread.sleep(2000);

        Thread.sleep(2000);

        /*No filter data*/
    }
}
