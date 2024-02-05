package stringcalculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class StringCalculatorTest {
    @Test
    void null_또는_빈값() {
        assertEquals(StringCalculator.splitAndSum(null), 0);
        assertEquals(StringCalculator.splitAndSum(""), 0);
    }

    @Test
    void 값_하나() {
        assertEquals(StringCalculator.splitAndSum("1"), 1);
    }

    @Test
    void 쉼표_구분자() {
        assertEquals(StringCalculator.splitAndSum("1,2"), 3);
    }

    @Test
    void 쉼표_콜론_구분자() {
        assertEquals(StringCalculator.splitAndSum("1,2:3"), 6);
    }
}
