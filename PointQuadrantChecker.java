import java.util.Scanner;

public class PointQuadrantChecker {

    public static String findLocation(int x, int y) {
        if (x == 0 && y == 0) {
            return "Point is at the Origin";
        } else if (x == 0) {
            return "Point lies on Y-axis";
        } else if (y == 0) {
            return "Point lies on X-axis";
        } else if (x > 0 && y > 0) {
            return "Point lies in First Quadrant";
        } else if (x < 0 && y > 0) {
            return "Point lies in Second Quadrant";
        } else if (x < 0 && y < 0) {
            return "Point lies in Third Quadrant";
        } else {
            return "Point lies in Fourth Quadrant";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter X: ");
        int x = sc.nextInt();

        System.out.print("Enter Y: ");
        int y = sc.nextInt();

        System.out.println(findLocation(x, y));

        sc.close();
    }
}
