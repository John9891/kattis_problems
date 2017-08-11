/**
 * Author: John Alexander Gutierrez Lizarazo
 * INPT MCPC training I : Greedy algorithms
 * 
 * Problem A: Planting Trees
 * Input: The input consists of two lines. The first line contains a single integer N (1≤N≤1000001≤N≤100000)
 * denoting the number of seedlings. Then a line with N integers ti follows (1≤ti≤10000001≤ti≤1000000),
 * where ti denotes the number of days it takes for the ith tree to grow.
 * 
 * Output: You program should output exactly one line containing one integer, denoting the earliest day
 * when the party can be organized. The days are numbered 1,2,3,…1,2,3,… beginning from the current moment.
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class PlantingTrees {

	public static void main(String[] args) throws IOException {
		
		BufferedReader buffer = new BufferedReader(new FileReader("src/trees.in"));
		//BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));			
		String line = buffer.readLine();			
		
		int n_trees = Integer.parseInt(line);		//Number of trees				
		
		line = buffer.readLine();			//Read nex line
		
		ArrayList <Integer> myList = new ArrayList<Integer>();
		
		for(String s: line.split(" ")){			//Save elements in arrayList		
			myList.add(Integer.parseInt(s));
		}			
		
		/*long startTime = System.nanoTime();
		InsertionSort(myList);	
		long finishTime = System.nanoTime();
		double time = (finishTime-startTime)/100000000.0;
		System.out.println("time: " + time + "\t");*/
		
		long startTime = System.nanoTime();
		Collections.sort(myList, Collections.reverseOrder());
		long finishTime = System.nanoTime();
		double time = (finishTime-startTime)/100000000.0;
		System.out.println("time: " + time + "\t");
		
		/*for (Integer i : myList) {
			System.out.println(i);
		}*/
		
		int days=0;
		int max=1;
		for(int i=0; i<n_trees-1; i++){
			
			days = myList.get(0) + (i+1)-(myList.get(0)-myList.get(i+1));
			if(days>max){
				max = days;
			}
			//System.out.println(max);
		}
		
		System.out.println(max+2);
					
		
		buffer.close();
	}
	
	
	public static void InsertionSort( ArrayList<Integer> vals ) {
		int currInd;
		for ( int pos=1; pos < vals.size() ; pos++ ) {
			currInd = pos ;
		while ( currInd > 0 && vals.get(currInd) > vals.get(currInd-1) ) {			
			Collections.swap(vals, currInd, currInd - 1);
			currInd = currInd-1;
			}
		}
	}
	
	public static void MergeSort(){
		
	}

}
