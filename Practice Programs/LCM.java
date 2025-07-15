public class LCM {
    public static void main(String[] args) {
        int a=52;
        int b= 38;
        int x=a;
        int y=b;
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        int gcd=a;
        int lcm=(x*y)/gcd;
        System.out.println(lcm);

    }
}
