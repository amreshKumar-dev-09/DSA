// Take 3 positive integers input and that tell if they can be the sides of a triangle //

import java.util.Scanner;

public class SidesOfTriangle {
    public static void main(String a[]){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first side of triangle: ");
        int s1 = sc.nextInt();

        System.out.println("Enter second side of triangle: ");
        int s2 = sc.nextInt();

        System.out.println("Enter Third side of triangle: ");
        int s3 = sc.nextInt();

         boolean isTriangle = (s1 > 0 && s2 > 0 && s3 > 0 &&
                              s1 + s2 > s3 &&
                              s2 + s3 > s1 &&
                              s3 + s1 > s2);

        if(isTriangle)
            System.out.println(s1 + ", " + s2 + ", and " + s3 + " are sides of a triangle");
        else
            System.out.println(s1 + ", " + s2 + ", and " + s3 + " are NOT sides of a triangle");

    }
}
