import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calc = new Calculator();

    @Test
    void add_emptyString_ret0() {
        assertEquals(0, calc.add(""));
    }

    @Test
    void add_twoNumbersCommaSeparated_ret4() {
        assertEquals(4, calc.add("2,2"));
    }

    @Test
    void add_multipleNumbersCommaSeparated_ret100() {
        assertEquals(100, calc.add("2,2,26,35,5,12,18"));
    }

}