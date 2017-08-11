import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Statistics {

	public static void main(String[] args) throws IOException {				
		
		BufferedReader buffer = new BufferedReader(new FileReader("src/sample.in"));
		//BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));			
		String line = buffer.readLine();
		int lines = 1;		
		
		while(line!=null){			
									
			ArrayList <Integer> lista = new ArrayList<Integer>();
			
			for(String s: line.split(" ")){
				
				lista.add(Integer.parseInt(s));
			}
			
			lista.remove(0);
			
			int max = Collections.max(lista);			
			int min = Collections.min(lista);			
			int range = max - min;
			
			System.out.println("Case " + lines + ": " + min + " " + max + " " + range);
			
			line = buffer.readLine();
			
			lines +=1;
											
		}
		
		buffer.close();		
		
	}

}
