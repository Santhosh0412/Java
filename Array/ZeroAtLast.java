public class ZeroAtLast {
    public static void main(String[]args){
        int count=0;
        int arr[]={1,3,4,5,0,6,7,9,0,5,0,3};
        for (int i =0;i < arr.length;i++){
            if(arr[i]!=0){
                arr[count++] = arr[i];
            } 
        }
        while(count< arr.length){
            arr[count++]=0;
        }
        for(int k =0; k < arr.length;k++){
            System.out.print(arr[k]+" ");
        }
    }   
}
