package Exp3;

public class CooperativeDemo {
    public static void main(String[] args) {
     Member member1 = new Member("Azhar", "Mawar Street");
     System.out.println("Savings : " + member1.getName() + " : Rp " + member1.getSaving());
     member1.setName("AL Azhar");
     member1.setAddress("Sukarno Hatta Street No. 1");
     member1.deposit(100_000);
     System.out.println("Savings " + member1.getName() + " : Rp " + member1.getSaving());
     
     member1.loan(50_000);
     System.out.println("Savings " + member1.getName() + " : Rp " + member1.getSaving());
    }
}
