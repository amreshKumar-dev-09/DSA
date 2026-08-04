import java.util.Scanner;

public class GCD{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        // Time complexity: O(log(min a,b))
        
        while(a > 0 && b > 0){
            if(a > b)
                a = a % b;
            else
                b = b % a;
        }

        if(a == 0)
        System.out.println("GCD: "+b);
    else
        System.out.println("GCD: "+a);

    sc.close();

    }
}