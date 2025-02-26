public class NewPattern {
    public static void main(String[] args) {
        int n=5;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i%2!=0){
                    if(j==1||j==3){
                        System.out.print("0");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                else{
                    if(j==1||j==3){
                        System.out.print(" ");
                    }
                    else{
                        System.out.print("0");
                    }
                }
            }
            System.out.println();
        }
        
    }
    
}
