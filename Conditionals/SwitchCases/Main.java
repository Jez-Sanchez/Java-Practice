package Conditionals.SwitchCases;
import java.util.Scanner;
public class main {
public static void main(String [] args) {
// scanner
Scanner scanner = new Scanner(System.in);
System.out.println("Select a command.");
String command = scanner.nextLine();
scanner.close();
// switch statement
switch (command) {
 case "Drive":
 System.out.println("Driving!");
 break;
 case "Intake":
 System.out.println("Intaking!");
 break;
 case "Shoot":
 System.out.println("Shooting!");
 break;
 case "Climb":
 System.out.println("Climbing!");
 default:
 System.out.println("Unknown command D:");
        }
     }
  }
