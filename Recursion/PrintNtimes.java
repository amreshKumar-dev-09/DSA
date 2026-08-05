import java.util.Scanner;

class operation{

    void print(int i, int n){

        if(i > n)return;

        System.out.println(i);

        print(i+1,n);

    }
}

public class PrintNtimes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        operation obj = new operation();
        obj.print(1,5);

        sc.close();

    }
    
}
