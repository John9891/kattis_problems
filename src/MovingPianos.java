import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * 
 * @author John Gutierrez
 *INPT MCPC training I : Greedy algorithms
 *Problem C: Moving Pianos
 *
 *Input: On the first line is a single positive integer n≤100, specifying the number of test scenarios to follow.
 *Each scenario begin with two positive integers m and p on a line of their own, m≤1000, telling the number
 *of pianos to be moved, and p≤2000 the number of piano tuners. Then follow m lines, each containing a piano
 *move order on the format of two integers bi and ei with 1≤bi≤ei≤100 meaning that between the beginning
 *of day bi and the end of day ei, the piano i must be moved. Day 1 is always a Monday, 2 a Tuesday and so on.
 *
 *Output: For each test scenario, output the text “serious trouble” if the list of piano move orders cannot be
 *executed as promised even if all the p piano tuners worked every day, the text “weekend work” if at least
 *two piano tuners have to work some Saturday or Sunday, or the text “fine” if it is possible to carry out all
 *the moves during the five working days of the weeks.
 */
public class MovingPianos {

	public static void main(String[] args) throws IOException{
		
		BufferedReader buffer = new BufferedReader(new FileReader("src/pianos.in"));
		//BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));			
		String line1 = buffer.readLine();			
		int numEscen = Integer.parseInt(line1);		//Number of escenarios
		System.out.println(numEscen);
		
		
		String line2 = buffer.readLine();
		ArrayList <Integer> numOrder = new ArrayList<Integer>();		
		for(String s: line2.split(" ")){			//Number of orders	
			numOrder.add(Integer.parseInt(s));
		}		
		
		ArrayList <ArrayList<Integer>> listOrders = new ArrayList<ArrayList<Integer>>();	//Add dynamically a list of list
		for(int i=0; i<numOrder.get(0); i++){
			String line3 = buffer.readLine();
			ArrayList<Integer> list = new ArrayList<>();
			for(String s: line3.split(" ")){			//Add a piano move order to each sublist
				list.add(Integer.parseInt(s));}
			listOrders.add(list);
		}
		
		for (ArrayList<Integer> i : listOrders) {
			for (Integer n : i) {
				System.out.print(n + " ");
			}
			
			System.out.println(" ");	
		}	
		

	}
	
	
	public static void isWeekend(int dia1){
		
		
	}

}
