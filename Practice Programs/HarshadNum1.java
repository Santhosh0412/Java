public class HarshadNum1 {
    public static void main(String[] args) {
        int num=18;
        int sum=0;
        int temp=num;
        while(temp>0){
            int digit=temp%10;
            sum=sum+digit;
            temp=temp/10;
        }
        if(num%sum==0){
            System.out.println("yes");
        }else{
            System.out.println("No");
        }
    }
}
