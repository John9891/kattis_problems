import java.util.Scanner;

public class PrintedStatues {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int n =input.nextInt();
		int num = 0;
		int pot = 1;
		
		if(n==1){
			System.out.println(1);
		}else{
			
			while(n>num){
				
				num = (int) Math.pow(2, pot);
				pot+=1;				
			}
			System.out.println(pot);
		}			
		
		input.close();

	}

}
