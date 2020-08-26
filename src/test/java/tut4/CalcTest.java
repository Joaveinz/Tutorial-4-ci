package tut4;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit test for simple App.
 */
public class CalcTest
{
	@Test
	public void testAdd() {
		assertEquals(42, new Calc().add(40, 2));
	}
	
	public void testSubtract() {
		assertEquals(40, new Calc().subtract(42, 2));
	}
}
