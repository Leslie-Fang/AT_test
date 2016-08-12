package pageAction;

import Utility.Para;
import Utility.ScreenShot;
import Utility.util;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class NavigateAction {
    //RailCar
    public static  void  NavigateToRailCar(WebDriver driver) throws Exception {

        //WebElement category = util.waitToBeClickable(driver,"xpath","//span[contains(@id,'resourceCategoryId')]");
        WebElement category = util.waitToBeClickable(driver,"xpath","//button[contains(@class,'sapUiBtnIconAndText ')]");

        util.clickAndWait(category,1);
        //WebElement categoryIcon = util.waitToBeClickable(driver,"xpath","//div[contains(@id,'icon')]");
        WebElement categoryIcon = util.waitToBeClickable(driver,"xpath","//div[contains(@class,'sapUiTfComboIcon')]");
        util.clickAndWait(categoryIcon,Para.shortDelay);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        String categoryType= (String ) js.executeScript("var result = sap.ui.getCore().getUIArea(\"content\").getRootControl().getComponentInstance().getModel(\"global\").oData.resourceCategories; for (var i=0;i< result.length;i++) {if(result[i].TYPE == \"RC\"){return result[i].CODE;}}");
        String xpath = "//span[contains(text(),'"+categoryType+"')]";
        WebElement rail = util.waitToBeClickable(driver,"xpath",xpath);
        util.clickAndWait(rail,Para.shortDelay);
    }

    public static  void  NavigateToContainer(WebDriver driver) throws Exception {

        WebElement category = util.waitToBeClickable(driver,"xpath","//span[contains(@id,'resourceCategoryId')]");
        util.clickAndWait(category,1);
        WebElement categoryIcon = util.waitToBeClickable(driver,"xpath","//div[contains(@class,'sapUiTfComboIcon')]");
        util.clickAndWait(categoryIcon,Para.shortDelay);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        String categoryType= (String ) js.executeScript("var result = sap.ui.getCore().getUIArea(\"content\").getRootControl().getComponentInstance().getModel(\"global\").oData.resourceCategories; for (var i=0;i< result.length;i++) {if(result[i].TYPE == \"CN\"){return result[i].CODE;}}");
        String xpath = "//span[contains(text(),'"+categoryType+"')]";
        WebElement rail = util.waitToBeClickable(driver,"xpath",xpath);
        util.clickAndWait(rail,Para.shortDelay);
    }

    //RailCar
    public static void NavigateToTab(WebDriver driver, String tabName) throws Exception {

        try {
            //WebElement allBtn = driver.findElement(By.id("__xmlview0--shell-wsBar-oflt"));
            //allBtn.click();
            //util.delay(5);

            if (tabName.toUpperCase().equals("HOME")) {

                WebElement tab = util.waitToBeClickable(driver,"LINKTEXT","HOME");
                tab.click();

            } else if (tabName.toUpperCase().equals("RESOURCE VISIBILITY")) {

                WebElement tab = util.waitToBeClickable(driver,"LINKTEXT","RESOURCE VISIBILITY");
                tab.click();

            } else if (tabName.toUpperCase().equals("SUPPLY AND DEMAND")) {
                WebElement tab = util.waitToBeClickable(driver,"LINKTEXT","SUPPLY AND DEMAND");
                tab.click();
            } else if (tabName.toUpperCase().equals("KPI")) {
                WebElement tab = util.waitToBeClickable(driver,"LINKTEXT","KPI");
                tab.click();
            } else if (tabName.toUpperCase().equals("PICK-UP AND RETURN")) {
                WebElement tab = util.waitToBeClickable(driver,"LINKTEXT","PICK-UP AND RETURN");
                tab.click();
            } else if (tabName.toUpperCase().equals("RESOURCE BALANCING")) {
                WebElement tab = util.waitToBeClickable(driver,"LINKTEXT","RESOURCE BALANCING");
                tab.click();
            } else if (tabName.toUpperCase().equals("LOCATION SETTINGS")) {
                WebElement tab = util.waitToBeClickable(driver,"LINKTEXT","LOCATION SETTINGS");
                tab.click();

            } else if (tabName.toUpperCase().equals("RESOURCE SETTINGS")) {
                WebElement tab = util.waitToBeClickable(driver,"LINKTEXT","RESOURCE SETTINGS");
                tab.click();

            } else if (tabName.toUpperCase().equals("USERS")) {

                WebElement tab = util.waitToBeClickable(driver,"LINKTEXT","USERS");
                tab.click();

            } else if (tabName.toUpperCase().equals("PLANS")) {

                WebElement tab = util.waitToBeClickable(driver,"LINKTEXT","PLANS");
                tab.click();

            } else if (tabName.toUpperCase().equals("SYSTEM MANAGEMENT")) {

                WebElement tab = util.waitToBeClickable(driver,"LINKTEXT","SYSTEM MANAGEMENT");
                tab.click();

            } else if (tabName.toUpperCase().equals("ARCHIVING")) {
                WebElement tab = util.waitToBeClickable(driver,"LINKTEXT","ARCHIVING");
                tab.click();
            } else {

                System.out.println("Error: Unable to find any workcenter");
            }
            util.delay(Para.shortDelay);

        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    
    //RailCar
    public static void NavigateToSubtab(WebDriver driver, String tabName,
                                        String subtabName) throws Exception {
        // home WoC
        if (tabName.toUpperCase().equals("HOME")) {

            WebElement tab = util.waitToBeClickable(driver,"LINKTEXT","HOME");
            tab.click();
            util.delay(Para.shortDelay);
            // resource visibility WoC
        } else if (tabName.toUpperCase().equals("RESOURCE VISIBILITY")) {
            //WebElement tab = util.waitToBeClickable(driver,"LINKTEXT","RESOURCE VISIBILITY");
            //tab.click();
            //util.delay(Para.shortDelay);
            if (subtabName.toUpperCase().equals("STOCK")) {

                WebElement subtab = util.waitToBeClickable(driver,"LINKTEXT","Stock");
                subtab.click();

            } else if (subtabName.toUpperCase().equals("RESOURCES")) {
                
                WebElement subtab = util.waitToBeClickable(driver,"LINKTEXT","Resources");
                subtab.click();

            } else if (subtabName.toUpperCase().equals("CHANGE HISTORY")) {

                WebElement subtab = util.waitToBeClickable(driver,"LINKTEXT","Change History");
                subtab.click();

            } else if (subtabName.toUpperCase().equals("LEASE CONTRACTS")) {

                WebElement subtab = util.waitToBeClickable(driver,"LINKTEXT","Lease Contracts");
                subtab.click();

            } else if (subtabName.toUpperCase().equals("MOVING STOCK")) {

                WebElement subtab = util.waitToBeClickable(driver,"LINKTEXT","Moving Stock");
                subtab.click();

            } else if (subtabName.toUpperCase().equals("EMPTY BOOKINGS")) {

                WebElement subtab = util.waitToBeClickable(driver,"LINKTEXT","Empty Bookings");
                subtab.click();

            } else {
                System.out.println("Error: Unable to find any tab");

                // take screenshot
                ScreenShot screenShot = new ScreenShot(driver);
                screenShot.takeScreenshot();

            }
            util.delay(Para.shortDelay);

//			// supply and demand WoC
//		} else if (tabName.toUpperCase().equals("SUPPLY AND DEMAND")) {
//			WebElement tab = driver.findElement(By
//					.id("__item1-__xmlview0--shell-2-overflowItem-txt"));
//			String currentName = tab.getText();
//			if (currentName.equals(tabName.toUpperCase())) {
//				System.out.println("you are currently in " + currentName
//						+ " work center");
//			} else {
//				tab.click();
//				System.out.println("Navigate to " + currentName
//						+ " Work Center");
//			}
//			// KPI WoC
//		} else if (tabName.toUpperCase().equals("KPI")) {
//			WebElement tab = driver.findElement(By
//					.id("__item1-__xmlview0--shell-3-overflowItem-txt"));
//			String currentName = tab.getText();
//			if (currentName.equals(tabName.toUpperCase())) {
//				System.out.println("you are currently in " + currentName
//						+ " work center");
//			} else {
//				tab.click();
//				System.out.println("Navigate to " + currentName
//						+ " Work Center");
//			}
            // Pick-up and return WoC
        } else if (tabName.toUpperCase().equals("PICK-UP AND RETURN")) {
            if (subtabName.toUpperCase().equals("LOCATION ASSIGNMENT")) {
                WebElement tab = driver.findElement(By
                        .id("__item0-__item1-__xmlview0--shell-4-0"));
                String currentName = tab.getText();
                if (currentName.equals(tabName.toUpperCase())) {
                    System.out.println("you are currently in " + currentName
                            + " tab");
                } else {
                    tab.click();
                    System.out.println("Navigate to " + currentName + " tab");
                }
            } else if (subtabName.toUpperCase().equals(
                    "PICK-UP/RETURN RULESETS")) {
                WebElement tab = driver.findElement(By
                        .id("__item0-__item1-__xmlview0--shell-4-1"));
                String currentName = tab.getText();
                if (currentName.equals(tabName.toUpperCase())) {
                    System.out.println("you are currently in " + currentName
                            + " tab");
                } else {
                    tab.click();
                    System.out.println("Navigate to " + currentName + " tab");
                }
            } else if (subtabName.toUpperCase().equals(
                    "RULESET EXECUTION HISTORY")) {
                WebElement tab = driver.findElement(By
                        .id("__item0-__item1-__xmlview0--shell-4-2"));
                String currentName = tab.getText();
                if (currentName.equals(tabName.toUpperCase())) {
                    System.out.println("you are currently in " + currentName
                            + " tab");
                } else {
                    tab.click();
                    System.out.println("Navigate to " + currentName + " tab");
                }

            } else {
                System.out.println("Error: Unable to find any tab");

                // take screenshot
                ScreenShot scnShot = new ScreenShot(driver);
                scnShot.takeScreenshot();
            }
            util.delay(Para.shortDelay);

            // Resource Balancing WoC
        } else if (tabName.toUpperCase().equals("RESOURCE BALANCING")) {
            WebElement tab = driver.findElement(By
                    .id("__item1-__xmlview0--shell-5-overflowItem-txt"));
            String currentName = tab.getText();
            if (currentName.equals(tabName.toUpperCase())) {
                System.out.println("you are currently in " + currentName
                        + " work center");
            } else {
                tab.click();
                System.out.println("Navigate to " + currentName
                        + " Work Center");
            }

            // Location Settings WoC
        } else if (tabName.toUpperCase().equals("LOCATION SETTINGS")) {
            if (subtabName.toUpperCase().equals("REGION HIERARCHY")) {

                WebElement subtab = util.waitToBeClickable(driver,"LINKTEXT","Region Hierarchy");
                subtab.click();

            } else if (subtabName.toUpperCase().equals("REGIONS")) {
                WebElement subtab = util.waitToBeClickable(driver,"LINKTEXT","Regions");
                subtab.click();

            } else if (subtabName.toUpperCase().equals("LOCATION GROUPS")) {

                WebElement subtab = util.waitToBeClickable(driver,"LINKTEXT","Location Groups");
                subtab.click();

            } else if (subtabName.toUpperCase().equals("LOCATION FILTERS")) {

                WebElement subtab = util.waitToBeClickable(driver,"LINKTEXT","Location Filters");
                subtab.click();

            } else {
                System.out.println("Error: Unable to find any tab");

                // take screenshot
                ScreenShot screenShot = new ScreenShot(driver);
                screenShot.takeScreenshot();

            }
            util.delay(Para.shortDelay);
        }

        // Resource Settings WoC
        else if (tabName.toUpperCase().equals("RESOURCE SETTINGS")) {
            if (subtabName.toUpperCase().equals("MULTI-ATTRIBUTE FILTERS")) {

                WebElement subtab = util.waitToBeClickable(driver,"LINKTEXT","Multi-Attribute Filters");
                subtab.click();

            } else if (subtabName.toUpperCase().equals("RESOURCE GROUPS")) {

                WebElement subtab = util.waitToBeClickable(driver,"LINKTEXT","Resource Groups");
                subtab.click();

            } else if (subtabName.toUpperCase().equals("RESOURCE FILTERS")) {

                WebElement subtab = util.waitToBeClickable(driver,"LINKTEXT","Resource Filters");
                subtab.click();

            } else if (subtabName.toUpperCase().equals("STOCK SETTINGS FOR LOCATIONS")) {

                WebElement subtab = util.waitToBeClickable(driver,"LINKTEXT","Stock Settings for Locations");
                subtab.click();

            } else if (subtabName.toUpperCase().equals("STOCK SETTINGS FOR REGIONS")) {

                WebElement subtab = util.waitToBeClickable(driver,"LINKTEXT","Stock Settings for regions");
                subtab.click();

            } else if (subtabName.toUpperCase().equals("STOCK SETTINGS FOR LOCATION GROUPS")) {

                WebElement subtab = util.waitToBeClickable(driver,"LINKTEXT","Stock Settings for Location Groups");
                subtab.click();

            } else {
                System.out.println("Error: Unable to find any tab");

                // take screenshot
                ScreenShot screenShot = new ScreenShot(driver);
                screenShot.takeScreenshot();

            }
            util.delay(Para.shortDelay);

            // users WoC
        } else if (tabName.toUpperCase().equals("USERS")) {
            if (subtabName.toUpperCase().equals("ROLES")) {

                WebElement subtab = util.waitToBeClickable(driver,"LINKTEXT","Roles");
                subtab.click();

            } else if (subtabName.toUpperCase().equals("USERS")) {

                WebElement subtab = util.waitToBeClickable(driver,"LINKTEXT","Users");
                subtab.click();

            } else {
                System.out.println("Error: Unable to find any tab");

                // take screenshot
                ScreenShot screenShot = new ScreenShot(driver);
                screenShot.takeScreenshot();

            }
            util.delay(Para.shortDelay);
        }
        // Pick-up and return WoC
        else if (tabName.toUpperCase().equals("PLANS")) {
            if (subtabName.toUpperCase().equals("PLAN CONFIGURATION")) {

                WebElement subtab = util.waitToBeClickable(driver,"LINKTEXT","Plan Configuration");
                subtab.click();

            } else if (subtabName.toUpperCase().equals("TIME FILTERS")) {

                WebElement subtab = util.waitToBeClickable(driver,"LINKTEXT","Time Filters");
                subtab.click();

            } else if (subtabName.toUpperCase().equals("ALERT RULE GROUPS")) {

                WebElement subtab = util.waitToBeClickable(driver,"LINKTEXT","Alert Rule Groups");
                subtab.click();

            } else if (subtabName.toUpperCase().equals("COST MODELS")) {

                WebElement subtab = util.waitToBeClickable(driver,"LINKTEXT","Cost Models");
                subtab.click();

            } else if (subtabName.toUpperCase().equals("COST DATASETS")) {

                WebElement subtab = util.waitToBeClickable(driver,"LINKTEXT","Cost Datasets");
                subtab.click();

            } else if (subtabName.toUpperCase().equals("NETWORK SETTING GROUP")) {
                WebElement tab = driver.findElement(By
                        .id("__item0-__item1-__xmlview0--shell-9-5"));
                String currentName = tab.getText();
                if (currentName.equals(tabName.toUpperCase())) {
                    System.out.println("you are currently in " + currentName
                            + " tab");
                } else {
                    tab.click();
                    System.out.println("Navigate to " + currentName + " tab");
                }
            } else {
                System.out.println("Error: Unable to find any tab");

                // take screenshot
                ScreenShot screenShot = new ScreenShot(driver);
                screenShot.takeScreenshot();
            }
            util.delay(Para.shortDelay);

        } // SystemManagement WoC
        else if (tabName.toUpperCase().equals("SYSTEMMAMAGEMENT")) {
            if (subtabName.toUpperCase().equals("OBJECT REGISTRATION")) {

                WebElement subtab = util.waitToBeClickable(driver,"LINKTEXT","Object Registration");
                subtab.click();

            } else if (subtabName.toUpperCase().equals("EXTENDED COLUMNS")) {

                WebElement subtab = util.waitToBeClickable(driver,"LINKTEXT","Extended Columns");
                subtab.click();

            } else {
                System.out.println("Error: Unable to find any tab");

                // take screenshot
                ScreenShot screenShot = new ScreenShot(driver);
                screenShot.takeScreenshot();
            }
            util.delay(Para.shortDelay);
        }
        else {
            System.out.println("Error: Unable to find any workcenter");
        }

        //util.delay(Para.shortDelay);
    }


}
