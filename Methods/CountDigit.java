import java.util.*;
class SquareAndDigit{
    void square(int n){
            System.out.println("Square is " + (n*n));

    }
    void digit(int n){
        int i=0;
        while(n!=0){
            n/=10;
            i++;
        }
        System.out.println("Total digits are "+i);;
    }
}
class CountDigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n natural numbers");
        int n=sc.nextInt();
        SquareAndDigit s=new SquareAndDigit();
        s.square(n);
        s.digit(n);

    }
}