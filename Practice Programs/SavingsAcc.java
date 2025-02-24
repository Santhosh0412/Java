import java.util.Scanner;
abstract class Bankaccount{
    private int AccNo;
    private int Bal;
    static int interest_rate;
    abstract void calculateinterest();
}
class SavingsAcc extends Bankaccount{
    Scanner s=new Scanner(System.in); 
    public void calculateinterest(){
        int AccNo=s.nextInt();
        int Bal=s.nextInt();
        int pri=1000;
        interest_rate=23;
        int n=10;
        int interest_amount=pri*interest_rate*n;
        System.out.println(AccNo);
        System.out.println(Bal);
        System.out.println(interest_amount);
    }
    public static void main(String[]args){
        SavingsAcc obj=new SavingsAcc();
        obj.calculateinterest();

}
    class CurAcc extends Bankaccount{
        Scanner s=new Scanner(System.in); 
        public void calculateinterest(){
            int AccNo=s.nextInt();
            int Bal=s.nextInt();
            int pri=1000;
            interest_rate=23;
            int n=10;
            int interest_amount=pri*interest_rate*n;
            System.out.println(AccNo);
            System.out.println(Bal);
            System.out.println(interest_amount);
        }
    }
}

   