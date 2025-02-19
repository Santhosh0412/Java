public class SubArray {
    public static void main(String[] args) {
        int A[] = {1, 1, 1, 0, 1, 1, 0, 1, 1, 0, 1, 1};
        int B[] = {1, 1, 1, 0};
        boolean found = false;
        for (int i = 0; i <= A.length - B.length; i++) {
            boolean isSubArray = true;
            for (int j = 0; j < B.length; j++) {
                if (A[i + j] != B[j]) {
                    isSubArray = false;
                    break;
                }
            }
            if (isSubArray) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
