package Exp2;

public class TestStudents {
    public static void main(String[] args) {
        Students students1 = new Students();
        students1.nim = 123;
        students1.name = "Azhar";
        students1.address = "Soekarno Hatta Street";
        students1.class_ = "2I";
        students1.printStudents();
        
        Students students2 = new Students();
        students2.nim = 456;
        students2.name = "Azhar";
        students2.address = "Soekarno Hatta Street";
        students2.class_ = "2I";
        students2.printStudents();
        
        Students students3 = new Students();
        students3.nim = 789;
        students3.name = "Rizqi";
        students3.address = "Soekarno Hatta Street";
        students3.class_ = "2I";
        students3.printStudents();
    }
}
