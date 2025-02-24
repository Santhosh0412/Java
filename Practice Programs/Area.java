import java.util.Scanner;
abstract class Abstract {
    protected double area;
    abstract void calc_area();
    
}
class Area extends Abstract{
    private double r;
    public  void Area(){
        Scanner s=new Scanner(System.in);
        r=s.nextInt();

    }
    void calc_area(){
        area=3.14*r*r;
        System.out.println("Area:"+area);
    }
    public static void main(String[] args) {
        Area obj=new Area();
        obj.Area();
        obj.calc_area();
    }
}
