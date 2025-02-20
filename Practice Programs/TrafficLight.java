import java.util.Scanner;
public class TrafficLight {
    public static void main(String[]args){
        System.out.print(" What is the color of traffic light:");
        Scanner s=new Scanner(System.in);
        String TrafficLight=s.nextLine();
        if(TrafficLight.equals("red")){
            System.out.print("Stop");
        }
        else if(TrafficLight.equals("yellow"))
        {
            System.out.print("Get ready");
        }
        else if(TrafficLight.equals("green"))
        {
            System.out.print("Go");
        }
    }
    
}
