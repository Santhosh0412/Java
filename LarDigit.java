public class LarDigit{
public static void main(String[]args){
int num=4895;
int largest=0;
while(num>0){
int digit=num%10;
if(digit>largest){
largest=digit;
}
num=num/10;
}
System.out.print(largest);
}
}