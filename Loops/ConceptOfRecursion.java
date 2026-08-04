class Recursion{

    int count = 0;

    void print(){

        if(count == 4)return;

        System.out.println(count);
        count++;

        print();
    }

}


public class ConceptOfRecursion {
    public static void main(String[] args){

        Recursion obj = new Recursion();
        obj.print();

    }
    
}
