package git;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MultTest {

	@Test
	void test() {
		//fail("Not yet implemented");
	}
	@Test 
	void testMult() {
		Mult objmult = new Mult();
		int expected = 45;
		int actual = objmult.mult(3, 5, 3);
		assertEquals(expected, actual);
	}

}
