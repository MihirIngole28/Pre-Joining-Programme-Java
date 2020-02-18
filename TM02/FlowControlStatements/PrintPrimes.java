package FlowControlStatements;

public class PrintPrimes {

	public static void main(String[] args) {
		
		for(int j=10;j<99;j++){
			int k=0;
			for(int i = 2;i < j; i++){
				if(j % i == 0){
					k=1;
				}
			}
			if(k == 0){
				System.out.println(j);
			}
			
		}		

	}

}
