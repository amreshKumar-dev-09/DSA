import java.util.Scanner;

class sumRecursion{
    int sum(int n){
        if(n < 1){
            return 0;
        }
        return n+sum(n-1);
    }
}

/*
Time Complexity: O(n)
Space Complexity: O(n) due to recursion stack
*/

public class SumOfnumbersUsingFunctionalRecursion{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        sumRecursion obj = new sumRecursion();

        System.out.println("SUM: " + obj.sum(n));
        
    }
}