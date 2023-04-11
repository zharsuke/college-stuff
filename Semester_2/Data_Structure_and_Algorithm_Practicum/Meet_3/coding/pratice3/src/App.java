import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int amount;
        double ipk, totalIpk = 0;
        String name, nim, gender;
        System.out.print("Insert amount of students : ");
        amount = scanner.nextInt();
        Student [] students = new Student[amount];
        for (int i = 0; i < amount; i++) {
            System.out.printf("Insert %d student\n", (i+1));
            System.out.print("Name : ");
            name = scanner.next();
            System.out.print("Nim : ");
            nim = scanner.next();
            System.out.print("Gender : ");
            gender = scanner.next();
            System.out.print("Ipk : ");
            ipk = scanner.nextDouble();
            students[i] = new Student(name, nim, gender, ipk);
            totalIpk += ipk;
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < amount; i++) {
            System.out.println((i+1) + " Student data");
            System.out.println("Name = " + students[i].name);
            System.out.println("Nim = " + students[i].nim);
            System.out.println("Gender = " + students[i].gender);
            System.out.println("Ipk = " + students[i].ipk);
            System.out.println();
        }
        System.out.println();
        double avg = totalIpk / amount;
        System.out.println("Average Ipk of all students = " + avg);
    }
}
