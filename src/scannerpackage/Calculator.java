package scannerpackage;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int a;
        int b;
        char e;

        do {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter two numbers: ");
            a = sc.nextInt();
            b = sc.nextInt();

            System.out.println("Choose an Operation +,-,*,/");
            e = sc.next().charAt(0);

            switch (e) {
                case '+':
                    System.out.println(a + b);
                    break;

                case '-':
                    System.out.println(a - b);
                    break;

                case '*':
                    System.out.println(a * b);
                    break;

                case '/':
                    System.out.println(a / b);
                    break;

                default:
                    System.out.println("Invalid Input");
            }

            System.out.println("Do you want to continue...?Y/N");
            e = sc.next().charAt(0);
        } while (e == 'y' || e == 'Y');

        System.out.println("Thank you");
    }
}