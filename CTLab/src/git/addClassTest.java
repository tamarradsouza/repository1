package git;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class addClassTest {

	@Test
	void test() {
		//fail("Not yet implemented");
	}
	
	@Test
	void testAdd() {
		addClass objAdd = new addClass();
		int expected=10;
		int actual=objAdd.add(3, 7);
		assertEquals(expected, actual);
	}
	

}
