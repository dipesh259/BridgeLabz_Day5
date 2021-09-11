				//Swap two number value

package learned;
import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temp = 0;

        System.out.println("Enter a value: ");
        int a = sc.nextInt();
        System.out.println("Enter b value: ");
        int b = sc.nextInt();


        temp = a;
        a = b;
        b = temp;

        System.out.println("a = "+a);
        System.out.println("b = "+b);

    }
}

