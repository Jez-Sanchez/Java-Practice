package Conditionals.SwitchCases;
import java.util.Scanner;
public class Main {
    public static void Main (String[] args) {
        //The commands are 1(driving), 2(intake), 3(shooting), and 4(climbing)//
        int commands = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter one of these commands for their robot: 1, 2, 3, or 4");
        sc.nextLine();
        
        switch (commands) {
            case 1:
                System.out.println("You are Driving");
                break;
            case 2:
                System.out.println("You are intaking fuel");
                break;
            case 3:
                System.out.println("You are shooting fuel into the hub");
                break;
            case 4:
                System.out.println("You are climbing the tower");
                break;
            default:
                System.out.println("Invalid command");
        }
    }
}
