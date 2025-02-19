import java.util.Scanner;
public class Scholarship {
    public static void main(String[]args){
        System.out.print("Enter your Income:");
        Scanner s=new Scanner(System.in);
        int Scholarship=s.nextInt();
        if(Scholarship>=7000){
            System.out.println("Eligible");
        }
        else{
            System.out.print("Not Eligible");
        }
    }
    
}
