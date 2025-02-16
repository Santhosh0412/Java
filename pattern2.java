public class pattern2 {
    public static void main(String[] args) {
        int i;
        int j;
        int n=4;
        int k;
        int l;
        int q=0;
        for(i=1;i<=n;i++){
            System.out.println(" ");
            for(j=n-i;j>=1;j--){
                System.out.print(" ");
            }
            for(k=1;k<=i+q;k++){
                System.out.print("*");
            }
            for(l=n-i;l>=1;l--){
                System.out.print(" ");
            }
            
            q++;
        }
    }
}
        
