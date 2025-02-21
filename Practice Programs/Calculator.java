import java.util.Scanner;
public class Calculator {
    public void add(){
        Scanner s=new Scanner(System.in);
        System.out.println("enter no1:");
        int a=s.nextInt();
        System.out.println("enter no2:");
        int b=s.nextInt();
        int c=a+b;
        System.out.println(c);
    }
    public int diff(int a, int b){
        int c=a-b;
        return c;
    }
    public void mul(int a,int b){
        int c=a*b;
        System.out.println(c);
    }
    public int div(int a,int b){
        return(a/b);
    }
    public static void main(String[] args) {
        Calculator obj=new Calculator();
        obj.add();
        System.out.print("difference="+obj.diff(2,6));
        obj.mul(4,5);
        System.out.print("Division="+obj.div(10,6));


    }
}
