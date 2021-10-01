package testing;

import static org.junit.Assert.*;
import org.junit.Test;

import controller.Calculate;

public class TestCalculate {

	@Test
	public void testCalculateMethod() {
		int result1 = Calculate.calculate("John","Alice");
		System.out.println(result1);
		int result2= Calculate.calculate("John","George");
		assertEquals(77, result1);
		assertEquals(61, result2);
		try {
			Calculate.calculate(null,null);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testFindSumMethod() {
		int result1 = Calculate.findSum(250);
		int result2 = Calculate.findSum(550);
		assertEquals(7, result1);
		assertEquals(10, result2);
		try {
			Calculate.findSum(0);
			Calculate.findSum(-250);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

