package U1T11Lab2;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int score = 0;
        System.out.print("Enter first word: ");
        String previous = scan.nextLine();
        String current = previous;
        int totalWords = 1;
        int alphabeticOrder;

        while (score < 50) {
            System.out.print("Enter next word: ");
            previous = current;
            current = scan.nextLine();
            totalWords++;
            alphabeticOrder = current.compareTo(previous);

            if (alphabeticOrder == 0) {
                score -= 10;
                System.out.println("-10 points: current word same as previous word; SCORE: " + score);
            } else if (alphabeticOrder > 0) {
                score += 2;
                System.out.println("+2 points: current word alphabetically after; SCORE: " + score);
            } else if (alphabeticOrder < 0) {
                score -= 5;
                System.out.println("-5 points: current word alphabetically before; SCORE: " + score);
            }
            //checks if the last 2 characters of the previous word are the same as the first 2 characters of the current word
            if (previous.substring( previous.length()-2,previous.length() ).equals( current.substring(0,2) )) {
                score += 5;
                System.out.println("+5 points: last 2 letters of previous match first 2 letters of current; SCORE: " + score);
            }
            
            if (current.contains( previous.substring(0,1) )) {
                score += 3;
                System.out.println("+3 points: first letter of previous word found in current word; SCORE: " + score);
            }
        }
        scan.close();
        System.out.println("You win! It took you " + totalWords + " words! Try again for a lower word count :)");
    }
}