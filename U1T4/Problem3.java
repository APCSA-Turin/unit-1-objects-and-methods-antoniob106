import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Please enter a 3-digit integer: ");
        Integer number = scanner.nextInt();

        scanner.close();

        System.out.print("The reverse of " + number + " is: ");
        while (number > 0) {
            System.out.print(number%10);
            number /= 10;
        }
    }
}