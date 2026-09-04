package Conditionals.ConditionalsA;
import java.util.Scanner;
public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a random volatge number around 16.0");
    double voltage = sc.nextDouble();
    if (voltage >= 12.0) {
      System.out.println("Battery is high");
      if (voltage >= 9.5) {
        System.out.println("Battery is mid");
        if (voltage <= 9.5) {
          System.out.println("Battery is low");
        }
      }
    }
  }
}
