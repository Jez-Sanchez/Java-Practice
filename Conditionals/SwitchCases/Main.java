package Conditionals.SwitchCases;

import java.util.Scanner;

public class Main {
     public static void main(String[] args) {
 Scanner banner = new  Scanner(System.in);

 System.out.println("SELECT YOUR ROBOT's ACTION:");
System.out.println("Drive");
System.out.println("Intake");
System.out.println("Shoot");
System.out.println("Climb");
System.out.print("CHOOSE: ");

String Choice = banner.next();

switch (Choice) {
    case "Drive":
        System.out.println("Driven");
        break;
case "Intake"  :
 System.out.println("Intakeven");
break;
case "Shoot"  :
 System.out.println("Shooten");
break;
case "Climb"  :
 System.out.println("Climbven");
break;
    default:
     System.out.println("ERROR 404 INVALED OPPERATEIONS 10101101 Xp");
        break;
}
banner.close();
    }
}
