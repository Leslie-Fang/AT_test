package Utility;

import pageAction.TestBase;
import org.openqa.selenium.WebDriver;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;


public class Retry1 implements IRetryAnalyzer {

    private static final String TEST_RETRY_COUNT = "testRetryCount";

    private int count = 1;

    private int maxCount = 1;



    public Retry1() {

        String retryMaxCount = System.getProperty(TEST_RETRY_COUNT);

        if (retryMaxCount != null) {

            maxCount = Integer.parseInt(retryMaxCount);

        }

    }



    public int getCount() {

        return this.count;

    }



    public int getMaxCount() {

        return this.maxCount;

    }



    public synchronized boolean retry(ITestResult result) {

        String testClassName = String.format("%s.%s", result.getMethod()

                .getRealClass().toString(), result.getMethod().getMethodName());

        try {
            TestBase tb = (TestBase) result.getInstance();
            WebDriver driver = tb.getDriver();
            System.out.println(driver.getTitle());
            ScreenShot screenShot = new ScreenShot(driver);
            screenShot.takeScreenShot(testClassName);
        } catch (SecurityException e) {
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }


        if (count <= maxCount) {

            result.setAttribute("RETRY", new Integer(count));
//            Logging.log("[RETRYING] " + testClassName + " FAILED, "
//
//                    + "Retrying " + count + " time", true);
            count += 1;
            return true;

        }

        return false;

    }

}
