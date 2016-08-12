package Utility;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.Reporter;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;


public class Utility {

    public WebDriver driver;
    public Utility(WebDriver driver){
        this.driver = driver;
    }

    Utility util = new Utility(driver);
    public void message(String string) throws Exception {
        System.out.println(string);
    }

    // click button and wait for seconds
    public void clickAndWait(WebElement element, int seconds) throws Exception {
        try {
            element.click();
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    // direct delay for seconds
    public void delay(int seconds) throws Exception {
        try {
            //System.out.println("wait " + seconds + " seconds");
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    //input String
    public  void inputText(WebElement element, String input) throws Exception {

        element.sendKeys(input);
        // util.delay(Para.longDelay);
        util.delay(Para.shortDelay);

    }

    // get webElmement by ID, name, xpath
    public WebElement getElement(WebDriver driver, String type, String value) throws Exception {
        try {
            WebElement element;

            if (type.toUpperCase().equals("ID")) {
                element = driver.findElement(By.id(value));
                return element;
            } else if (type.toUpperCase().equals("NAME")) {
                element = driver.findElement(By.name(value));
                return element;
            } else if (type.toUpperCase().equals("XPATH")) {
                element = driver.findElement(By.xpath(value));
                return element;
            } else if (type.toUpperCase().equals("CLASS")) {
                element = driver.findElement(By.className(value));
                return element;
            } else if (type.toUpperCase().equals("PARTLINK")) {
                element = driver.findElement(By.partialLinkText(value));
                return element;
            } else if(type.toUpperCase().equals("LINKTEXT")) {
                element = driver.findElement(By.linkText(value));
                return element;
            } else if (type.toUpperCase().equals("TEXT")) {
                String value2 = "//*[text()='" + value + "']";
                element = driver.findElement(By.xpath(value2));
                return element;
            } else {
                util.message("input type or value is not correct");
                return null;
            }

        } catch (Exception e) {
            System.out.println("Cannot find element, time out");
            return null;

        }

    }

    //is element exist
    public boolean isElementDisplay(WebElement element ) throws Exception {
        try {
            //WebElement element;

            if (element.isDisplayed()) {
                return true;
            } else {
                return false;
            }

        } catch (Exception e) {
            System.out.println("Element display error");
            return false;

        }

    }

    // wait element to be clickable
    public WebElement waitToBeClickable(WebDriver driver, String type, String value) throws Exception {
        try {
            WebElement element;
            WebDriverWait wait = new WebDriverWait(driver, Para.wait);
            if (type.toUpperCase().equals("ID")) {
                element = wait.until(ExpectedConditions.elementToBeClickable(By.id(value)));
                return element;
            } else if (type.toUpperCase().equals("NAME")) {
                element = wait.until(ExpectedConditions.elementToBeClickable(By.name(value)));
                return element;
            } else if (type.toUpperCase().equals("XPATH")) {
                element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(value)));
                return element;
            } else if (type.toUpperCase().equals("CLASS")) {
                element = wait.until(ExpectedConditions.elementToBeClickable(By.className(value)));
                return element;
            } else if (type.toUpperCase().equals("PARTLINK")) {
                element = wait.until(ExpectedConditions.elementToBeClickable(By.partialLinkText(value)));
                return element;
            } else if(type.toUpperCase().equals("LINKTEXT")) {
                element = wait.until(ExpectedConditions.elementToBeClickable(By.linkText(value)));
                return element;
            } else if (type.toUpperCase().equals("TEXT")) {
                String value2 = "//*[text()='" + value + "']";
                element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(value2)));
                return element;
            } else {
                util.message("input type or value is not correct");
                return null;
            }

        } catch (Exception e) {
            System.out.println("Cannot find element, time out");
            ScreenShot screenShot = new ScreenShot(driver);
            screenShot.takeScreenshot();
            return null;
        }
    }

    // wait element to be visible
    public WebElement waitToBeVisible(WebDriver driver, String type, String value) throws Exception {
        try {
            WebElement element;
            WebDriverWait wait = new WebDriverWait(driver, Para.wait);
            if (type.toUpperCase().equals("ID")) {
                element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(value)));
                return element;
            } else if (type.toUpperCase().equals("NAME")) {
                element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name(value)));
                return element;
            } else if (type.toUpperCase().equals("XPATH")) {
                element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(value)));
                return element;
            } else if (type.toUpperCase().equals("CLASS")) {
                element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className(value)));
                return element;
            } else if (type.toUpperCase().equals("PARTLINK")) {
                element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText(value)));
                return element;
            } else if(type.toUpperCase().equals("LINKTEXT")) {
                element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText(value)));
                return element;
            } else if (type.toUpperCase().equals("TEXT")) {
                String value2 = "//*[text()='" + value + "']";
                element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(value2)));
                return element;
            } else {
                util.message("input type or value is not correct");
                return null;
            }

        } catch (Exception e) {
            System.out.println("Cannot find element, time out");
            return null;
        }
    }

    // wait element to presence
    public WebElement waitToPresence(WebDriver driver, String type, String value) throws Exception {
        try {
            WebElement element;
            WebDriverWait wait = new WebDriverWait(driver, Para.wait);
            if (type.toUpperCase().equals("ID")) {
                element = wait.until(ExpectedConditions.presenceOfElementLocated(By.id(value)));
                return element;
            } else if (type.toUpperCase().equals("NAME")) {
                element = wait.until(ExpectedConditions.presenceOfElementLocated(By.name(value)));
                return element;
            } else if (type.toUpperCase().equals("XPATH")) {
                element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(value)));
                return element;
            } else if (type.toUpperCase().equals("CLASS")) {
                element = wait.until(ExpectedConditions.presenceOfElementLocated(By.className(value)));
                return element;
            } else if (type.toUpperCase().equals("PARTLINK")) {
                element = wait.until(ExpectedConditions.presenceOfElementLocated(By.partialLinkText(value)));
                return element;
            } else if(type.toUpperCase().equals("LINKTEXT")) {
                element = wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText(value)));
                return element;
            } else if (type.toUpperCase().equals("TEXT")) {
                String value2 = "//*[text()='" + value + "']";
                element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(value2)));
                return element;
            } else {
                util.message("input type or value is not correct");
                return null;
            }

        } catch (Exception e) {
            System.out.println("Cannot find element, time out");
            return null;
        }
    }

    // get webElmements by ID, name, xpath
    public List<WebElement> getElementList(WebDriver driver,
                                           String type, String value) throws Exception {
        try {
            List<WebElement> elementList;

            if (type.toUpperCase().equals("IDLIST")) {
                elementList = driver.findElements(By.id(value));
                return elementList;
            } else if (type.toUpperCase().equals("NAMELIST")) {
                elementList = driver.findElements(By.name(value));
                return elementList;
            } else if (type.toUpperCase().equals("XPATHLIST")) {
                elementList = driver.findElements(By.xpath(value));
                return elementList;
            } else if (type.toUpperCase().equals("CLASSLIST")) {
                elementList = driver.findElements(By.className(value));
                return elementList;
            } else if (type.toUpperCase().equals("PARTLINKLIST")) {
                elementList = driver.findElements(By.partialLinkText(value));
                return elementList;
            } else if (type.toUpperCase().equals("LINKLIST")) {
                elementList = driver.findElements(By.linkText(value));
                return elementList;
            }  else if (type.toUpperCase().equals("TEXTLIST")) {
                String value2 = "//*[text()='" + value + "']";
                elementList = driver.findElements(By.xpath(value2));
                return elementList;
            } else {
                util.message("input type or value is not correct");
                return null;
            }

        } catch (Exception e) {
            System.out.println("Cannot find element, time out");
            return null;

        }
    }

    // get webElmement list by class
    public String getElementTitleByClass(WebDriver driver,
                                                String className, int number) throws Exception {
        try {
            List<WebElement> itemList = driver.findElements(By
                    .className(className));
            String item = itemList.get(number).getAttribute("title");

            return item;
        } catch (Exception e) {
            System.out.println("Cannot find element, time out");
            return null;

        }
    }

    // change Location filter with name
    public void changeLocationWithName(WebDriver driver,
                                              String locationName) throws Exception {
        try {
            util.clickElementByClassAndIndex(driver, "sapUiTfValueHelpIcon", 0);
            util.delay(35);
            util.clickElementByClassAndIndex(driver, "sapUiSearchFieldIco", 0);
            util.getElement(driver, "CLASS", "sapUiTf").sendKeys(locationName);
            KeyboardAction.pressEnter(driver);

            // util.getElement(driver, "XPATH",
            // "//*[@id='__xmlview2--container--locationFilterValueHelpDialog--table-rowsel0']").click();
            util.clickElementByClassAndIndex(driver, "sapUiTableRowHdr", 0);

            util.clickElementByClassAndIndex(driver, "sapUiBtnNorm", 0);
            util.delay(15);
        } catch (Exception e) {
            System.out.println("Cannot find element, time out");
        }
    }

    // change resource filter with name
    public void changeResourceWithName(WebDriver driver,
                                              String resourceFilter) throws Exception {
        try {
            util.clickElementByClassAndIndex(driver, "sapUiTfValueHelpIcon", 1);
            util.delay(35);
            util.clickElementByClassAndIndex(driver, "sapUiSearchFieldIco", 0);
            util.getElement(driver, "CLASS", "sapUiTf")
                    .sendKeys(resourceFilter);
            KeyboardAction.pressEnter(driver);
            util.clickElementByClassAndIndex(driver, "sapUiTableRowHdr", 0);
            util.clickElementByClassAndIndex(driver, "sapUiBtnNorm", 0);
            util.delay(15);
        } catch (Exception e) {
            System.out.println("Cannot find element, time out");

        }
    }

    // change multi-attribute filter
    public void multiAttributeWithName(WebDriver driver,
                                              String multAttributeName) throws Exception {
        try {
            util.clickElementByClassAndIndex(driver, "sapUiTfValueHelpIcon", 2);
            util.delay(15);
            util.clickElementByClassAndIndex(driver, "sapUiSearchFieldIco", 0);
            util.getElement(driver, "CLASS", "sapUiTf").sendKeys(
                    multAttributeName);
            KeyboardAction.pressEnter(driver);
            util.clickElementByClassAndIndex(driver, "sapUiTableRowHdr", 0);
            util.clickElementByClassAndIndex(driver, "sapUiBtnNorm", 0);
            util.delay(15);
        } catch (Exception e) {
            System.out.println("Cannot find element, time out");

        }
    }

    // click class item by index
    public void clickElementByClassAndIndex(WebDriver driver,
                                                   String className, int number) throws Exception {
        try {
            List<WebElement> itemList = driver.findElements(By
                    .className(className));
            WebElement item = itemList.get(number);
            item.click();
            util.delay(5);

        } catch (Exception e) {
            System.out.println("Cannot find element, time out");

        }

    }

    // click class item by index
    public WebElement getElementByClassAndIndex(WebDriver driver,
                                                String className, int number) throws Exception {
        try {
            List<WebElement> itemList = driver.findElements(By
                    .className(className));
            WebElement item = itemList.get(number);

            return item;
        } catch (Exception e) {
            System.out.println("Cannot find element, time out");
            return null;

        }
    }

    public String inputNumberPlusOne(String number) throws Exception {
        try {
            int num = Integer.parseInt(number);
            int newNum = num + 1;
            String stockNew = Integer.toString(newNum);

            return stockNew;
        } catch (Exception e) {

            System.out.println("Cannot find element, time out");
            return null;

        }
    }

    public String getItemNumber(String string) throws Exception {
        try {
            int start = string.indexOf("(");
            int end = string.indexOf(")");
            String number = string.substring(start + 1, end);
            return number;
        } catch (Exception e) {
            System.out.println("Cannot find element, time out");
            return null;

        }
    }

    public String getTimestamp() throws Exception {
        try {
            Timestamp time = new Timestamp(System.currentTimeMillis());
            Long timestamp = time.getTime();
            return timestamp.toString();
        }catch (Exception e) {
            System.out.println("Cannot find element, time out");
            return null;
        }
    }

    public String inputGenerate (String prefix) throws Exception {
        try {
            String timestemp = util.getTimestamp();
            String suffix = timestemp.substring(timestemp.length()-7,timestemp.length()-1);
            return prefix+suffix;
        } catch (Exception e) {
            System.out.println("Cannot generate input string");
            return null;
        }
    }

    public boolean isAlert (WebDriver driver) throws Exception {
        try {
            List<WebElement> alert = driver.findElements(By.xpath("//div[contains(@id,'alert')]"));
            if(alert.isEmpty()) {
                return false;
            }else {
                return true;
            }
        } catch (Exception e) {
            System.out.println("Alert error");
            return true;
        }
    }

    public boolean isDialog (WebDriver driver) throws Exception {
        try {
            List<WebElement> dialog = driver.findElements(By.xpath("//div[contains(@id,'dialog')]"));
            if(dialog.isEmpty()) {
                return false;
            }else {
                return true;
            }
        } catch (Exception e) {
            System.out.println("Dialog error");
            return true;
        }
    }

    public boolean isPopup (WebDriver driver) throws Exception {
        try {
            List<WebElement> popup = driver.findElements(By.xpath("//div[contains(@id,'Popup')]"));
            if(popup.isEmpty()) {
                return false;
            }else {
                return true;
            }
        } catch (Exception e) {
            System.out.println("popup error");
            return true;
        }
    }
    public boolean isConfirm (WebDriver driver) throws Exception {
        try {
            List<WebElement> confirm = driver.findElements(By.xpath("//div[contains(@id,'confirm')]"));
            if(confirm.isEmpty()) {
                return false;
            }else {
                return true;
            }
        } catch (Exception e) {
            System.out.println("popup error");
            return true;
        }
    }

    public boolean isClean(WebDriver driver) throws Exception {
        if(isAlert(driver)) return false;
        if(isDialog(driver)) return false;
        if(isConfirm(driver)) return false;
        //if(isPopup(driver)) return false;
        return true;
    }

    public String getCurrentTime() throws Exception {
        try {
            Date date = new Date();// create a time object and get current time
            SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");// set time format
            String str = sdf.format(date);// change type of time to required type
            return str;
        } catch (Exception e) {
            System.out.println("Cannot find element, time out");
            return null;

        }
    }

    public String getCurrentDateTime() throws Exception {
        try {
            Date date = new Date();// create a time object and get current time
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");// set time format
            String str = sdf.format(date);// change type of time to required type
            return str;
        } catch (Exception e) {
            System.out.println("Cannot find element, time out");
            return null;

        }
    }
    //判断异步请求是否结束
    public boolean hasAjax (WebDriver driver) throws Exception {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Boolean result=(Boolean) js.executeScript("return jQuery.active == 0");
        return  result;
    }

    public void dateDiff(String startTime, String endTime, String format) throws ParseException {
//按照传入的格式生成一个simpledateformate对象
        SimpleDateFormat sd = new SimpleDateFormat(format);
        long nd = 1000*24*60*60;//一天的毫秒数
        long nh = 1000*60*60;//一小时的毫秒数
        long nm = 1000*60;//一分钟的毫秒数
        long ns = 1000;//一秒钟的毫秒数
        long diff;
// try {
//获得两个时间的毫秒时间差异
        diff = sd.parse(endTime).getTime() - sd.parse(startTime).getTime();
        long day = diff/nd;//计算差多少天
        long hour = diff%nd/nh;//计算差多少小时
        long min = diff%nd%nh/nm;//计算差多少分钟
        long sec = diff%nd%nh%nm/ns;//计算差多少秒//输出结果
        System.out.println("时间相差："+day+"天"+hour+"小时"+min+"分钟"+sec+"秒。");
// 	}
    }

    //判断输入的两个日期是否相差指定的小时数
    public boolean hourDiff(String startTime, String endTime,int gap) throws ParseException {
        SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        long nd = 1000*24*60*60;//一天的毫秒数
        long nh = 1000*60*60;//一小时的毫秒数
        long nm = 1000*60;//一分钟的毫秒数
        long ns = 1000;//一秒钟的毫秒数
        long diff;

        diff = sd.parse(endTime).getTime() - sd.parse(startTime).getTime();
        long day = diff/nd;//计算差多少天
        long hour = diff%nd/nh;//计算差多少小时
        long min = diff%nd%nh/nm;//计算差多少分钟
        long sec = diff%nd%nh%nm/ns;//计算差多少秒
        // System.out.println("时间相差："+day+"天"+hour+"小时"+min+"分钟"+sec+"秒。");
        if(day==0&&min==0&&sec==0&&Math.abs(hour)==gap){
            return true;
        }else {
            return false;
        }
    }

    //判断输入的两个日期的时间差是否小于指定数值
    public boolean secondDiff(String startTime, String endTime,int gap) throws ParseException {
        SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        long nd = 1000*24*60*60;//一天的毫秒数
        long nh = 1000*60*60;//一小时的毫秒数
        long nm = 1000*60;//一分钟的毫秒数
        long ns = 1000;//一秒钟的毫秒数
        long diff;

        diff = sd.parse(endTime).getTime() - sd.parse(startTime).getTime();
        long day = diff/nd;//计算差多少天
        long hour = diff%nd/nh;//计算差多少小时
        long min = diff%nd%nh/nm;//计算差多少分钟
        long sec = diff%nd%nh%nm/ns;//计算差多少秒
        // System.out.println("时间相差："+day+"天"+hour+"小时"+min+"分钟"+sec+"秒。");
        if(day==0&&hour==0&&min==0&&Math.abs(sec)<gap){
            return true;
        }else {
            return false;
        }
    }

    public String getTestMethodName(){
        ITestResult it = Reporter.getCurrentTestResult();
        return it.getMethod().getMethodName();
        // System.out.println(it.getTestClass());
    }

    public String getTestClassName(){
        ITestResult it = Reporter.getCurrentTestResult();
        return it.getMethod().getRealClass().toString();
        // System.out.println(it.getTestClass());
    }
}
