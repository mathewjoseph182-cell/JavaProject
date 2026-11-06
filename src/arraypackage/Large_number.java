package arraypackage;

import java.util.Scanner;

public class Large_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] a = new int[5];

        System.out.println("Enter 5 numbers:");

        for (int i = 0; i < 5; i++) {
            a[i] = sc.nextInt();
        }

        int largest = a[0];

        for (int i = 1; i < 5; i++) {
            if (a[i] > largest) {
                largest = a[i];
            }
        }

        System.out.println("Largest number = " + largest);
    }
}
