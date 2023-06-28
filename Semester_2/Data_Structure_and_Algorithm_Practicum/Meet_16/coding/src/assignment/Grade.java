package assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Grade {
    Student student;
    Course course;
    double grade;

    public Grade(Student student, Course course, double grade) {
        this.student = student;
        this.course = course;
        this.grade = grade;
    }

    List<Student> students = new ArrayList<>();
    List<Course> courses = new ArrayList<>();
    Queue<Grade> gradeQueue = new LinkedList<>();

    public void addToGradeQueue(Grade grade) {
        gradeQueue.add(grade);
    }

    public Grade removeFromGradeQueue() {
        return gradeQueue.poll();
    }

    public void addStudent(Student... student) {
        students.addAll(Arrays.asList(student));
    }

    public void addCourse(Course... course) {
        courses.addAll(Arrays.asList(course));
    }

    public void printStudent() {
        students.stream().forEach(student -> {
            System.out.println("" + student.toString());
        });
    }

    public void printCourse() {
        courses.stream().forEach(course -> {
            System.out.println("" + course.toString());
        });
    }

    Student searchStudent(String nim) {
        for (int i = 0; i < students.size(); i++) {
            if (nim.equals(students.get(i).studentId)) {
                return students.get(i);
            }
        }
        return null;
    }

    Course searchCourse(String code) {
        for (int i = 0; i < courses.size(); i++) {
            if (code.equals(courses.get(i).code)) {
                return courses.get(i);
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return student.studentId + "\t\t" + student.name + "\t" + "\t" + course.name + "\t" + "\t" + course.sks + "\t" + grade;
    }
}
