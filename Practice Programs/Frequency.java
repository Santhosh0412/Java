public class Frequency {
    public static void main(String[]args){
        int arr[]={6,8,2,1};
        int n=arr.length;
        int temp;
       for(int i=0;i<=n-i;i++){
        for(int j=i;j<=n-1;j++){
            if(arr[i]>arr[j]){
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
        
    }
    }
    for(int i:arr){
        System.out.print(i+" ");
    }    
    }
    
}
