import java.util.Scanner;
public class BinaryAddition {
public static String addBinary(String a, String b) {
int num1 = Integer.parseInt(a, 2); 
int num2 = Integer.parseInt(b, 2); 
int sum = num1 + num2;             
return Integer.toBinaryString(sum);
}
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter first binary number: ");
String binary1 = sc.nextLine();
System.out.print("Enter second binary number: ");
String binary2 = sc.nextLine();
String result = addBinary(binary1, binary2);
System.out.println("Result of binary addition: " + result);
sc.close();
}
}
