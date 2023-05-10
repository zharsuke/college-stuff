package num1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Insert Sentence : ");
        String sentence = scanner.nextLine();
        Sentence data = new Sentence(sentence);

        for (int i = 0; i < sentence.length(); i++) {
            data.push(sentence.charAt(i));
        }
        System.out.println();
        System.out.println("Result : ");

        for (int i = 0; i < sentence.length(); i++) {
            System.out.print(data.pop());
        }

        scanner.close();
    }
}
