import java.util.Scanner;

public class U1T4Lab2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello! You will have to correctly guess the next number in the pattern.");
        
        Integer baseNumber = (int)(Math.random()*11);

        baseNumber *= 7;
        System.out.println(baseNumber);
        baseNumber /= 2;
        System.out.println(baseNumber);
        baseNumber -= 3;
        System.out.println(baseNumber);
        baseNumber --;
        System.out.println(baseNumber);
        baseNumber %= 4;
        System.out.println(baseNumber);
        baseNumber++;
        System.out.println(baseNumber);

        while(true) {
            System.out.print("Next number: ");
            Integer answer = scanner.nextInt();

            if (answer==baseNumber*7) {
                System.out.println("Great job!");
                break;
            }
            else {
                System.out.println("Not it! Try again.");
            }
        }
        scanner.close();
        System.out.println("Done!");
    }
}