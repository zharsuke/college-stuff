package practicum3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListStudent {
    List<Student> students = new ArrayList<>();

    public void add(Student... student) {
        students.addAll(Arrays.asList(student));
    }

    public void delete(int index) {
        students.remove(index);
    }

    public void update(int index, Student student) {
        students.set(index, student);
    }

    public void print() {
        students.stream().forEach(student -> {
            System.out.println("" + student.toString());
        });
    }

    int linearSearch(String nim) {
        for(int i = 0; i < students.size(); i++) {
            if (nim.equals(students.get(i).nim)) {
                return i;
            }
        }
        return -1;
    }

    int binarySearch(String nim) {
        Student key = new Student(nim, "", "");
        return Collections.binarySearch(students, key, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.nim.compareTo(s2.nim);
            }
        });
    }

    public void sort() {
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.nim.compareTo(s2.nim);
            }
        });
    }
}
