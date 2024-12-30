import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.DisplayName.class)
public class SortingDisplayNameTest
{
    @Test @DisplayName("Box")
    public void test1()
    {
        System.out.println("This is Test 2");
    }

    @Test @DisplayName("Apple")
    public void test2()
    {
        System.out.println("This is Test 1");
    }
}
