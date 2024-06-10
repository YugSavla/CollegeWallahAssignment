import java.util.*;
class Pattern5{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        for (int i = 1; i <= n * 2 - 1; i++) {
            // Determine the number of elements to print in this row
            int elements = (i <= n) ? i : (n * 2 - i);
            // Print increasing and decreasing numbers
            for (int j = 1; j <= elements; j++) {
                System.out.print( "* ");
            }
            System.out.println(); // Move to the next line
        }
    }
}