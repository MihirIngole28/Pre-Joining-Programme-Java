
public class Project1 {

	public static void main(String[] args) {
		
		String[][] employee = {{"1001","Ashish","01/04/2019","e","R&D","20000","8000","3000"},
				{"1002","Sushma","23/08/2012","c","PM","30000","12000","9000"},
				{"1003","Rahul","12/11/2008","k","Acct","10000","8000","1000"},
				{"1004","Chahat","23/01/2013","r","Front Desk","12000","6000","2000"},
				{"1004","Rajan","16/07/2005","m","Engg","50000","20000","20000"},
				{"1005","Suman","01/01/2001","e","Manufacturing","23000","9000","4400"},
				{"1007","Tanmay","12/06/2006","c","PM","29000","12000","10000"}};


		String empid = args[0];
		int n = employee.length;
		int empno=n;
		
		String empname, doj, dc, dept;
		String designation = "";
		int salary,basic, hra, it, da=0;

		for(int i = 0; i<n; i++){
			if(empid.equals(employee[i][0])){
				empno = i;
			}
		}
		
		if(empno == n){
			System.out.println("There is no employee with empid :"+empid);
		}
		
		else{
			empname = employee[empno][1];
			doj = employee[empno][2];
			dc = employee[empno][3];
			dept = employee[empno][4];
			
			basic = Integer.parseInt(employee[empno][5]);
			hra = Integer.parseInt(employee[empno][6]);
			it = Integer.parseInt(employee[empno][7]);
			
			switch(dc){
			case "e" : designation = "Engineer";
						da = 20000;
						break;
			case "c" : designation = "Consultant";
						da = 32000;
						break;
			case "k" : designation = "Clerk";
						da = 12000;
						break;
			case "r" : designation = "Receptionist";
						da = 15000;
						break;
			case "m" : designation = "Manager";
						da = 40000;
						break;
			default  : System.out.println("There is no such designation code");
			}
			
			salary = basic + hra + da - it;
			
			System.out.println("Emp No. Emp Name Department Designation Salary");
			System.out.println(empid+"\t"+empname+"\t "+dept+"\t    "+designation+"\t "+salary);
		}
		
	}

}
