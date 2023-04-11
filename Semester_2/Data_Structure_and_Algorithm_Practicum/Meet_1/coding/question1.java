import java.util.*;

public class question1 {
    public static void main(String[] args) {
        
	Scanner scanner = new Scanner(System.in);
	double assignment, mid_exam, final_exam, final_score;
	
	System.out.print("Insert value of assignment : ");
	assignment = scanner.nextDouble();

	System.out.print("Insert value of mid exam : ");
	mid_exam = scanner.nextDouble();

	System.out.print("Insert value of final exam : ");
	final_exam = scanner.nextDouble();
	
	final_score = (assignment * 0.20) + (mid_exam * 0.35) + (final_exam * 0.45);
	
	result(final_score);

    }

	static void result(double final_score) {
		if (final_score > 80 && final_score <= 100) {
                	System.out.println("Final score = " + final_score);
                	System.out.println("A");
			System.out.println("Passed");
        	} else if (final_score > 73 && final_score <= 80) {
        	        System.out.println("Final score = " + final_score);
                	System.out.println("B+");
			System.out.println("Passed");
        	} else if (final_score > 65 && final_score <= 73) {
                	System.out.println("Final score = " + final_score);
                	System.out.println("B");
					System.out.println("Passed");
        	} else if (final_score > 60 && final_score <= 65) {
                	System.out.println("Final score = " + final_score);
                	System.out.println("C+");
					System.out.println("Passed");
        	} else if (final_score > 50 && final_score <= 60) {
                	System.out.println("Final score = " + final_score);
                	System.out.println("C");
					System.out.println("Passed");
        	} else if (final_score > 39 && final_score <= 50) {
                	System.out.println("Final score = " + final_score);
                	System.out.println("D");
					System.out.println("Failed");
        	} else {
                	System.out.println("Final score = " + final_score);
                	System.out.println("E");
					System.out.println("Failed");
        	}

	}

}
