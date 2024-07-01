import java.util.Scanner;

public class StringToInteger {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number in the form of String");
        String str= sc.next();
        int num=0;
        for (int i = 0; i < str.length(); i++) {
            int x=((int)str.charAt(i))-48;
            num=num*10+x;
            
        }
        System.out.println(num);
    }
}
