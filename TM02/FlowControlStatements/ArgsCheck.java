package FlowControlStatements;

public class ArgsCheck {

	public static void main(String[] args) {
		if(args.length == 0){
			System.out.println("No Values");
		}
		else{
			int len = args.length;
			for(int i = 0; i < len; i++){
				System.out.print(args[i]);
				if(i == (len-1)){
					break;
				}
			System.out.print(",");
			}
		}
	}
}
