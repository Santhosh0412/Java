public class ConsecutiveNum {
    public static void main(String[]args){
        int arr[]={1,1,0,1,1,0,0,1,0,1,1,1,1,1,0};
        int prev= 0;
        int count= 0;  
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                count++;
            }
            else if(arr[i]==0){
                if(prev<=count){
                    prev=count;
             
                }
                count=0;
            }
            else{
                System.out.println("No such value");
            }
        }
        if(prev>=count){
            System.out.println("No of consecutive one's:"+prev);
        }
        else{
            System.out.println("No of consecutive one's:"+count);
        }
    }
}
