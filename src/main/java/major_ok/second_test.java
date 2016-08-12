package major_ok;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pageAction.TestBase;

/**
 * Created by I331490 on 6/23/2016.
 */
public class second_test extends TestBase {
    @Test
    @Parameters("name")
    public void se_test(String name)
    {
        System.out.println(name);
        driver.get("http://www.sina.com");
        driver.quit();
    }

    @DataProvider(name="dp1")
    public Object[][] creat_dp()
    {
        return new Object[][]
        {
            {"leslie",24},
            {"bob",23}
        };
    }

    @Test(dataProvider="dp1")
    public void se_test2(String name,int age)
    {
        System.out.println(name+"\t"+age);
    }
}
