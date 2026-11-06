package practicepgms;

import java.util.Scanner;

public class Charcount {

    public static void main(String[] args) {
        System.out.println("Enter a word:");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine(); // Captures the whole input, including spaces
        System.out.println(s);

        Charcount obj = new Charcount();
        int c = obj.display(s);
        System.out.println("Count = " + c);
        
        sc.close(); // Recommended to close the scanner resource
    }

    public int display(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                count++;
            }
        }
        return count;
    }
}