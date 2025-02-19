public class Transpose {

    public void TransposeArray() {
        int arr[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int rowEnd = arr.length;
        int colEnd = arr[0].length;

        for (int i = 0; i < rowEnd; i++) {
            for (int j = i; j < colEnd; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        for (int i = 0; i < rowEnd; i++) {
            for (int j = 0; j < colEnd; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void AddElement() {
        int arr[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int n = arr.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sum += arr[i][j];
            }
        }
        System.out.println("Sum of elements: " + sum);
    }

    public static void main(String[] args) {
        Transpose obj = new Transpose();
        obj.TransposeArray();
        System.out.println();
        obj.AddElement();
    }
}
