public class PrintingPositiveNumbersOfASeries{
    public static void main(String[] args){

        // Series - 99 , 95 , 91 , 87.......
        int start = 99;
        int diff = 4;

        System.out.println("Positive numbers of the given series: ");
        for(int i = start; i >= 1; i -= diff){
            System.out.print(i + " ");
        }
    }
}