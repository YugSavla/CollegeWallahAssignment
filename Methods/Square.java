//package CollegeWallahAssignment.Methods;

import java.util.Scanner;

public class Square {
  private static void square(int n){
    for (int i = 1; i <= n; i++) {
        System.out.println(" Square is : "+(i*i));
    }
  }  
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number a n");
    int n=sc.nextInt();
    square(n);
}
}
