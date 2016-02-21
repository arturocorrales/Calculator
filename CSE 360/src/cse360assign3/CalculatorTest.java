package cse360assign3;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testCalculator() {
		Calculator eData = new Calculator();
		assertNotNull(eData);
	}

	@Test
	public void testGetTotal() {
		Calculator eData = new Calculator();
		assertEquals(0, eData.getTotal());
	}

	@Test
	public void testAdd() {
		Calculator eData = new Calculator();
		eData.add(2);
		assertEquals(2, eData.getTotal());
	}

	@Test
	public void testSubtract() {
		Calculator eData = new Calculator();
		eData.subtract(4);
		assertEquals(-4, eData.getTotal());
	}

	@Test
	public void testMultiply() {
		Calculator eData = new Calculator();
		eData.add(2);
		eData.multiply(4);
		assertEquals(8, eData.getTotal());
	}

	@Test
	public void testDivide() {
		Calculator eData = new Calculator();
		eData.add(8);
		eData.divide(0);
		assertEquals(0, eData.getTotal());
	}

	@Test
	public void testGetHistory() {
		Calculator eData = new Calculator();
		assertEquals("", eData.getHistory());
	}

}
