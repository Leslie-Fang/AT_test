package major_ok;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

/**
 * Created by I331490 on 6/23/2016.
 */
public class Before_test {
    @BeforeTest
    public void before_first_test()
    {
        System.out.println("This is a before test");
    }

    @AfterTest
    public void after_first_test()
    {
        System.out.println("This is an after test");
    }
}
