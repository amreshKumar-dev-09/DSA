import java.util.Scanner;

public class AbsoluteValue {
    public static void main(String a[]){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        if(num >= 0)
            System.out.println("Absolute Value: "+num);

        else 
            System.out.println("Absolute Value: "+(-(num)));


    }
}