package Utility;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MouseAction {
    public static void mouseClick(WebDriver driver, WebElement element) throws Exception{

        Actions action = new Actions(driver);
        action.click(element);// 鼠标左键点击指定的元素
    }



    public static void doubleClick(WebDriver driver, WebElement element) throws Exception{

        Actions action = new Actions(driver);
        action.doubleClick(element);// 鼠标双击指定的元素
        action.perform();
        util.delay(Para.longDelay);
    }

    public static void dragAndDropByTarget(WebDriver driver, WebElement source, WebElement target) throws Exception{

        Actions action = new Actions(driver);
        // 鼠标拖拽动作，将 source 元素拖放到 target 元素的位置。
        action.dragAndDrop(source,target);

    }

    public static void dragAndDropByPoint(WebDriver driver, WebElement source, int xOffset, int yOffset) throws Exception{

        Actions action = new Actions(driver);
        // 鼠标拖拽动作，将 source 元素拖放到 (xOffset, yOffset) 位置，其中 xOffset 为横坐标，yOffset 为纵坐标。
        action.dragAndDropBy(source,xOffset,yOffset);

    }




    public static void multiClick(WebDriver driver, WebElement element) throws Exception{

        Actions action = new Actions(driver);
        action.keyDown(Keys.CONTROL).click(element).keyUp(Keys.CONTROL).perform();
        util.delay(Para.longDelay);

    }
}
