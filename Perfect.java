public class Perfect {
    public static void main(String[] args) {
        int sum = 0;
        int num = 12;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        System.out.print(sum == num ? "Perfect" : "Not Perfect");
    }
}