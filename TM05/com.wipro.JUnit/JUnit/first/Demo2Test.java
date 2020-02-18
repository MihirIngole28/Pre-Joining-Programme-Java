package JUnit.first;

import junit.framework.TestCase;

public class Demo2Test extends TestCase {

	public void testPalindromeCheck() {
		Demo2 dm = new Demo2();
		assertTrue(dm.palindromeCheck("malayalam"));
	}

}
