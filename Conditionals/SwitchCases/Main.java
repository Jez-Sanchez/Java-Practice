package Conditionals.SwitchCases;
import java.util.Scanner;

public class Main {
public static void main(String[]args) {
 Scanner scanner = new Scanner(System.in);
 System.out.println("Select an option");   
 String option = scanner.nextLine();
 scanner.close();
}

switch (option){
    case "Drive":
    System.out.println("Driving...");
    break;
    case "Intake":
    System.out.println("Intaking...");
    break;
    case "Shoot":
    System.out.println("Shooting...");
    break;
    case"Climb":
    System.out.println("Climbing...");
    break;
    default:
    System.out.println("Option not found, please try again");
    }
}
