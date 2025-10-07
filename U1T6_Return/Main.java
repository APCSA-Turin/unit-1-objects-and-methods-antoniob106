package U1T6_Return;

public class Main {
    public static void main(String[] args) {
        ChatBot debbie = new ChatBot("Debbie", 7);
        debbie.greeting("Antonio");
        debbie.weather();
        debbie.favoriteNumber(9);

        double meters = debbie.convertFeetToMeters(6);
        System.out.println("6 feet are equal to " + meters + " meters!");

        int sum = debbie.addNumbers(3,5,6);
        System.out.println("3 + 5 + 6 is equal to " + sum + ".");

        String goodbye = debbie.goodbye();
        System.out.println(goodbye);

        debbie.emotion("excited");

        int favoriteNumbersTogether = debbie.favoriteNumbersTogether(9);
        System.out.println("The sum of our favorite numbers is equal to " + favoriteNumbersTogether + ".");

        double roundedNumber = debbie.roundNumber(14.7);
        System.out.println("14.7 rounded is equal to " + roundedNumber + ".");

        String reversedName = debbie.reverseName();
        System.out.println("My name backwards is " + reversedName + "!");

        String combinedWord = debbie.combineWords("Black", "Rock");
        System.out.println(combinedWord);

        debbie.thanks();
    }
}