public class StrongNum {
    public static void main(String[]args){
        int num=145;
        int sum=0,temp;
        int fact;
        while(num>0){
            temp=num%10;
            int x=fact(temp);;
            sum=sum+temp;
            num=num/10;
        }
        if(num==sum){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }
}
