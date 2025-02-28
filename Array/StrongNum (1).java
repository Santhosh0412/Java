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
		for(int i=1;i<=1000;i++){
        int sumOfFactorials = split(i,0);
        if(sumOfFactorials==i){
            System.out.println(i+"is strong");
        }
        }
       
	}
}