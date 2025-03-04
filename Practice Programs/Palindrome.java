public class Palindrome{
    static void StringBuiltin(String str){
        String reversedStr = new StringBuilder(str).reverse().toString();
        if (str.equals(reversedStr)) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
    }
    static void WithoutBuiltIn(String str1) {
        boolean isPalindrome = true;
        int length = str1.length();
        for (int i = 0; i < length / 2; i++) {
            if (str1.charAt(i) != str1.charAt(length - i - 1)) {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome) {
            System.out.println(str1 + " is a palindrome.");
        } else {
            System.out.println(str1 + " is not a palindrome.");
        }
    }
    static void StringBuffer(String str2) {
        StringBuffer sb = new StringBuffer(str2);
        sb.reverse();
        String reversedStr = sb.toString();
        if (str2.equals(reversedStr)) {
            System.out.println(str2 + " is a palindrome.");
        } else {
            System.out.println(str2 + " is not a palindrome.");
        }
    }
    public static void main(String[]args){
        String str="level";
        StringBuiltin(str);
        String str1="Racecar";
        WithoutBuiltIn(str1);
        String str2="madam";
        StringBuffer(str2);
    }
}
