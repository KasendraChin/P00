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
		int a = 200;
		int b = 2;
		Calculator cal = new Calculator();
		int actual = cal.divide(a, b);
		int expected = 100;
		assertEquals(expected, actual);
	}

}
