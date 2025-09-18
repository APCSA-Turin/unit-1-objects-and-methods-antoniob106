import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Player 1, enter your name: ");
        String name1 = scanner.nextLine();

        System.out.print("Enter your number: ");
        Double number1 = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Player 2, enter your name: ");
        String name2 = scanner.nextLine();

        System.out.print("Enter your number: ");
        Double number2 = scanner.nextDouble();

        scanner.close();

        if (number1 > number2) {
            System.out.println(name1 + "'s number is bigger!");
        } else if (number2 > number1) {
            System.out.println(name2 + "'s number is bigger!");
        } else {
            System.out.println("The numbers are equal!");
        }
    }
}
