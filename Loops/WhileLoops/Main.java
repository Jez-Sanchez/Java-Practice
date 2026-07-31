package Loops.WhileLoopsA;
import java.util.Scanner;


public class Main {


    while (cont = true){
    public static void main(String[] args) {

    boolean cont = true;
    //variable that stores the location of the robot
    boolean currentLocation = true; 
    //false = GamePiece
    //true = Goal
    boolean hasGamePiece = true;

    System.out.println("Robot Booting...");

    Scanner scanner = new Scanner(System.in);
    System.out.println("Select a command: Drive, Intake, Shoot, Climb, or ShutDown");    
    String command = scanner.nextLine();

    switch(command) {
        case "Drive":
        if (hasGamePiece = false) {
        System.out.println("Driving towards GamePieces");
        System.out.println("You have arrived at destination");
        } else {
            System.out.println("Driving towards Goal");
            System.out.println("You have arrived at destination");
        }
        break;
        case "Intake":
        if (currentLocation = false) {
            System.out.println("Intaking...");
            System.out.println("Intake complete");
        } else {
            System.out.println("Cannot intake, please Shoot instead");
        }
        break;
        case "Shoot":
            if (hasGamePiece) {
                System.out.println("Shooting...");
            } else {
                System.out.println("Cannot shoot, please drive to GamePieces to Intake");
            }
            break;
        case "Climb":
            System.out.println("Climbing...");
        break;
        case "ShutDown":
            System.out.println("Shutting Down...");
        break;
        default:
            System.out.println("incorrect or invalid command, please try again");
    }
  } 

 }

}
