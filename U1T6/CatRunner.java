public class CatRunner {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Butters", 5, 16.4);
        cat1.introduce();
        cat1.printCatInfo();

        Cat cat2 = new Cat("Caroline", 14, 13.08);
        cat2.printCatInfo();
        cat2.introduce();
    }
}
