import java.util.Scanner;
public class Score {
    public static void main(String[]args){
        System.out.print("Enter the Score:");
        Scanner s=new Scanner(System.in);
        int Score=s.nextInt();
        if(Score<50){
            System.out.println("You need to improve");
        }
        else if(Score>=50 && Score<70){
            System.out.print("Good job");
        }
        else if(Score>70){
            System.out.print("Exellent");
        }
    }
    
}

