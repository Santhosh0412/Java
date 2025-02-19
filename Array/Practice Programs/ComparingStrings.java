import java.util.Scanner;
public class ComparingStrings {
    public static void main(String[]args){
        System.out.print(" Mehana Dead or Not:");
        Scanner s=new Scanner(System.in);
        String Mehana=s.nextLine();
        if(Mehana.equals("dead")){
            System.out.print("Surya meets ramya");
        }
        else{
            System.out.print("Surya weds mehana");
        }
    }
    
}
