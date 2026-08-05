class Recursion{
    

    void print(int i, int n){

        if(i > n)return;

        System.out.println("Amresh");

        print(i+1,n);
    }

}

public class ConceptOfRecursion {
    public static void main(String[] args){

        Recursion obj = new Recursion();
        obj.print(1,5);

    }
    
}
