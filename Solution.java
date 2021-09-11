				//Power of 2

package learned;
import java.util.Scanner;

public class power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter N Value: ");
         double N = sc.nextDouble();

        System.out.println("Enter Number: ");
        double num = sc.nextDouble();

        System.out.println(Math.pow(num, N));
    }
}

