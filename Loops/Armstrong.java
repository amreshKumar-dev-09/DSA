import java.util.Scanner;

public class Armstrong{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Digit: ");
        int n = sc. nextInt();

        int temp= 0;
        int count = 0;
        int copy = n;
        int original = n;

        while(copy > 0){

        count++;
        copy = copy/10;
        }

        while(n > 0){

        int lastdigit = n%10;

        int power = 1;
        for (int i = 1; i <= count; i++){
            power = power * lastdigit;
        }

        temp = temp + power;
        n = n/10;

        }

       
        if(temp == original)
        System.out.println("Armstrong Number");
    else
    System.out.println("Not a Armstrong Number");

    }
}