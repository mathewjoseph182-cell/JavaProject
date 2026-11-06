package stringpackage;

import java.util.Scanner;

public class Vowelcount {

    public static void main(String[] args) {
        System.out.println("Enter a word:");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        
        // 1. Convert to lowercase so uppercase vowels are also counted
        String s1 = s.toLowerCase();
        
        // 2. Convert the lowercase string into the character array
        char c[] = s1.toCharArray();
        int Vowelcount = 0;

        for (char temp : c) {
            if (temp == 'a' || temp == 'e' || temp == 'i' || temp == 'o' || temp == 'u') {
                Vowelcount++;
            }
        }
        System.out.println("Vowelcount=" + Vowelcount);
    }
}