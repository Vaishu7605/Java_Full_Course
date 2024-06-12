
import java.util.Scanner;

public class Array {
// -------------1-d Array-------------//
    // public static void main(String[] args) {
    //     // ------first way for creating array---//
    //     // int a[] = {10, 20, 30, 40, 50};
    //     // ------first way for creating array---//
    //     int a[] = new int[5];
    //     System.out.println("Enter Array Elements: ");
    //     Scanner s = new Scanner(System.in);

    //     for (int i = 0; i < 5; i++) {
    //         a[i] = s.nextInt();
    //     }
    //     Arrays.sort(a);
    //     System.out.println(" Sorted Array Elements: ");
    //     // System.out.println(a[2]);
    //     // System.out.println(a[4]);
    //     {
    //         for (int b : a) {
    //             System.out.println(b + " ");
    //         }
    //     }
    // }
// -------------2-d Array-------------//
    public static void main(String[] args) {
        int a[][] = new int[2][2];
        System.out.print("Enter Array Elements: ");
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                a[i][j] = s.nextInt();
            }
        }
        System.out.print("\nMatrix Elements: ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

}
