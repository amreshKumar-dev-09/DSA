class Backtracking{
  void print(int i,int n){

    if(i > n)return;

    print(i + 1,n);
    System.out.println(i);
 }
}


public class PrintNto1UsingBacktracking {
    public static void main(String[] args) {
        
        Backtracking obj = new Backtracking();
        obj.print(1,5);
    }
    
}
