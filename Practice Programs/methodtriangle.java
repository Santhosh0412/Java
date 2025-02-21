public class methodtriangle {
    int n =5;
    public void Righttriangle(){
    for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            System.out.print("*");
        } 
        System.out.println();
       }
    }
    public void Lefttriangle(){
        for(int i=1;i<=n;i++){
            for(int j=n-i;j>=0;j--){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("*");

            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        methodtriangle obj=new methodtriangle();
        obj.Righttriangle();
        obj.Lefttriangle();
    }
    
}
