public class Sum{
public static void main(String[]args){
int num=428;
int sum=0;
while(num!=0){
int digit=num%10;
sum=sum+digit;
num=num/10;
}
System.out.print(sum);
}
}