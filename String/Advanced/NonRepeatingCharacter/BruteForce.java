public class BruteForce {
    public static void main(String[] args) {

        String str = "geeksforgeeks";

        for(int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);
            boolean found = false;

            for(int j = 0; j < str.length(); j++) {

                if(i != j && ch == str.charAt(j)) {
                    found = true;
                    break;
                }
            }

            if(!found) {
                System.out.println(ch);
            }
        }
    }
}