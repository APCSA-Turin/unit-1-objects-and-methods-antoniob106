public class Student {
    
    private String name;
    private int age;
    private double gpa;

    public Student(String studentName, int studentAge, double studentGPA) {
        name = studentName;
        age = studentAge;
        gpa = studentGPA;
    }

    public void introduceStudent() {
        System.out.println("Hello! My name is " + name + ", and I'm " + age + " years old. My current gpa is: " + gpa + ".");
    }
}
