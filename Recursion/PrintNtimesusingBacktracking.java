class Backtracking{
  void print(int n){

    if(n < 1)return;

    print(n - 1);
    System.out.println(n);
 }
}

public class PrintNtimesusingBacktracking {
    public static void main(String[] args){

        Backtracking obj = new Backtracking();
        obj.print(5);
    

    }
    
}
