import java.util.Scanner;;

public class PrintingNumbersInDecrementOrder {
    public static void main(String a[]){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        System.out.println("Number from "+n+" to 1: ");
        for(int i=n;i>=1;i--){
            System.out.print(i + " ");
         
        }

    }
}
