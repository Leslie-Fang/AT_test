package Utility;

import pageAction.TestBase;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

//not use
public class TestngListener extends TestListenerAdapter {
  // private static Logger logger = Logger.getLogger(TestngListener.class);
//    public static final String CONFIG = "config.properties";
//    public WebDriver driver;
//    public TestngListener(WebDriver driver) {
//        this.driver = driver;
//    }

    @Override
    public void onTestFailure(ITestResult result) {
        super.onTestFailure(result);
        try {
            TestBase tb = (TestBase) result.getInstance();
            WebDriver driver = tb.getDriver();
           // System.out.println(driver.getTitle());
            ScreenShot screenShot = new ScreenShot(driver);
            screenShot.takeScreenshot();
        } catch (SecurityException e) {
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }






//    @Override
//    public void onTestSkipped(ITestResult tr) {
//        super.onTestSkipped(tr);
//        logger.info(tr.getName() + " Skipped");
//        //takeScreenShot(tr);
//    }
//
//    @Override
//    public void onTestSuccess(ITestResult tr) {
//        super.onTestSuccess(tr);
//        logger.info(tr.getName() + " Success");
//    }
//
//    @Override
//    public void onTestStart(ITestResult tr) {
//        super.onTestStart(tr);
//        logger.info(tr.getName() + " Start");
//    }
//
//    @Override
//    public void onFinish(ITestContext testContext) {
//        super.onFinish(testContext);
//
//        // List of test results which we will delete later
//        ArrayList<ITestResult> testsToBeRemoved = new ArrayList<ITestResult>();
//        // collect all id's from passed test
//        Set<Integer> passedTestIds = new HashSet<Integer>();
//        for (ITestResult passedTest : testContext.getPassedTests().getAllResults()) {
//            logger.info("PassedTests = " + passedTest.getName());
//            passedTestIds.add(getId(passedTest));
//        }
//
//        Set<Integer> failedTestIds = new HashSet<Integer>();
//        for (ITestResult failedTest : testContext.getFailedTests().getAllResults()) {
//            logger.info("failedTest = " + failedTest.getName());
//            // id = class + method + dataprovider
//            int failedTestId = getId(failedTest);
//
//            // if we saw this test as a failed test before we mark as to be deleted
//            // or delete this failed test if there is at least one passed version
//            if (failedTestIds.contains(failedTestId) || passedTestIds.contains(failedTestId)) {
//                testsToBeRemoved.add(failedTest);
//            } else {
//                failedTestIds.add(failedTestId);
//            }
//        }
//
//        // finally delete all tests that are marked
//        for (Iterator<ITestResult> iterator = testContext.getFailedTests().getAllResults().iterator(); iterator.hasNext();) {
//            ITestResult testResult = iterator.next();
//            if (testsToBeRemoved.contains(testResult)) {
//                logger.info("Remove repeat Fail Test: " + testResult.getName());
//                iterator.remove();
//            }
//        }
//
//    }
//
//
//
//    private int getId(ITestResult result) {
//        int id = result.getTestClass().getName().hashCode();
//        id = id + result.getMethod().getMethodName().hashCode();
//        id = id + (result.getParameters() != null ? Arrays.hashCode(result.getParameters()) : 0);
//        return id;
//    }
//
//
//

    /**
     * 自动截图，保存图片到本地以及html结果文件中
     *
     * @param tr
     */
//    private void takeScreenShot(ITestResult tr,WebDriver driver) {
//        SimpleDateFormat formatter = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss");
//        String mDateTime = formatter.format(new Date());
//        String fileName = mDateTime + "_" + tr.getName();
//
//        File filePath = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//        Reporter.setCurrentTestResult(tr);
//       // Reporter.log(filePath);
//        //这里实现把图片链接直接输出到结果文件中，通过邮件发送结果则可以直接显示图片
//      //  Reporter.log("<img src=\"../" + filePath + "\"/>");
//
//    }

//    public void takeScreenshot(ITestResult tr) {
//        Date date = new Date();// create a time object and get current time
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");// set time format
//        String str = sdf.format(date);// change type of time to required type
//
//        String screenName = str + ".jpg";
//        File dir = new File("test-output/snapshot");
//        if (!dir.exists())
//            dir.mkdirs();
//        String screenPath = dir.getAbsolutePath() + "/" + screenName;
//        try {
//            File scrFile = ((TakesScreenshot) driver)
//                    .getScreenshotAs(OutputType.FILE);
//            FileUtils.copyFile(scrFile, new File(screenPath));
//           // Reporter.setCurrentTestResult(tr);
//       // Reporter.log(screenPath);
//        //这里实现把图片链接直接输出到结果文件中，通过邮件发送结果则可以直接显示图片
//       // Reporter.log("<img src=\"../" + screenPath + "\"/>");
//        } catch (IOException e) {
//            System.out.println("Screen shot error: " + screenPath);
//        }
//        //this.takeScreenshot(screenPath);
//    }
}