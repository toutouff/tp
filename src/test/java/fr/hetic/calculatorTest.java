package fr.hetic;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class calculatorTest {
    @Test
    public void testCalculator() {
        String[] args = {"2", "3", "+"};
        assertEquals("5", calculator.Calculator(args));
    }
}
