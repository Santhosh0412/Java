public class Palindrome1 {
    static void check_palindrome(String str){
        char ch[]=str.toCharArray();
        String rev =new StringBuilder(str).reverse().toString();
        char ch1[]=rev.toCharArray();
        int count=0;
        if(rev.equals(str)){
            System.out.print("0");
        }
        else{
            for(int i=0;i<str.length()-1;i++){
                if(i<str.length()/2){
                    if(ch[i]!=ch1[i]){
                        ch1[i]=ch[i];
                        count++;
                    }
                }
                }
            }
            System.out.print(count);
        }
    public static void main(String args[]){
        String str="santhosh";
        check_palindrome(str);
    }
}