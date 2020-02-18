package JUnit.first;

import junit.framework.TestCase;
import java.util.ArrayList;
public class EmployeeTest extends TestCase {

	Employee emp = new Employee();
	ArrayList list = new ArrayList();
	
	{
		list.add("Mihir");
		list.add("Ingole");
	}
	
	
	public void testFindName() {
		assertEquals("FOUND",emp.findName(list, "Mihir"));
	}

}
