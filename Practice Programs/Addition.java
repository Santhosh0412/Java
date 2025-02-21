import java.util.Scanner;
public class Addition {
    public int a,b,c;
    public void sum(){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the value:");
        int a=s.nextInt();
        System.out.print("Enter the value:");
        int b=s.nextInt();
        int c=a+b;
        System.out.println(c);
    }
    public static void main(String[] args) {
        Addition obj=new Addition();
        Scanner s=new Scanner(System.in);
        obj.a=s.nextInt();
        obj.b=s.nextInt();
        obj.c=obj.a+obj.b;
        System.out.println(obj.c);

    }
    
}
