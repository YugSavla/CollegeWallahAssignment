import java.util.Scanner;

public class CountVowel {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str=sc.next();
        int count=0;boolean flag=false;
        
        for (int i = 0; i < str.length(); i++) {
            int[] arr={0,0,0,0,0};
            for (int j = i; j < str.length(); j++) {
                char  ch=str.charAt(j);
                if(ch=='a'){ 
                    arr[0]++;
                }
                else if(ch=='e'){ 
                    arr[1]++;
                }
                else if(ch=='i'){ 
                    arr[2]++;
                }
                else if(ch=='o'){ 
                    arr[3]++;
                }
                else if(ch=='u'){ 
                    arr[4]++;
                }
                else { break;}
                if (arr[0] > 0 && arr[1] > 0 && arr[2] > 0 && arr[3] > 0 && arr[4] > 0) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
