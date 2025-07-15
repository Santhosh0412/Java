public class GCD{
    public static void main(String[] args) {
        int a = 56;
        int b = 98;
        while(a!=b){
            if(a>b){
                a=a-b;
            }
            else{
                b=b-a;
            }
        }
        System.out.println(a);
    }
}
  
