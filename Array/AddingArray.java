public class AddingArray {
    public static void main(String[]args){
        int arrA[]= {5,1,3,7}; 
        int arrB[] = {9,7,7,7};
        int quotient=0;
        int sum=0;
        int newValue[]=new int[arrA.length];
        for(int i=0;i<arrA.length;i++){
            for(int j=i;j<=i;j++){
                if(quotient==0){
                    sum=arrA[i]+arrB[j];
                }
                else{
                    sum=arrA[i]+arrB[j]+quotient;
                }
            }
            newValue[i]=sum%10;
            quotient=sum/10;

        }
        for(int num : newValue){
            System.out.print(num+" ");
        }
    }
    
}
