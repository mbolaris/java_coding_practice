package test.java.com.bolaris;
import org.junit.Test;
import static org.junit.Assert.*;

import static main.java.com.bolaris.Fibonacci.naive;

public class FibonacciTest {

	@Test
	public void testNaive() {
		assertEquals(5, naive(5));
	}
}