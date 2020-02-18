package wipro.iostreams;
import java.util.*;
import java.util.Map.*;
import java.io.*;

public class Assignment3 {

	public static void main(String[] args) {
		

		String inpfile, outfile;
		inpfile = args[0];
		outfile = args[1];
		
		File fin = new File(inpfile);
		File fout = new File(outfile);
		BufferedReader br;
		BufferedWriter bw;
		
		try{
			br = new BufferedReader(new FileReader(fin));
		}catch(FileNotFoundException e){
			System.out.println("File not found");
			return;
		}
		
		try{
			bw = new BufferedWriter(new FileWriter(fout));
		}catch(IOException e){
			System.out.println("File Error");
			return;
		}
		
		
		Map<String, Integer> map = new TreeMap<>();
		
		String str;
		
		try{
			while((str = br.readLine()) != null){
				str = str.trim();
				String[] words = str.split(" ");
				
				for(String word : words){
					if(!map.containsKey(word))
						if(!map.containsKey(word))
							map.put(word, 1);
						else{
							map.put(word, map.get(word)+1);
						}
				}
			};
				
				Set<Entry<String, Integer>> set = map.entrySet();
				Iterator<Entry<String, Integer>> it = set.iterator();
				
				while(it.hasNext()){
					Entry<String, Integer> me = it.next();
					
					bw.write(me.getKey() + " : "+ me.getValue() + "\n");
				}
				
				br.close();
				bw.close();
				
				System.out.println("Output File Updated");
			
			
		}catch(IOException e){
			System.out.println("File Working Error");
			return;
		}
		
		
	}

}
