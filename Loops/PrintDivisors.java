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
        for (int i = 1; i*i <= n; i++){

            if (n % i == 0){
             list.add(i);

              if (i != n/i ){
                 list.add(n/i);
              }
               
            }

        }
        
        Collections.sort(list);

        System.out.println("Divisors of "+n+" are: "+list);

        sc.close();


    }
}