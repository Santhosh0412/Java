public class DecToOct {
    public static void main(String[] args) {
        int n=10;
        int temp=n;
        String Octal="";
        while(temp>0){
            int digit=temp%8;
            Octal=digit+Octal;
            temp=temp/8;
        }
        System.out.println(Octal);
    }
}
