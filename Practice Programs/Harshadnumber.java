import java.util.Scanner;
public class Harshadnumber {
    public static void main(String[]args){
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int sum=0,r;
    int value=n;
    while(n!=0){
        r=n%10;
        sum=sum+r;
        n=n/10;
    }
    if(value%sum==0){
        System.out.print("yes");
    }else{
        System.out.print("no");
    }
}
}