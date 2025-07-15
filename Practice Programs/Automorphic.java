public class Automorphic {
    public static void main(String[] args) {
        int num = 5;
        int square = num * num;
        if (String.valueOf(square).endsWith(String.valueOf(num))) {
            System.out.println(" Automorphic");
        } else {
            System.out.println(" NOT an Automorphic");
        }
    }
}
