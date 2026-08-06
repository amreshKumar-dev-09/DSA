import java.util.Scanner;

class Operation{
    int index(int n){

        if(n <= 1)return n;

        int last = index(n-1);
        int slast = index(n-2);

        return last + slast;

    }
}
// Time complexity is O(2^n);
// Space complexity is O(n)

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n = sc.nextInt();  
        
        Operation obj = new Operation();
        System.out.println("The value at the given index is " + obj.index(n) + " in fibonacci series(0 - n)");

        sc.close();
    }
    
}
