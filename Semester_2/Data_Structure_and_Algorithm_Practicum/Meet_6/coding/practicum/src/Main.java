import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        StudentList data = new StudentList();
        int n = 3;

        for (int i = 0; i < n; i++) {
            System.out.print("Name = ");
            String name = scanner.next();
            System.out.print("Enterance Year = ");
            int year = scanner.nextInt();
            System.out.print("Age = ");
            int age = scanner.nextInt();
            System.out.print("GPA = ");
            double gpa = scanner.nextDouble();

            Student students = new Student(name, year, age, gpa);
            data.add(students);
        }
        System.out.println();
        
        System.out.println("Unsorted Student List");
        data.print();
        System.out.println();
        
        
        System.out.println("Data Student after sorting bubble sort acording GPA");
        data.bubbleSort();
        data.print();

        System.out.println();

        System.out.println("Data student after selection sort");
        data.selectionSort();
        data.print();

        System.out.println();

        System.out.println("Data student after insertion sort");
        data.insertionSort(true);
        data.print();

        scanner.close();
    }
}
