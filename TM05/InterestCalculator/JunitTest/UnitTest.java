package JunitTest;

import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
	FDAccountJTest.class,
	RDAccountJTest.class,
	SBAccountJTest.class
})

public class UnitTest{
	
}
