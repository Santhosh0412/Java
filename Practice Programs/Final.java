abstract class sub {
    final double pi; 
    static int a;

    sub() { 
        this.pi = 3.14; 
    }

    static void initialization() {
        a = 5209;
        System.out.println(a);
    }
}
final class Fin extends sub {
    static void meth(){
        System.out.println("hello");
    }
    public static void main(String[] args) {
       
        Fin obj = new Fin(); 
        System.out.println(obj.pi); 
        initialization(); 
        meth();
    }
}
