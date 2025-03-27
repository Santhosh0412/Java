import java.util.Scanner;
public class DecimalToHex  {
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the num:");
        int num =s.nextInt();
        String hex=Integer.toHexString(num).toUpperCase();
        System.out.println(hex);
        


    }
    
}
