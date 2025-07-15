import java.util.Scanner;
public class Amstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter No:");
        int num=sc.nextInt();
        int og=num;
        int sum=0;
        while(num!=0){
            int digit=num%10;
            sum=sum+digit*digit*digit;
            num=num/10;
        }
        if(og==sum){
            System.out.println("is Amstrong");
        }
        else{
            System.out.println("is not Amstrong");
        }
    }
}
