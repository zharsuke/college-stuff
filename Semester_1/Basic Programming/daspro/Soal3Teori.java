/**
 *
 * @author Mentari
 */
import java.util.Scanner;
public class Soal3Teori {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int totalItem,aS,aM,aL,bS,bM,bL,cS,cM,cL,dS,dM,dL,itemDiscountA,noDiscountA,totalA;
        float aPrice,bPrice,cPrice,dPrice;
        int status; 
        System.out.println("How many items will you buy :");
        totalItem = input.nextInt();
        
        System.out.println("Do you buy brand a?Ya.1, No.0");
        status = input.nextInt();
        if(status==1)
        {
            System.out.println("How many items of Brand a : ");
            totalA = input.nextInt();
            System.out.println("How many items of a Brand in size S");
            aS = input.nextInt();
            System.out.println("How many items of a Brand in size M");
            aM = input.nextInt();
            System.out.println("How many items of a Brand in size L");
            aL = input.nextInt();
            
            itemDiscountA = totalA/2;
            noDiscountA = totalA%2;
            
        }
        
        System.out.println("Do you buy brand b?Ya.1, No.0");
        status = input.nextInt();
        if(status==1)
        {
            System.out.println("How many items of b Brand in size S");
            bS = input.nextInt();
            System.out.println("How many items of b Brand in size M");
            bM = input.nextInt();
            System.out.println("How many items of b Brand in size L");
            bL = input.nextInt();
        }
        System.out.println("Do you buy brand c?Ya.1, No.0");
        status = input.nextInt();
        if(status==1)
        {
            System.out.println("How many items of c Brand in size S");
            cS = input.nextInt();
            System.out.println("How many items of c Brand in size M");
            cM = input.nextInt();
            System.out.println("How many items of c Brand in size L");
            cL = input.nextInt();
            cPrice = (cS*95000)+(cM*100000)+(cL*105000);
            if(cPrice>200000)
                cPrice = (cPrice-(cPrice*0.2f));
        }
        System.out.println("Do you buy brand d?Ya.1, No.0");
        status = input.nextInt();
        if(status==1)
        {
            System.out.println("How many items of d Brand in size S");
            dS = input.nextInt();
            System.out.println("How many items of d Brand in size M");
            dM = input.nextInt();
            System.out.println("How many items of d Brand in size L");
            dL = input.nextInt();
            
            dPrice = (dS*105000)+(dM*110000)+(dL*115000);
        }
    }
    
}
