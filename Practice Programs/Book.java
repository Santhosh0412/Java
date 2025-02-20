public class Book {
    String title;
    float price;
    Book(){
        title="java program";
        System.out.print("title:"+title);
        System.out.println();
        price=101;
        System.out.print("price:"+price);
    }
    public static void main(String[] args) {
        Book obj=new Book();
    }
}
