
import java.util.Scanner;

public class do_while_loop_1 {

    public static void main(String[] args) {
        int num;
        System.out.println("Enter any Number: ");
        Scanner s = new Scanner(System.in);
        num = s.nextInt();
        do {
            System.out.println(num);
            ++num;
        } while (num <= 10);
    }
}
