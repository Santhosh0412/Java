public class Swapping {
    public static void main(String[] args) {
        int arr[][] = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int r = arr.length;
        int c = arr[0].length;
        rotateMatrix(arr, r, c);
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    static void rotateMatrix(int[][] mat, int r, int c) {
        int[][] rotated = new int[c][r];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                rotated[j][r - 1 - i] = mat[i][j];
            }
        }
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++) {
                mat[i][j] = rotated[i][j];
            }
        }
    }
}
