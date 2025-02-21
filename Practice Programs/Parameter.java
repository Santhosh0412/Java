public class Parameter {
    void getchocolate(int price1,int price2){
        System.out.println(price1+price2);
        System.out.println("Purchased");

    }void getsoap(int price){
        System.out.println(price);
        System.out.println("Purchased");

    }void getpowder(int price){
        System.out.println(price);
        System.out.println("Purchased");

    }
    public static void main(String[] args) {
        Parameter obj=new Parameter();
        obj.getchocolate(20,30);
        obj.getsoap(30);
        obj.getpowder(40);
    }
}
