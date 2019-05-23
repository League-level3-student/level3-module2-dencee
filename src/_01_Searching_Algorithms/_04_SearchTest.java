package _01_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class _04_SearchTest {

	// A MINIMUM OF 3 TESTS ARE REQUIRED FOR EACH METHOD
    int[] ia = { 123, 55, 2, 50001, 444, 6799, 222, 150, 5555 };
    int[] iaSorted = { 2, 55, 123, 150, 222, 444, 5555, 6799, 50001 };
    int[] iaSpaced = { 100, 200, 300, 400, 500, 600, 700, 800, 900, 1000 };
    String[] sa = { "This", "is", "my", "testing", "array", "for", "my", "code" };
	
	@Test
	public void testLinearSearch() {
		//1. use the assertEquals method to test your linear search method.
	    assertEquals( _00_LinearSearch.linearSearch( sa, "Daniel" ), -1 );
	    assertEquals( _00_LinearSearch.linearSearch( sa, "array" ), 4 );
	    assertEquals( _00_LinearSearch.linearSearch( sa, "coDe" ), -1 );
	    assertEquals( _00_LinearSearch.linearSearch( sa, "code" ), 7 );
	}

	@Test
	public void testBinarySearch() {
	    Arrays.sort( iaSorted );
		//2. use the assertEquals method to test your binary search method.
		//   remember that the array must be sorted
	    assertEquals( _01_BinarySearch.binarySearch( iaSorted, 0, ia.length-1, 2222 ), -1 );
	    assertEquals( _01_BinarySearch.binarySearch( iaSorted, 0, ia.length-1, 5555 ), 6 );
	    assertEquals( _01_BinarySearch.binarySearch( iaSorted, 0, ia.length-1, 2 ), 0 );
	    assertEquals( _01_BinarySearch.binarySearch( iaSorted, 0, 4, 444 ), -1 );
	    assertEquals( _01_BinarySearch.binarySearch( iaSorted, 0, 5, 444 ), 5 );
	}
	
	@Test
	public void testInterpolationSearch() {
		//3. use the assertEquals method to test your interpolation search method.
		//   remember that the array must be sorted and evenly distributed
	    assertEquals( _02_InterpolationSearch.interpolationSearch( iaSpaced, 1100 ), -1 );
	    assertEquals( _02_InterpolationSearch.interpolationSearch( iaSpaced, 300 ), 2 );
	    assertEquals( _02_InterpolationSearch.interpolationSearch( iaSpaced, 100 ), 0 );
	    assertEquals( _02_InterpolationSearch.interpolationSearch( iaSpaced, 101 ), -1 );
	}
	
	@Test
	public void testExponentialSearch() {
		//4. use the assertEquals method to test your exponential search method.
		//   remember that the array must be sorted
        assertEquals( _03_ExponentialSearch.exponentialSearch( iaSorted, 2222 ), -1 );
        assertEquals( _03_ExponentialSearch.exponentialSearch( iaSorted, 5555 ), 6 );
        assertEquals( _03_ExponentialSearch.exponentialSearch( iaSorted, 2 ), 0 );
        assertEquals( _03_ExponentialSearch.exponentialSearch( iaSorted, 444 ), 5 );
        assertEquals( _03_ExponentialSearch.exponentialSearch( iaSorted, 50001 ), 8 );
	}
}
