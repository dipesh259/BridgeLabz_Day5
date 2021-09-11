				//Check for Vowel or Consonant

package learned;

import java.util.Scanner;

public class VowelsConsonent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an alphabet");
        char alpha = sc.next().charAt(0);

        if ( alpha == 'a' || alpha == 'e' || alpha == 'i' || alpha == 'u')
            System.out.println("It is vowel");
        else
            System.out.println("It is a consonant");
    }
}
