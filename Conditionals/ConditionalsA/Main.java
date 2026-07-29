package Conditionals.ConditionalsA;
import java.util.Scanner;
public class Main{
public static void main(String[]args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter your voltage number");
    double voltage = scanner.nextDouble();


    if (voltage >= 12.0) {
System.out.println("Batterry High");
    } else if (voltage >= 9.5) {
System.out.println("Battery Mid");
    } else {
System.out.println("Battery Low");
    }

    scanner.close();
}
}