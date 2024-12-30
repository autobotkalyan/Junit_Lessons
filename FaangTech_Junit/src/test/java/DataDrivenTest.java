import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DataDrivenTest
{
    /*@ParameterizedTest(name = "{index}")
    @ValueSource(strings = {"Apple","Orange"})
    public void testValue(String word)
    {
        System.out.println(word.length());
    }*/

    /*@ParameterizedTest
    @NullSource
    public void testNullSource(String argument)
    {
        assertTrue(argument == null);
    }*/

    /*@ParameterizedTest
    @EmptySource
    public void testEmptySource(String argument)
    {
        assertTrue(argument.isEmpty());
    }*/

    @ParameterizedTest
    @NullAndEmptySource
    public void testNullEmptySource(String argument)
    {
        System.out.println(argument);
    }

}
