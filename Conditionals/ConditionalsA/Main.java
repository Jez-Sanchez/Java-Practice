package Conditionals.ConditionalsA;
import java.util.Scanner;
public class Main{
public static void main(String[] args) {
  
// scanner
Scanner scanner = new Scanner(System.in);
System.out.println("Enter voltage number");
double voltage = scanner.nextDouble();
  
// conditionals
if (voltage >= 12.0){
  System.out.println("Battery High.");
} else if (voltage >= 9.5) {
  System.out.println("Battery Mid.");
} else if (voltage < 9.5) {
  System.out.println("Battery Low.");

 scanner.close();

  } 
 }
}
