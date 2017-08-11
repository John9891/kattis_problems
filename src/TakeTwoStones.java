
public class TakeTwoStones {

	public static void main(String[] args) {
		Kattio input = new Kattio(System.in, System.out);
        int n = input.getInt();			
		if(n%2==0){System.out.print("Bob");}
		else{System.out.print("Alice");}
	}
}
