package practicum3;

public class Main {
    public static void main(String[] args) {
        ListStudent students = new ListStudent();
        Student student1 = new Student("20134", "Noureen", "021xxx1");
        Student student2 = new Student("20135", "Akhleema", "021xxx2");
        Student student3 = new Student("20136", "Shannum", "021xxx3");

        students.add(student1, student2, student3);
        students.print();
        students.update(students.linearSearch("20135"), new Student("20135", "Akhleema Lela", "021xxx2"));
        System.out.println();
        students.print();
    }
}
