package wipro.iostreams;
import java.io.*;
import java.util.Scanner;

public class Assignment1 {

	public static void main(String[] args) throws IOException{
		
		String finp;
		int count = 0;
		int i;
		char ch;
		FileInputStream fin;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the file name: ");
		finp = sc.nextLine();
		
		try{
			fin = new FileInputStream(finp);
		}catch(FileNotFoundException e){
			System.out.println("File not found");
			return;
		}
		
		System.out.println("Enter the character to be counted");
		ch = sc.nextLine().charAt(0);
		
		do{
			i = fin.read();
			
			if(ch >= 65 && ch <= 90)  ch += 32;
			if(i >= 65 && i <= 90)  i += 32;
			
			if(i == ch)
				count++;
		}while(i != -1);
		
		System.out.println("File "+finp+" has "+count+" instances of letter '"+ch+"'");
		
	}

}
