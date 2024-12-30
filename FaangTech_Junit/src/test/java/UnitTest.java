import org.junit.jupiter.api.*;

public class UnitTest
{
    @BeforeAll
    public static void beforeAll()
    {
        System.out.println("This is before all");
    }

    //To setup the pre-requisite
    @BeforeEach
    public void beforeEach()
    {
        System.out.println("This is before each");
    }

    @Test
    public void cat()
    {
        System.out.println("This is Test 3");
    }

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

    @AfterEach
    public void tearDown()
    {
        System.out.println("This is after Each");
    }

    @AfterAll
    public static void afterAll()
    {
        System.out.println("This is after All");
    }
}
