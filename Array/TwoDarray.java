public class TwoDarray{
    static int findmax(int max,int arr[][]){
        for(int i=1;i<arr.length;i++){
        for(int j=0;j<arr.length;j++){
            if(arr[i][j]>max){
                max=arr[i][j];
            }
        }
    }
    return max;
    }
    static int secmax(int max,int arr[][],int sec){
        for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr.length;j++){
            if(arr[i][j]>sec&&arr[i][j]<max){
                sec=arr[i][j];
            }
        }
    }
    return sec;
    } static int thirdmax(int arr[][],int sec,int third){
        for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr.length;j++){
            if(arr[i][j]>third&&arr[i][j]<sec){
                third=arr[i][j];
            }
        }
    }
    return third;
    }
    public static void main(String[]args){
    int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
    int firstmax=findmax(0,arr);
    int secmax=secmax(firstmax,arr,0);
    int thirdmax=thirdmax(arr,secmax,0);
    System.out.println(thirdmax +" is the third max value");
    } 
}