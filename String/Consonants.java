import java.util.Scanner;

public class Consonants {
    private static boolean isCons(char ch){
        if(ch=='a' || ch=='e'|| ch=='i'||ch=='o' ||ch=='u' ) {return false;}
        else if(ch=='A' || ch=='E'|| ch=='I'||ch=='O' ||ch=='U' ) {return false;}
        return true;
    }
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your string");
        String str=sc.nextLine();int count=0;
        for (int i = 0; i < str.length(); i++) {
           
            if(isCons(str.charAt(i))==true) {
                count++;
            }
        }
        System.out.println("Numberof characters having consonants is: "+count);
    }
}
