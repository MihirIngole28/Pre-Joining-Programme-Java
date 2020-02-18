package JunitTest;
import Prj1.RDAccount;
import junit.framework.TestCase;

public class RDAccountJTest extends TestCase {

	RDAccount rd1 = new RDAccount(10000,6,65);
	RDAccount rd2 = new RDAccount(10000,9,34);
	public void testCalculateInterest() {
		assertEquals(800.0,rd1.calculateInterest(),0.0);
		assertEquals(775.0,rd2.calculateInterest(),0.0);
	}

}
