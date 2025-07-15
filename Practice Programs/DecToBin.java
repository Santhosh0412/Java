public class DecToBin {
    public static void main(String[] args) {
        int n=5;
    int temp=n;
    String binary="";
    while(temp>0){
        int digit=temp%2;
        binary=digit+binary;
        temp=temp/2;
        
    }
    System.out.println(binary);
    }
}
