
import java.util.Scanner;

public class condition_if_else {

    public static void main(String[] args) {
        // int pwd;
        // System.out.println("Enter Password: ");
        // Scanner obj = new Scanner(System.in);
        // pwd = obj.nextInt();
        // if (pwd == 2731) {
        //     System.out.println("My Name: Vaishnavi");
        //     System.out.println("My age: 20");
        //     System.out.println("My Address: Prayagraj ");
        // } else {
        //     System.out.println("Sorry! Wrong Password.....");
        // }
        int age;
        System.out.println("Enter Age: ");
        Scanner obj = new Scanner(System.in);
        age = obj.nextInt();
        if (age >= 18) {
            System.out.println("You can Vote ...");
        } else {
            System.out.println("You cannot vote !!!");
        }

    }
}
