import java.util.Scanner;
public class TernaryOperator {
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter number1:");
        int num1=s.nextInt();
        System.out.print("Enter number2:");
        int num2=s.nextInt();
        String result= (num1>num2)?"yes":"no";
        System.out.println(result);
    }
    
}
