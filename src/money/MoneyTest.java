package money;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class MoneyTest {

	@Test
    public void testMultiplication() {
        Dollar five = new Dollar(5);
        assertEquals(new Dollar(10), five.times(2));
        assertEquals(new Dollar(15), five.times(3));
    }

	@Test
    public void testEquality() {
		assertTrue(new Dollar(5).equals(new Dollar(5)));
//		assertTrue(new Dollar(5).equals(new Dollar(6)));
	}

	@Test
    public void testFrancMultiplication() {
        Dollar five = new Dollar(5);
        assertEquals(new Dollar(10), five.times(2));
        assertEquals(new Dollar(15), five.times(3));
    }

}