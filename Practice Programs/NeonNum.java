public class NeonNum {
    public static void main(String[] args) {
        int n =1;
        int sq=n*n;
        int sum=0;
        while(sq!=0){
            int digit=sq%10;
            sum=sum+digit;
            sq=sq/10;
        }if(sum==n){
            System.out.println("yes");
        }else{
           System.out.println("No"); 
        }
    }
}
