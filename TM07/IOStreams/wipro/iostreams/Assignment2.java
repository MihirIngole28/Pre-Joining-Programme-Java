package wipro.iostreams;

import java.io.*;
import java.util.Scanner;

public class Assignment2 {

	public static void main(String[] args) throws IOException{
		int num;
		String finp, ftrgt;
		FileInputStream fin;
		FileOutputStream fout;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the input file name");
		finp = sc.nextLine();
		
		try{
			fin = new FileInputStream(finp);
		}catch(FileNotFoundException e){
			System.out.println("File not found");
			return;
		}
		
		System.out.println("Enter the output file name");
		ftrgt = sc.nextLine();
		
		try{
			fout = new FileOutputStream(ftrgt);
		}catch(IOException e){
			System.out.println("File Error");
			return;
		}
		
		try{
			do{
				num = fin.read();
				if(num != -1)
					fout.write(num);
			}while(num != -1);
		}catch(IOException e){
			System.out.println("File Error");
		}
		
		System.out.println("File is copied.");
		
		fin.close();
		fout.close();
	}

}
