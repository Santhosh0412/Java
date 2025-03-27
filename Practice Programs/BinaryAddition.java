public class BinaryAddition {
    public static String addBinary(String a, String b) {
    int num1 = Integer.parseInt(a, 2);
    int num2 = Integer.parseInt(b, 2);
    int sum = num1 + num2;
    return Integer.toBinaryString(sum);
    }
    public static void main(String[] args) {
    String binary1 = "1010";
    String binary2 = "1101";
    String result = addBinary(binary1, binary2);
    System.out.println("Binary 1: " + binary1);
    System.out.println("Binary 2: " + binary2);
    System.out.println("Result of binary addition: " + result);
    }
    }
    