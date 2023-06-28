package practicum3;

public class Student {
    String name, nim, telephone;
    
    public Student() {

    }

    public Student(String nim, String name, String telephone) {
        this.name = name;
        this.nim = nim;
        this.telephone = telephone;
    }

    @Override
    public String toString() {
        return "Student{" + "nim =" + nim + ", name =" + name + ", telephone =" + telephone + '}';
    }
}
