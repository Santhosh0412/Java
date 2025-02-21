import java.util.Scanner;
public class privatescope {
    private int a,b,c;
    private void get(){
        Scanner s=new Scanner(System.in);
        a=s.nextInt();
        b=s.nextInt();
    }
     public void sum(){
        get();
        c=a+b;
        System.out.println("summ="+c);
     }
     class Main{
        public static void main(String[] args){
            privatescope obj=new privatescope();
            obj.get();

        }
    
     }
    
}
