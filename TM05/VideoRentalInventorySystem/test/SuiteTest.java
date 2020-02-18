package test;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import junit.framework.TestCase;

@RunWith(Suite.class)
@Suite.SuiteClasses({
	VideoJUnitTest.class,
	VideoStoreJUnitTest.class
})

public class SuiteTest {
	
	public class AllTests {
		
	}
}
