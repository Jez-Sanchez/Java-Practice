package Conditionals.ConditionalsB;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
Scanner balls = new Scanner(System.in); // i can name it whatever i want HAHAHAHA

final double goalPlace = 4.5;
System.out.print("enter your angle: ");
double hoodAngle = balls.nextDouble();

System.out.print("enter your Rpm: ");
double Rpm = balls.nextDouble();


double distance = (0.002626 * Rpm) * Math.cos(Math.toRadians(hoodAngle));
System.out.printf("balls travel distance: ", distance);

if (distance>goalPlace) {
    System.out.println("overshot :(");
} else if (distance == goalPlace) {
    System.out.println("GOALLLLLLLLLLLLLLLLLL");
} else {
    System.out.println("undershot :,(");
}
balls.close();

    }
    
}
