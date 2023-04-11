public class Student {
    public String name;
    public int entryYear, age;
    public double gpa;

    Student(String name, int entryYear, int age, double gpa) {
        this.name = name;
        this.entryYear = entryYear;
        this.age = age;
        this.gpa = gpa;
    }

    void print() {
        System.out.println("Name = " + name);
        System.out.println("Entry Year = " + entryYear);
        System.out.println("Age = " + age);
        System.out.println("GPA = " + gpa);
    }
}
