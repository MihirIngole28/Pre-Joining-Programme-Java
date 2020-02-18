package JunitTest;
import Prj1.SBAccount;
import junit.framework.TestCase;

public class SBAccountJTest extends TestCase {
	
	SBAccount sb1 = new SBAccount(10000,"normal");
	SBAccount sb2 = new SBAccount(10000,"NRI");
	
	public void testCalculateInterest() {
		assertEquals(400.0,sb1.calculateInterest(),0.0);
		assertEquals(600.0,sb2.calculateInterest(),0.0);
	}

}
