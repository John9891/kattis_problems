import java.util.Scanner;
public class Pot {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int numAddens = input.nextInt();
		long total = 0;
		for (int i = 0; i<numAddens; i++)
		{
			int n = input.nextInt();
			total+=Math.pow(n/10,n%10);
		}
		System.out.println(total);
		input.close();
		}
	}
