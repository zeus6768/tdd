package money;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

public class MoneyTest {

    @Test
    void testMultiplication() {
        Dollar five = new Dollar(5);
        assertEquals(new Dollar(10), five.times(2));
        assertEquals(new Dollar(15), five.times(3));
    }

    @Test
    void testFrancMultiplication() {
        Franc five = new Franc(5);
        assertEquals(new Franc(10), five.times(2));
        assertEquals(new Franc(15), five.times(3));
    }

    @Test
    void testEquality() {
        assertEquals(new Dollar(5), new Dollar(5));
        assertNotEquals(new Dollar(5), new Dollar(6));
        assertEquals(new Franc(5), new Franc(5));
        assertNotEquals(new Franc(5), new Franc(6));
        assertNotEquals(new Franc(5), new Dollar(5));
    }
}
