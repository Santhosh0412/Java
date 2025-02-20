public class Car {
    String brand;
    Car(String brand){
        this.brand=brand;
        System.out.println(brand);
    }
    public void Setbrand(){
        brand="BMW";
        System.out.print("Brand:"+brand);
    }
    public static void main(String[] args) {
        Car obj=new Car("BENZ");
        obj.Setbrand();
}
}