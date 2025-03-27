public class Lcm{
public static void main(String[]args){
int a=40;
int b=50;
int tempA=a;
int tempB=b;
int gcd;
while(b!=0){
int temp=b;
b=a%b;
a=temp;
}
gcd=a;
int lcm=(tempA*tempB)/gcd;
System.out.print(lcm);
}}