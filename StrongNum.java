public class StrongNum
{
    static int Fact(int n){
        int value=1;
        for(int i=n;i>0;i--){
            value=value*i;
        }
        return value;
    }
    static int split(int n,int sum){
        while(n>0){
            int last=n%10;
            n=n/10;
            sum=sum+Fact(last);
        }
        return sum;
    }
	public static void main(String[] args) {
		int number = 145;
        int sumOfFactorials = split(number,0);
        if(sumOfFactorials==number){
            System.out.print(sumOfFactorials+"is strong");
        }else{
            System.out.print(sumOfFactorials+"is not strong");
        }
       
	}
}