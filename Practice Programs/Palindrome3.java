import java.util.Scanner;
public class Palindrome3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter NO:");
        int num=sc.nextInt();
        int og=num;
        int rev=0;
        while(num!=0){
            int digit=num%10;
            rev=rev*10+digit;
            num=num/10;
        }
        if(og==rev){
            System.out.println("is palindrome");
        }
        else{
            System.out.println("is not  palindrome");
        }
    }
}
