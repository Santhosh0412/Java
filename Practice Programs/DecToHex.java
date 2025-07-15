public class DecToHex {
    public static void main(String[] args) {
        int n=190;
    String hex="";
    char[]hexChars={'0', '1', '2', '3', '4', '5', '6', '7','8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    int temp=n;
    while(temp>0){
        int digit=temp%16;
        hex=hexChars[digit]+hex;
        temp=temp/16;
    }
    System.out.println(hex);
    }
}
