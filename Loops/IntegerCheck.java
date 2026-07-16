import java.util.Scanner;

public class IntegerCheck {
    public static void main(String a[]){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a real number: ");
        double n = sc.nextDouble();
        int x  = (int)n;

        if(n-x == 0)
            System.out.println("Is an integer ");
        else 
            System.out.println("Not an integer ");

    }
    
}
