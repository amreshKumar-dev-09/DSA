import java.util.Scanner;

public class ProfitAndLossChecker {
    public static void main(String a[]){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter cost price of an item: ");
        double cp = sc.nextDouble();

        System.out.println("Enter selling price of an item: ");
        double sp = sc.nextDouble();

        if(sp > cp){

            double profit = (sp-cp)/cp*100;

            System.out.println("Profit: "+profit+"%");
        }

        else if(sp < cp){

            double loss = (cp-sp)/cp*100;

            System.out.println("Loss: "+loss+"%");
        }

        else
            System.out.println("No Profit No Loss");
            

        sc.close();

    }
}
