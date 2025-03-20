public class CombinationNumber {
    public static void main(String[] args) {
        int sum=0;
        int candidates[]={2,3,6,7};
        int target=7;
        int c=0;
        int n=candidates.length;
        int val=0;
        int new_arr[]=new int[10];
        for(int i=0;i<n;i++){
            sum=candidates[i]+sum;
            if(sum<target){
                new_arr[c]=candidates[i];
                c++;
            }
            new_arr[c+1]=target-sum;
            if(candidates[i]==target){
                c++;
                new_arr[c]=target;
            }
            if(candidates[i]%target==0){
                val=candidates[i]/target;
                for(int j=0;j<val;j++){
                    new_arr[c]=candidates[i];
                    c++;
                }
                break; 
            }
        }
        for(int k:new_arr){
            System.out.print(k);
        }
    }
}
