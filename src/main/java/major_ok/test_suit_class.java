package major_ok;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

/**
 * Created by I331490 on 6/23/2016.
 */
public class test_suit_class {
    @BeforeSuite
    public void Inform_begin_suite()
    {
        System.out.println("This is a before suite");
    }
/*
    @BeforeSuite
    public void Inform_begin_suite2()
    {
        System.out.println("This is a before suite2");
    }
*/
    @AfterSuite
    public void Inform_after_suite()
    {
        System.out.println("This is a after suite");
    }
}
