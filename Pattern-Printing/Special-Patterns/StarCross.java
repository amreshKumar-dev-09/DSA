import java.util.Scanner;

public class StarCross {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size (n x n): ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a positive number");
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {

                if (i == j || i + j == n + 1)
                    System.out.print("* ");
                else
                    System.out.print("# ");
            }
            System.out.println();
        }

        sc.close();
    }
}

