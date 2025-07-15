public class NumOfDigit {
    public static void main(String[] args) {
        int num=0;
        int count=0;
        int temp=num;
        if(temp==0){
            count=1;
        }else{
        while(temp!=0){
           temp=temp/10;
           count++;
        }
    }
        System.out.print(count);
    }
}
