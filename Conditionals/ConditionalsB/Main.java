package Conditionals.ConditionalsB;
import java.util.Scanner;


public class Main {
double constant = 4.5;
//4.5 inches

public static void main(String[]args) {
    //Scanner stuff
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter your Hood Angle");
    int hoodAngle = scanner.nextInt();
    System.out.println("Enter your Game Piece Speed (Rotations per Minute)");
    int gameRPM = scanner.nextInt();

scanner.close();
}
//Equation
double distance = (0.002626 * RPM) * Math.cos(Math.toRadians(HoodAngle));

//Conditionals
if (distance > constant) {
    System.out.println("You Overshot It!");
} else if (distance == constant) {
    System.out.println("You Swissed It!!!");
} else {
    System.out.println("You Undershot It!!");
}


}
// You will be making and if, else if , 
//and else condition
//Using the Scanners again