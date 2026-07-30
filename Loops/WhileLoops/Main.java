import java.util.Scanner;
public class Main {
public static void main(String[] args) {

boolean userContinue = true;
String location = "Goal";
boolean haveGamePieces = false;
Scanner scanner = new Scanner(System.in);

while (userContinue) {
System.out.println("Choose a command: 1.Drive 2.Intake 3.Shoot 4.Climb 5.Shut Down");
int command = scanner.nextInt();

switch (command) {
case 1:
if (haveGamePieces) {
System.out.println("Drive to game pieces!");
} else System.out.println("Driving to goal location..");
System.out.println("Arrived at goal!"); 
break;
case 2:
if (location.equals("Goal")) { 
System.out.println("Intaking..");
System.out.println("Acquired Fuel!");
} else System.out.println("Cannot intake..acquire fuel!"); 
break;
case 3:
if (haveGamePieces) {
System.out.println("Cannot shoot..");
} else if (location.equals("Goal")) {
System.out.println("Shooting!");
} else System.out.println("Cannot shoot..");
break;
case 4:
System.out.println("Climbing!");
break;
case 5:
System.out.println("Shutting Down!");
break;
       }
    }
  }
}
