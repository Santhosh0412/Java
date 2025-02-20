public class Car {
    String brand;
    Car(){
        brand="unknown";
        System.out.println(brand);
    }
    public void Setbrand(){
        brand="BMW";
        System.out.print("Brand:"+brand);
    }
    public static void main(String[] args) {
        Car obj=new Car();
        obj.Setbrand();
}
}