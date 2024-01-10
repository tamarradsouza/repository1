package git;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class reverseStringTest {

	@Test
	void test() {
		//fail("Not yet implemented");
	}
	
	@Test
	void reverseTest() {
		reverseString objstr = new reverseString();
		String expected = "olleH";
		String actual = objstr.reverse("Hello");
		expected.equals(actual);
		
	}


}
