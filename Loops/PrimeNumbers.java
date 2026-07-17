import java.util.Scanner;

public class PrimeNumbers{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        boolean IsPrime = true;

        if(n <= 1){
            IsPrime = false;
        }

        for(int i = 2; i <= n/2; i++){
            if(n % i == 0){
                IsPrime = false;
                break;
            }
        }

        if(IsPrime)
            System.out.println(n + " is a Prime Number");

        else
            System.out.println(n + " is not a Prime Number");

        sc.close();
    }
}