import java.util.Scanner;

public class SumOfDigits {
     public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        long n = sc.nextLong();

        int sum = 0 ;

        
        while(n != 0){
            sum += n%10 ;
            n /= 10;
        }

        System.out.println("Sum: "+sum);


        sc.close();
     }
}
