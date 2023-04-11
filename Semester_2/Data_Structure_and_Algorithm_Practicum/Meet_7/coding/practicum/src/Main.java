import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insert amount of student : ");
        int amountStudent = scanner.nextInt();
        SearchStudent data = new SearchStudent(amountStudent);

        System.out.println("==============================================");
        System.out.println("Input student data accordingly from smallest NIM");
        for (int i = 0; i < amountStudent; i++) {
            System.out.println("==============================================");
            System.out.print("NIM\t: ");
            int nim = scanner.nextInt();
            scanner.nextLine(); // consume the remaining newline character
            System.out.print("Name\t: ");
            String name = scanner.nextLine();
            System.out.print("Age\t: ");
            int age = scanner.nextInt();
            System.out.print("GPA\t: ");
            double gpa = scanner.nextDouble();
            
            Students std = new Students(nim, age, name, gpa);
            data.add(std);
        }
        
        System.out.println("==============================================");
        System.out.println("Entire Student Data");
        data.display();
        
        System.out.println();
        
        System.out.println("==============================================");
        System.out.println("Entire Student Data After Sorting");
        data.bubbleSort();
        data.display();
        
        System.out.println();

        System.out.println("==============================================");
        System.out.print("Search student by Name : ");
        String search = scanner.next();
        System.out.println("Using Sequential Search");
        int position = data.findSeqSearch(search);

        System.out.println();

        data.showPosition(search, position);
        System.out.println();
        data.showData(search, position);

        System.out.println();
        
        // System.out.println("==============================================");
        // System.out.print("Search student by NIM : ");
        // System.out.println("Using Binary Search");
        // int position1 = data.findBinarySearch(search, 0, amountStudent-1);

        // System.out.println();

        // data.showPosition(search, position1);
        // System.out.println();
        // data.showData(search, position1);


        scanner.close();
    }
}
