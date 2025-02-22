public class MethodHidding {
    static void display(){
        System.out.println("In super class");
    }
    
}
class main{
    public static void main(String[] args){
        MethodHidding obj=new MethodHidding();
        obj.display();
    }
}
class sub extends MethodHidding{
    static void display(){
        System.out.println("In sub class");
    }

}