import java.util.Scanner;
public class Inheritence {
    Scanner s=new Scanner(System.in);
    private int x;
    private int y;
    private int z;
    void sum(){
        System.out.print("Enter value:");
        x=s.nextInt();
        System.out.print("Enter value:");
        y=s.nextInt();
        z=x+y;
        System.out.println(z);
    }
    public static void main(String[]args){
        third obj=new third();
        obj.sum();
        obj.sum2();
        obj.sum3();
    }
    
}
class second extends Inheritence{
    protected int a;
    protected int b;
    protected int c;
    void sum2(){
    System.out.print("Enter value:");
        a=s.nextInt();
        System.out.print("Enter value:");
        b=s.nextInt();
        c=a+b;
        System.out.println(c);
    }
}
class third extends second{
    int c;
    int d;
    int e;
    void sum3(){
    System.out.print("Enter value:");
        c=s.nextInt();
        System.out.print("Enter value:");
        d=s.nextInt();
        e=c+d;
        System.out.println(e);
    }}