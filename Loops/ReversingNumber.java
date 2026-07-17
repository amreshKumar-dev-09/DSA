import java.util.Scanner;

public class ReversingNumber {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        long n = sc.nextLong();

        long reverseNumber = 0;

        while(n != 0){

        
             reverseNumber *= 10;
             reverseNumber += n%10;
             
             n /= 10;
        }

        System.out.println(reverseNumber);


    }
}
