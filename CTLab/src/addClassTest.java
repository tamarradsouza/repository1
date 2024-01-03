import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class addClassTest {

	@Test
	void test() {
		fail("Not yet implemented");
	}
	
	@Test
	void testAdd() {
		addClass objadd = new addClass();
		int expected=8;
		int actual=objadd.add(4,  4);
		assertEquals(expected, actual);
	}
	
	

}
