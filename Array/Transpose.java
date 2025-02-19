public class Transpose {
    public static void main(String[]args){
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        int rowStart=0;
        int colStart=0;
        int rowEnd=arr.length;
        int colEnd=arr[0].length;
        for (int i=0;i<=rowEnd;i++){
            for(int j=i;j<colEnd;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;

            }
        }
        for (int i = 0; i <rowEnd; i++) {
            for (int j = 0; j < colEnd; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
    }
    
}
}
