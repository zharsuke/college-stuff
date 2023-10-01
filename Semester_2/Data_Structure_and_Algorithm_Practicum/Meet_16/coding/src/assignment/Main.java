package assignment;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int menu;
        String studentId, courseStd;
        List<Grade> gradeList = new ArrayList<>();
        Grade grade = new Grade(null, null, 0);
        
        Student student1 = new Student("Thalhah", "20001", "021xxx");
        Student student2 = new Student("Zubair", "20002", "021xxx");
        Student student3 = new Student("Abdur", "20003", "021xxx");
        Student student4 = new Student("Sa'ad", "20004", "021xxx");
        Student student5 = new Student("Sa'id", "20005", "021xxx");
        Student student6 = new Student("Ubaidah", "20006", "021xxx");
        grade.addStudent(student1, student2, student3, student4, student5, student6);

        Course course1 = new Course("Internet of Things", "00001", 3);
        Course course2 = new Course("Data Structure and Algorithm", "00002", 2);
        Course course3 = new Course("Algorithm and Programming", "00003",2);
        Course course4 = new Course("Data Structure and Algorithm Practicum", "00004", 3);
        Course course5 = new Course("Algorithm and Programming Practicum", "00005", 3);
        grade.addCourse(course1, course2, course3, course4, course5);

        do {
            System.out.println("=============================================");
            System.out.println("Semester Student Grade Data Processing System");
            System.out.println("=============================================");
            System.out.println("1. Input Data");
            System.out.println("2. Print Data");
            System.out.println("3. Search Student's Grade");
            System.out.println("4. Sort Grades");
            System.out.println("5. Delete Data Student");
            System.out.println("6. Exit");
            System.out.println("=============================================");
            System.out.print("Choose menu\t: ");
            menu = scanner.nextInt();
            
            switch (menu) {
                case 1:
                    System.out.println("Insert Data");
                    System.out.print("Code\t: ");
                    String code = scanner.next();
                    System.out.print("grade\t: ");
                    double gradeStd = scanner.nextDouble();
                    System.out.println("List Student");
                    System.out.println("=============================================");
                    System.out.println("Student ID\tName\t\tTelephone");
                    grade.printStudent();
                    System.out.println("=============================================");
                    System.out.print("Search Student by student id\t: ");
                    studentId = scanner.next();
                    Student student = grade.searchStudent(studentId);
                    System.out.println("List Course");
                    System.out.println("=============================================");
                    System.out.println("Code\t\tCourse\t\t\t\t\t\t\tSks");
                    grade.printCourse();
                    System.out.println("=============================================");
                    System.out.print("Search Course by code\t: ");
                    courseStd = scanner.next();
                    Course course = grade.searchCourse(courseStd);
                    Grade grade1 = new Grade(student, course, gradeStd);
                    gradeList.add(grade1);
                    break;

                case 2:
                    System.out.println("List Grade Student");
                    System.out.println("=============================================");
                    System.out.println("Student ID\tName\t\tCourse\t\t\t\tSKS\tGrade");
                    for (int i = 0; i < gradeList.size(); i++) {
                        System.out.println(gradeList.get(i).toString());
                    }
                    break;
                
                case 3:
                    System.out.println("List Grade Student");
                    System.out.println("=============================================");
                    System.out.println("Student ID\tName\t\tCourse\t\t\t\tSKS\tGrade");
                    for (int i = 0; i < gradeList.size(); i++) {
                        System.out.println(gradeList.get(i).toString());
                    }
                    System.out.println("=============================================");
                    System.out.print("Insert student data [Student ID]\t: ");
                    studentId = scanner.next();
                    int totalSks = 0;
                    boolean isFound = true;
                    System.out.println("Student ID\tName\t\tCourse\t\t\t\tSKS\tGrade");
                    for (int i = 0; i < gradeList.size(); i++) {
                        if (gradeList.get(i).student.studentId.equals(studentId)) {
                            System.out.println(gradeList.get(i).toString());
                            totalSks += gradeList.get(i).course.sks;
                        }
                    }
                    if (!isFound) {
                        System.out.println("Data student with student id " + studentId + " not found");
                    } else {
                        System.out.println("Total SKS " + totalSks + " already taken");
                    }
                    break;
                
                case 4:
                    System.out.println("List Grade Student");
                    System.out.println("=============================================");
                    System.out.println("Student ID\tName\t\tCourse\t\t\t\tSKS\tGrade");
                    gradeList.sort(Comparator.comparing(g -> g.grade));
                    for (int i = 0; i < gradeList.size(); i++) {
                        System.out.println(gradeList.get(i).toString());
                    }
                    break;

                case 5:
                    System.out.print("Insert student data [Student ID]: ");
                    studentId = scanner.next();
                    boolean isRemoved = false;
                    
                    for (int i = 0; i < gradeList.size(); i++) {
                        Grade currentGrade = gradeList.get(i);
                        if (currentGrade.student.studentId.equals(studentId)) {
                            gradeList.remove(i);
                            isRemoved = true;
                            break;
                        }
                    }   
                    
                    if (isRemoved) {
                        System.out.println("Data with student ID " + studentId + " has been removed.");
                    } else {
                        System.out.println("Data with student ID " + studentId + " not found.");
                    }
                    
                    break;
                
                case 6:
                    System.out.println("Thank you. Exiting the program.");
                    System.exit(0);
                    break;
                
                default:
                    System.out.println("Invalid menu choice.");
                    break;
                }

                System.out.println();
            } while (menu != 6);
            scanner.close();
        }

        public static void inputData() {
        Scanner scanner = new Scanner(System.in);

        
        scanner.close();
    }
}
