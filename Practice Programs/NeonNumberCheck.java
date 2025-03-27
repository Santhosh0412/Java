public class NeonNumberCheck {
    public static void main(String[]args){
        int num=9;
        int square=num*num;
        int sum=0;
        while(square>0){
            sum=sum+square%10;
            square=square/10;
        }
        if(num==sum){
            System.out.print("is neon");
        }else{
            System.out.println("is not neon");
        }
    }
    
}
