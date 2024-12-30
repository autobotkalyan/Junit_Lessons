import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class SkippingTest
{
    @Test
    public void running()
    {
        System.out.println("This is running Test");
    }

    @Test @Disabled
    public void workInProgress()
    {
        System.out.println("This is work in progress Test");
    }
}
