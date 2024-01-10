package git;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class reverseArrayTest {

	@Test
	void test() {
		//fail("Not yet implemented");
	}

	@Test
	void reversedArrayTest() {
		reverseArray objarr = new reverseArray();
		int[] arr = {1, 2, 3, 4, 5};
		int[] expected = {5, 4, 3, 2, 1};
		int[] actual = objarr.reverse(arr);
		assertArrayEquals(expected, actual);
	}
}
