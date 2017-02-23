package test.java.com.bolaris;
import org.junit.Test;
import static main.java.com.bolaris.BitCounter.countBitsSlow;
import static org.junit.Assert.*;

public class BitCounterTest {
	@Test
	public void testNaive() {
		assertEquals(0, countBitsSlow(0));
		assertEquals(1, countBitsSlow(1));
	}
}
