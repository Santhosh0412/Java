public class Square {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int k = 1; k < i; k++) {
                if ((i == 2 && k == 2) || (i == 3 && (k == 1 || k == 2 || k == 3)) || (i == 4 && k == 2)) {
                    System.out.print("+ ");
                } else {
                    System.out.print("  ");
                }
            }
            for (int j = i; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
