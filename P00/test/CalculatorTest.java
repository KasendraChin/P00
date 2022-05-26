import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAdd() {
		int a = 4321;
		int b = 1234;
		Calculator cal = new Calculator();
		int actual = cal.add(a, b);
		int expected = 5555;
		assertEquals(expected, actual);
	}
	@Test
	public void testSubtract() {
		//fail("Not yet implemented");
		int a = 330;
		int b = 220;
		Calculator cal = new Calculator();
		int actual = cal.subtract(a, b);
		int expected = 110;
		assertEquals(expected, actual);
	}
	@Test
	public void testMultiply() {
		//fail("Not yet implemented");
		int a = 10;
		int b = 2;
		Calculator cal = new Calculator();
		int actual = cal.multiply(a, b);
		int expected = 20;
		assertEquals(expected, actual);
	}
	@Test
	public void testDivide() {
		//fail("Not yet implemented");
		int a = 75;
		int b = 5;
		Calculator cal = new Calculator();
		int actual = cal.divide(a, b);
		int expected = 15;
		assertEquals(expected, actual);
}
	public int testDivide1() {
		int a = 50;
		int b = 0;
		if(b == 0) {
			throw new IllegalArgumentException();
		}
		return a / b;
	}
	@Test
	public void testPower() {
		int a = 3;
		int b = 2;
		Calculator cal = new Calculator();
		int actual = (int) cal.power(a, b);
		int expected = 9;
		assertEquals(expected, actual);
	}
}
