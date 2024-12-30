import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class TaggingTest
{

    @Test
    @Tag("SmokeTest")
    public void test1()
    {
        System.out.println("Smoke Test1");
    }

    @Test
    @Tag("SmokeTest")
    public void test2()
    {
        System.out.println("Sanity Test");
    }

    @Test
    @Tag("RegressionTest")
    public void test3()
    {
        System.out.println("Regression Test");
    }
}
