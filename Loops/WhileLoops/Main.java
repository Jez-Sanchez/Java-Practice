package Loops.WhileLoopsA;

import java.util.Scanner;
public class Main {
    public static void Main(String[] args) {
        String choice = "Would you like to continue?";
        String location = "You are at the Goal";
        String location2 = "You are near the fuel";
        String fuelInside = "There are some fuel inside the robot";
        String noFuel = "There is no fuel inside the robot";
        String shuttingDown = "Shutting Down... goodbye :)";
        Scanner sc = new Scanner(System.in);
        while (!shuttingDown.equals("5")){
            System.out.println("Choose one of the commands:");
            System.out.println("1.Drive");
            System.out.println("2.Intake");
            System.out.println("3.Shoot");
            System.out.println("4.Climb");
            System.out.println("5.Shut Down");
            int commands = sc.nextInt();
            switch (commands) {
                case 1:
                    System.out.println("Driving to get a game piece... At a game piece locations");
                    break;
                case 2:
                    System.out.println("Intaking game pieces... Robot is fuel");
                    break;
                case 3:
                    System.out.println("Shooting fuel into the hub... You made all the fuel");
                    break;
                case 4:
                    System.out.println("Climbing the tower... Made it to level 3");
                    break;
                case 5:
                    System.out.println("Shutting down... goodbye");
                    break;
                    sc.close();
            }
        }
        
    }
    
}

