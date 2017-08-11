public class FizzBuzz {
    public static void main(String[] args) {
        Kattio input = new Kattio(System.in, System.out);

        int num_X = input.getInt();        
        int num_Y = input.getInt();
        int N = input.getInt();

        for(int i = 1; i <= N; i++){
            if((i%num_X) == 0 && (i%num_Y) == 0){input.println("FizzBuzz");}
            else if((i%num_X) == 0){input.println("Fizz");}
            else if((i%num_Y) == 0){input.println("Buzz");}
            else{input.println(i);}
        }
        input.close();
    }
}
