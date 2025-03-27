public class BitwiseEO{
    public static void main(String[]args){
        int num=5;
        int result=num | 1 ;
        if(result>num){
            System.out.print("Even");
        }else{
            System.out.print("Odd");
        }
    }
}
