import java.util.Scanner;
public class Divisible {
    public static void main(String[]args){
        System.out.print("Enter number:");
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        if(num%3==0 && num%5==0){
            System.out.println("The no is Divisible by 3 and 5");
        }
        else{
            System.out.print("The no is not Divisible by 3 and 5");
        }
    }
    
}
