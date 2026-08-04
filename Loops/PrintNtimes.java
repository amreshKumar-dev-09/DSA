import java.util.Scanner;

class Name{
    int count = 1;

    void print(String name){

        if(count > 5)return;

        System.out.println(name);
        count++;

        print(name);

    }
}



public class PrintNtimes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Name obj = new Name();
        obj.print("Amresh");

        sc.close();

    }
    
}
