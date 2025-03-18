public class  palindromeAssignment{
    public boolean isPalindrome(int x) {
       if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        int revHalf = 0;
        while (x > revHalf) {
            revHalf = revHalf * 10 + x % 10;
            x /= 10;
        }
        return x == revHalf || x == revHalf / 10;
    }
    public static void main(String[] args) {
        palindromeAssignment s = new palindromeAssignment();
        
        int x = 121;
        System.out.println(s.isPalindrome(x));  
        x = -121;
        System.out.println(s.isPalindrome(x));  
         x = 10;
        System.out.println(s.isPalindrome(x));  
    }
}