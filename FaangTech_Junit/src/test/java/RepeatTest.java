import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class RepeatTest
{
    @RepeatedTest(value = 4, name = "Faang - Repeat {currentRepetition} of {totalRepetitions}")
    public void printNumbers()
    {
        System.out.println("Repeating Test");
    }
}
