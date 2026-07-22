package Conditionals.ConditionalsB;

import java.util.Scanner; 
public class Main { 
public static final double distanceValue = 4.5;
public static void main(String[] args) {

// scanner
Scanner scanner = new Scanner(System.in);
System.out.println("Enter Hood Angle");
double hoodAngle = scanner.nextDouble();
System.out.println("Enter Game Piece Speed");
int rpm = scanner.nextInt();
scanner.close();

// equation
double distance = (0.002626 * rpm) * Math.cos(Math.toRadians(hoodAngle));

// conditionals
if (distance > 4.5) {
System.out.println("The ball has overshot!");
} else if (distance == 4.5) {
System.out.println("The ball has been scored!");
} else {
System.out.println("The ball has undershot!");
     }
   }
 }
