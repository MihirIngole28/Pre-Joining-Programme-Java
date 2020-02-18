package JunitTest;
import Prj1.FDAccount;

import junit.framework.TestCase;

public class FDAccountJTest extends TestCase {

	FDAccount fd1 = new FDAccount(10000,91,65);
	FDAccount fd2 = new FDAccount(10000,91,34);
	
	public void testCalculateInterest() {
		assertEquals(800.0,fd1.calculateInterest(),0.0);
		assertEquals(750.0,fd2.calculateInterest(),0.0);
	}

}
