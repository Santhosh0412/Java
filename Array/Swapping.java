public class Swapping {
    public static void main(String[] args) {
        int arr[][] = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int r = arr.length;
        int c = arr[0].length;
        int prev, curr;
        int row = 0, col = 0;

        prev = arr[row + 1][col]; 
        for (int i = col; i < c; i++) {
            curr = arr[row][i];
            arr[row][i] = prev;
            prev = curr;
        }
        row++; 
        for (int i = row; i < r; i++) {
            curr = arr[i][c - 1];
            arr[i][c - 1] = prev;
            prev = curr;
        }
        c--;
        if (row < r) {
            for (int i = c - 1; i >= col; i--) {
                curr = arr[r - 1][i];
                arr[r - 1][i] = prev;
                prev = curr;
            }
        }
        r--;
        if (col < c) {
            for (int i = r - 1; i >= row; i--) {
                curr = arr[i][col];
                arr[i][col] = prev;
                prev = curr;
            }
        }
        col++;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
