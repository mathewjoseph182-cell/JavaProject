package stringpackage;

import java.util.Scanner;

public class Word_count2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentence:");
        String s = sc.nextLine();

        String[] words = s.split(" ");

        for (String v : words) {
            System.out.println(v);
        }

        System.out.println("no of words :" + words.length);

        int index = words.length - 1; // to find the last index position
        String rev = "";

        for (int i = index; i >= 0; i--) {
            rev = rev + words[i] + " ";
        }

        // System.out.println();
        // System.out.println("Reversed sentance");
        // System.out.println(rev);
    }
}