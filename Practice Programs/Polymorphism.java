import java.util.Scanner;
public class Polymorphism {
    static Scanner s=new Scanner(System.in);
    static void area(int a){
        int area=a*a;
        System.err.print("Area of Square:"+area);
    }
    static void area(int a,int b){
        int area=a*b;
        System.err.print("Area of Rectangle:"+area);
    }
    static void area(double a1,int a){
        double area=a1*(a*a);
        System.err.print("Area of Circle:"+area);
    }
    public static void main(String[] args) {
        System.out.println("enter the value:");
        int a=s.nextInt();
        System.out.println("enter the value:");
        int b=s.nextInt();
        double a1=3.14;
        area(a);
        System.out.println();
        area(a,b);
        System.out.println();
        area(a1,a);
    }}

