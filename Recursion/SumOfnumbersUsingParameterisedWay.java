class sumRecursion{

    void sum(int i, int sum){

        if(i < 1){
        System.out.println(sum);
        return;
        }
            
        sum(i-1,sum + i);
    }
}

/*
Time Complexity: O(n)
Space Complexity: O(n) due to recursion stack
*/

public class SumOfnumbersUsingParameterisedWay{
    public static void main(String[] args) {

        sumRecursion obj = new sumRecursion();
        obj.sum(5, 0);
        
    }
}