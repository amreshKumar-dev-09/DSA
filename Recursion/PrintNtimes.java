import java.util.Scanner;

class Name{

    void print(int i, int n){

        if(i > n)return;

        System.out.println(i);

        print(i+1,n);

    }
}

public class PrintNtimes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Name obj = new Name();
        obj.print(1,5);

        sc.close();

    }
    
}
