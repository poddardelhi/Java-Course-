package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import classes.Calculator;

public class CalculatorTest {
	private Calculator  calcUnderTest;
	
	@Before
	public void setUp() throws Exception {
		calcUnderTest= new Calculator();
	}

	@After
	public void tearDown() throws Exception {
		calcUnderTest= null;
	}

	@Test
	public void testAddPositiveNumbers() {
		int expectedResult=5;
		int realResult=calcUnderTest.add(2, 3);
		assertEquals(expectedResult, expectedResult);
	}

}
