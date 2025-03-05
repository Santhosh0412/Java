class Shape{
    int l;
    int b;
    Shape(int l,int b){
        this.l=l;
        this.b=b;
    }
    void Area(){
        System.out.println("Area of Rectangle");
    }
  }
    class Rectangle extends Shape{
            Rectangle(int l,int b){
                super(l,b);
            }
            void Area(){
               int area=l*b;
                System.out.print(area);
            }
            }
            public class Inheritance{
            public static void main(String[]args){
                Rectangle obj=new Rectangle(5,6);
                obj.Area();
            }
            }