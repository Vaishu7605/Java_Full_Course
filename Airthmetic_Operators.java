
import java.util.Scanner;

public class Airthmetic_Operators {

    public static void main(String[] args) {
        int a, b, c, ch;
        System.out.println("Enter any Two Numbers: ");
        Scanner s = new Scanner(System.in);
        a = s.nextInt();
        b = s.nextInt();
        System.out.println("Enter your Operations choice: ");
        ch = s.nextInt();

        switch (ch) {
            case 1:
                c = a + b;
                System.out.println("Addition: " + c);
                break;
            case 2:
                c = a - b;
                System.out.println("Substraction: " + c);
                break;
            case 3:
                c = a * b;
                System.out.println("Multiplication: " + c);
                break;
            case 4:
                c = a / b;
                System.out.println("division: " + c);
                break;
            case 5:
                c = a % b;
                System.out.println("Modulus: " + c);
                break;
            default:
                System.out.println("Invalid choice...");
        }

    }
}
