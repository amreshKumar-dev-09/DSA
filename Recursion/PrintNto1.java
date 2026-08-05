class Operation{

    void print(int n,int i){

        if (n < i)return;

        System.out.println(n);

        print(n-1, i);

    }
}

//Time Complexity and space complexity is O(n)

public class PrintNto1 {
    public static void main(String[] args) {

        Operation obj = new Operation();
        obj.print(5, 1);
        
    }
    
}
