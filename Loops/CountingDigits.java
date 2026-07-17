import java.util.Scanner;


public class CountingDigits {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        long n = sc.nextLong();

        int count = 0 ;

        while(n != 0){
            n /= 10;
             count++;
        }
       
        System.out.println("Numbers of digits are: "+count++);
       

        

    }
}
