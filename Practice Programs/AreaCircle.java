import java.util.Scanner;
abstract class AreaCircle{
    static double area;
    static double circumference;
    static void calc_area(){
        Scanner s=new Scanner(System.in);
        int r=s.nextInt();
        area=3.14*r*r;
        System.out.println(area);
    }
    static void calc_circumference(){
        Scanner s=new Scanner(System.in);
        int r=s.nextInt();
        circumference=2*3.14*r;
        System.out.println(circumference);

    }
    public static void main(String[] args) {
       calc_area();
       calc_circumference();
    }
}

