import java.util.Scanner;

public class DivisibilityCheck {
    public static void main(String a[]){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        if(num %5 == 0)
            System.out.println("Riya");

        else if(num %3 == 0)
            System.out.println("Ranu");

        else if(num %5 ==0 && num %3 == 0)
            System.out.println("Apurva");

        else if(num %5 ==0 || num %3 == 0)
            System.out.println("Isha");

        else
            System.out.println("Input is not valid for this application");

    }
}
