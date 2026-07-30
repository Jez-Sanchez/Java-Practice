package Loops.WhileLoopsA;
import java.util.Scanner;


public class Main {
boolean continue = true;
//variable that stores the location of the robot
boolean currentLocation = true; 
//false = GamePiece
//true = Goal
boolean hasGamePiece = true;

while (continue = true){
public static void main(String[] args) {
    System.out.println("Robot Booting...");

    Scanner scanner = new Scanner(System.in);
    System.out.println("Select a command: Drive, Intake, Shoot, Climb, or Shut Down");    
    String command = scanner.nextLine();

    switch(command) {
        case "Drive":
        if (hasGamePiece = false) {
        System.out.println("Driving towards GamePieces");
        } else if (hasGamePiece = true){
            System.out.println("Driving towards Goal");
        } else {
            System.out.println("You have arrived at destination");
        }
        break;
        case "Intake":
        if (currentLocation = false) {
            System.out.println("Intaking...");
        } else if(currentLocation){
            System.out.println
        }
    }
} 

}

}
