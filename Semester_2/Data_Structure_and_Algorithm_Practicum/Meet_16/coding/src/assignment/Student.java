package assignment;

class Student {
    String name;
    String studentId;
    String telephone;

    public Student(String name, String studentId, String telephone) {
        this.name = name;
        this.studentId = studentId;
        this.telephone = telephone;
    }

    @Override
    public String toString() {
        return studentId + "\t\t" + name + "\t\t" + telephone;
    }
}