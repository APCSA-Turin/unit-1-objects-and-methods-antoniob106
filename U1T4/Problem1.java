import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your name: ");
        String name = scanner.nextLine();
        
        System.out.println("Welcome " + name + "!");

        System.out.print("Please enter the first integer: ");
        Integer firstInt = scanner.nextInt();

        System.out.print("Please enter the second integer: ");
        Integer secondInt = scanner.nextInt();
        
        System.out.print("Please enter the third integer: ");
        Integer thirdInt = scanner.nextInt();

        Double average = (double)((firstInt+secondInt+thirdInt)/3);

        System.out.println("The average of " + firstInt + ", " + secondInt + ", " + "and " + thirdInt + " is " + average);
    }
}