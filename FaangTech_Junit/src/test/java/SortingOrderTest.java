import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class SortingOrderTest
{
    @Test @Order(1)
    public void cell()
    {
        System.out.println("This is Test 1");
    }

    @Test @Order(3)
    public void box()
    {
        System.out.println("This is Test 3");
    }

    @Test @Order(2)
    public void apple()
    {
        System.out.println("This is Test 2");
    }
}
