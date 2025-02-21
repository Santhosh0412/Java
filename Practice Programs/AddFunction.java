import java.util.Scanner;
public class AddFunction {
    Scanner s=new Scanner(System.in);
    void sum(){
        int a=s.nextInt();
        int b=s.nextInt();
        System.out.println(a+b);
    }
    public static void main(String[] args) {
    AddFunction obj=new AddFunction();
        obj.sum();
    }
}
