import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class PrintDivisors{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

         List<Integer> list = new ArrayList<>();

        System.out.println("Enter a Digit: ");
        int n = sc. nextInt();

        // i <= Math.sqrt(n);
        // O(sqrt(n))
        for (int i = 1; i*i <= n; i++){

            if (n % i == 0){
             list.add(i);

              if (i != n/i ){
                 list.add(n/i);
              }
               
            }

        }
        // O(no of factors * log(no of factors)): n i the number of factors
        
        Collections.sort(list);

        // O(numbers of factors)

        System.out.println("Divisors of "+n+" are: "+list);

        sc.close();


    }
}