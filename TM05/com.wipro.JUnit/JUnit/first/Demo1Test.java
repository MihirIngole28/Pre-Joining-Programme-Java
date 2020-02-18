package JUnit.first;

import junit.framework.TestCase;

public class Demo1Test extends TestCase {

	public void testStringConcat() {
		Demo1 dm = new Demo1();
		String result = dm.stringConcat("Hello", "World");
		assertEquals("HelloWorld",result);
	}

}
