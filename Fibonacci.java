public class Fibonacci{
public static void main(String[]args){
int a=0;
int b=1;
for(int i=2;i<10;i++){
int next=a+b;
System.out.print(next+" ");
a=b;
b=next;
}
}
}