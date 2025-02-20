import java.util.Scanner;
public class Loan {
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter your Salary:");
        int Salary=s.nextInt();
        System.out.print("Enter your Age:"); 
        int age=s.nextInt();   
        if(Salary>=20000 || age>=25){
            System.out.print("Enter loan amount:");
            int loan=s.nextInt();
            if(50000>=loan){
                System.out.print("Eligible for loan");
            }
            if(loan>50000){
                System.out.print("Maximum loan amount is 50000");

            }
        }
        else{
            System.out.print("Not Eligible");
        }
    }
    
}
