package U1T5;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class ExactChange {
    public static void main(String[] args) {
        // value of each coin (quarter, dime, nickel, penny), in that order
        final List<Double> COIN_VALUES = List.of(0.25, 0.1, 0.05, 0.01);
        // takes user input for total cash to be converted to coins
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter an amount in dollars and cents: ");
        double total = scanner.nextDouble();
        scanner.close();

        ArrayList<Integer> coins = new ArrayList<>();
        for (double coinValue : COIN_VALUES) {
            coins.add((int)(total / coinValue)); // adds amount of coins used to list
            total %= coinValue;
        }
        int sum = coins.stream().mapToInt(Integer::intValue).sum(); // gets sum of all coin amounts in the coins list
        System.out.println("The minimum number of coins is: " + sum);
        System.out.println(coins.get(0) + " quarters");
        System.out.println(coins.get(1) + " dimes");
        System.out.println(coins.get(2) + " nickels");
        System.out.println(coins.get(3) + " pennies");
    }
}