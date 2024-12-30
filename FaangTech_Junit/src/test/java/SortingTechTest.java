import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.MethodName.class)
public class SortingTechTest
{
    @Test
    public void box()
    {
        System.out.println("This is Test 2");
    }

    @Test
    public void apple()
    {
        System.out.println("This is Test 1");
    }
}
