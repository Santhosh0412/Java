public class AutomorphicNumber {
    public static void main(String[] args) {
        int n = 6;  
        int square = n * n; 
        if (square % 10 == n || square % 100 == n || square % 1000 == n) {
            System.out.println(n + " is an Automorphic Number.");
        } else {
            System.out.println(n + " is NOT an Automorphic Number.");
        }
    }
}