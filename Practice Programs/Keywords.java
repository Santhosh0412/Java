public class Keywords {
        int getchocolate(int price1,int price2){
            return price1+price2;
    
        }void getsoap(int price){
            System.out.println(price);
            System.out.println("Purchased");
    
        }void getpowder(int price){
            System.out.println(price);
            System.out.println("Purchased");
    
        }
        public static void main(String[] args) {
            Keywords obj=new Keywords();
            int a=obj.getchocolate(20,30);
            System.out.println(a);
            obj.getsoap(30);
            obj.getpowder(40);
        }
    }
    


