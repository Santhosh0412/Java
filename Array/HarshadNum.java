public class HarshadNum{
    static int split(int n,int sum){
        while(n>0){
        int  rem=n%10;
        n=n/10;
        sum=sum+rem;
        }
        return sum;
    }
    public static void main(String[]args){
        int a=500;
        int b=2500;
        for(int i=a;i<=b;i++){
            if(i%split(i,0)==0){
                System.out.println(i+" is a Harshad value");
            }
        } 
    }
}