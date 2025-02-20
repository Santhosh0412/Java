import java.util.Scanner;
public class Function {
    Scanner s=new Scanner(System.in);
    public void input(){ 
        System.out.print("Name:");
        String name=s.nextLine();
        System.out.print("ID:");
        int id=s.nextInt();
        System.out.println();
        System.out.println("Name:"+name);
        System.out.print("ID"+id);

    }
    public static void main(String[]args){
        Function obj=new Function();
        obj.input();
    }
}