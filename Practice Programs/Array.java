import java.util.Scanner;
public class Array {
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        System.out.print("Size:");
        int size=s.nextInt();
        System.out.println("Enter mark");
        int[]mark=new int[size];
        for(int i=0;i<size;i=i+1){
            mark[i]=s.nextInt();
        }
            if(size%2!=0){
                System.out.println("middle:"+mark[(size/2)]);
        }else{
            System.out.println(mark[(size/2)-1] + "&"+ mark[(size/2)]);
        }
    }
}
