package U1T10;

class Runner {
    public static void main(String[] args) {
        // testing BabyParrot class
        BabyParrot baby = new BabyParrot("Toucan", 3, 4.25);
        baby.setName("Lil' Beans");
        String info = baby.parrotInfo();
        System.out.println(info);
        // testing Student class
        Student student = new Student("Abby", "Smith", 2023);
        student.addTestScore(95);
        student.addTestScore(98);
        System.out.println(student.getStudentInfo());
    }
}