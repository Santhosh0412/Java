public class reverseintegerAssignment {
    public int reverse(int a) {
        int rev = 0;
        while (a != 0) {
            int d = a % 10;
            a /= 10;
            if (rev > Integer.MAX_VALUE / 10 || (rev== Integer.MAX_VALUE / 10 && d > 7)) {
                return 0;
            }
            if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && d < -8)) {
                return 0;
            }
            rev = rev * 10 + d;
        }
        return rev;
    }
}