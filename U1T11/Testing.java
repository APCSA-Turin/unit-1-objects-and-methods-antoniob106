package U1T11;

import java.util.Scanner;

public class Testing {
    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String word1 = scan.nextLine();
        System.out.print("Enter second string: ");
        String word2 = scan.nextLine();
        scan.close();
        if (word1.length() == word2.length()) {
            System.out.println("Both strings have the same length");
        } else if (word1.length() > word2.length()) {
            System.out.println(word1 + " is longer");
        } else {
            System.out.println(word2 + " is longer");
        }
        System.out.println("First half: " + word1.substring(0, word1.length() / 2));
        System.out.println("Second half: " + word1.substring( word1.length() / 2));
        System.out.println("First half: " + word2.substring(0, word2.length() / 2));
        System.out.println("Second half: " + word2.substring(word2.length() / 2));
        int index = word1.indexOf(word2);
        if (index != -1) {
            System.out.println(word2 + " is found in " + word1 + " at index " + index);
        } else {
            System.out.println(word2 + " is NOT found in " + word1);
        }
    }
}