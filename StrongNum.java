public class StrongNum{
    public static void main(String[] args) {
        int num=145;
        int sum=0;
        int temp=num;
        while(temp>0){
            int digit=num%10;
            int fact=1;
            for(int i=1;i<=digit;i++){
                fact=fact*i;
            }
            sum=sum+fact;
            temp=temp/10;
        }
        if(sum==num){
            System.out.print("yes");
        }else{
         System.out.print("No");

        }
    }
}