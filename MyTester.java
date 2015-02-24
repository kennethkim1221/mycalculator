import static org.junit.Assert.*;

import org.junit.Test;


public class MyTester {

	@Test
	public void testNfactorial() {               // factorial of 1
		MyCalculator calc = new MyCalculator();
		int actual = calc.nfactorial(4);
		assertEquals("1! = 1", 24, actual, 0.0);
	}
	
	@Test
	public void testNfactorial2() {				// factorial of 3
		MyCalculator calc = new MyCalculator();
		int actual = calc.nfactorial(3);
		assertEquals("3! = 6", 6, actual, 0.0);
	}
	
	@Test
	public void testNfactorial3() {				// factorial of 5
		MyCalculator calc = new MyCalculator();
		int actual = calc.nfactorial(5);
		assertEquals("5! = 120", 120, actual, 0.0);
	}
	
	@Test
	public void testBinarySearchEmpty() {      // search 10 in an array list
		MyCalculator search = new MyCalculator();
		int[] input = {10};
		int actual = search.binarySearch(input, 10);
		assertEquals("Search 10.", 0, actual, 0.0);
	}
	
	@Test
	public void testBinarySearchEmpty2() {		// search 10 in an array list with 2 elements
		MyCalculator search = new MyCalculator();
		int[] input = {0, 10};
		int actual = search.binarySearch(input, 10);
		assertEquals("Search 10", 1, actual, 0.0);
	}
	
	@Test
	public void testBinarySearchEmpty3() {      // search 10 in an array list with 3 elements
		MyCalculator search = new MyCalculator();
		int[] input = {0, 5, 10};
		int actual = search.binarySearch(input, 10);
		assertEquals("Search 10.", 2, actual, 0.0);
	}
	
	@Test
	public void testBinarySearchEmpty4() {		// search 8 in an array list with 5 elements
		MyCalculator search = new MyCalculator();
		int[] input = {0, 5, 10, 15, 20};
		int actual = search.binarySearch(input, 8);
		assertEquals("Not Found.", -1, actual, 0.0);
	}
}
