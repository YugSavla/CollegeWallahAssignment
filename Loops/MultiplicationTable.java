package CollegeWallahAssignment;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, i, k;
        System.out.println("enter a number of table");
        n = sc.nextInt();
        for (i = 1; i <= 10; i++) {
            System.out.println(n + " * " + i + " is " + (n * i));
        }
    }
}
