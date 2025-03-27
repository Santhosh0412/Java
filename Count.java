public class Count{
public static void main(String[]args){
int num=786;
int count=0;
while(num!=0){
count++;
num=num/10;
}
System.out.print(count);
}}