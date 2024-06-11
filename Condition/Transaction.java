//package CollegeWallahAssignment.Condition;

import java.util.Scanner;

public class Transaction {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Cost Price ");
        float cp=sc.nextFloat();
        System.out.println("Enter Selling Price ");
        float sp=sc.nextFloat();
        float transact=sp-cp;
        if(transact>0) System.out.println("Profit by "+transact+" rupees");
        else if(transact==0) System.out.println("break-even");
        else System.out.println("Loss"+(-transact)+" rupees");
    }
}
