import java.util.Scanner;
public class Count {
    public static void main(String[]args){ 
        int Evencount=0;
        int oddcount=0;
        Scanner s=new Scanner(System.in);
        System.out.println("Num 1:");
        int a=s.nextInt();
        System.out.println("Num 2:");
        int b=s.nextInt();
        for(int i=a;i<=b;i=i+1){
            if(i%2==0){
                Evencount=Evencount+1;
            }
            else{
                oddcount=oddcount+1;
                
            }

        }
        System.out.println("Evencount:"+Evencount);
        System.out.println("Oddcount:"+oddcount);
    }
    
}
