import java.util.Scanner;
public class Average {
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        System.out.print("s1:");
        int s1=s.nextInt();
        System.out.print("s2:");
        int s2=s.nextInt();
        System.out.print("s3:");
        int s3=s.nextInt();
        System.out.print("s4:");
        int s4=s.nextInt();
        System.out.print("s5:");
        int s5=s.nextInt();
        int totalmark =s1+s2+s3+s4+s5;
        int Average=totalmark/5;
        if(Average<35){
            System.out.println("Additional class is required");
        }
        else{

            System.out.print("Your good to go");
        }
        
    }
    
}

