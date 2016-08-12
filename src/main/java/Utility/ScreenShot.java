package Utility;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by I321791 on 1/18/2016.
 */
public class ScreenShot {
    public WebDriver driver;

    public ScreenShot(WebDriver driver) {
        this.driver = driver;
    }

    private void takeScreenshot(String screenPath) {
        try {
            File scrFile = ((TakesScreenshot) driver)
                    .getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File(screenPath));
        } catch (IOException e) {
            System.out.println("Screen shot error: " + screenPath);
        }
    }

    public void takeScreenshot() {
        Date date = new Date();// create a time object and get current time
        SimpleDateFormat sdf = new SimpleDateFormat("MMddHHmm");// set time format
        String str = sdf.format(date);// change type of time to required type
        String methodName = util.getTestMethodName();
        String className = util.getTestClassName();
        String caseName =String.format("%s.%s",className,methodName);

        String screenName = str + caseName.substring(27,caseName.length()) + ".jpg";
        File dir = new File("test-output/snapshot");
        if (!dir.exists())
            dir.mkdirs();
        String screenPath = dir.getAbsolutePath() + "/" + screenName;
        this.takeScreenshot(screenPath);
    }

//    public void takeScreenshot() {
//        Date date = new Date();// create a time object and get current time
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");// set time format
//        String str = sdf.format(date);// change type of time to required type
//
//        String screenName = str + ".jpg";
//        File dir = new File("test-output/snapshot");
//        if (!dir.exists())
//            dir.mkdirs();
//        String screenPath = dir.getAbsolutePath() + "/" + screenName;
//        this.takeScreenshot(screenPath);
//    }

    public void takeScreenShot(String name) {
        Date date = new Date();// create a time object and get current time
        SimpleDateFormat sdf = new SimpleDateFormat("MMddHHmm");// set time format
        String str = sdf.format(date);// change type of time to required type

        String screenName = str + name.substring(27,name.length()) + ".jpg";
        File dir = new File("test-output/snapshot");
        if (!dir.exists())
            dir.mkdirs();
        String screenPath = dir.getAbsolutePath() + "/" + screenName;
        this.takeScreenshot(screenPath);
    }
}
