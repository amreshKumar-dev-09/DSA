import java.util.Scanner;

public class CompositeNumber {

    public static boolean isComposite(int n){
        if(n <= 1) return false;

        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if(isComposite(n))
            System.out.println(n + " is Composite");
        else
            System.out.println(n + " is NOT Composite");

        sc.close();
    }
}