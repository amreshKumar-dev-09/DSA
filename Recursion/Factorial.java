import java.util.Scanner;

class Operation{

    int fact(int n){

        if (n == 0){
            return 1;
        }

        return n * fact(n - 1); 
            
    }
}

// Time and space complexity is O(n).

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        Operation obj = new Operation();
        System.out.println("Factorial: " + obj.fact(n));
        
    }
    
}
