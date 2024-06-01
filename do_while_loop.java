
import java.util.Scanner;

public class do_while_loop {

    public static void main(String[] args) {
        int num;
        System.out.println("Enter any Number: ");
        Scanner s = new Scanner(System.in);
        num = s.nextInt();
        do {
            System.out.println("Learn Coding...");
        } while (num < 0);
    }
}
