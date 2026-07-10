package Variables.VariablesB;
import java.util.Scanner;
public class Main {
 public static void main(String[] args ) {

// scanner
Scanner scanner = new Scanner(System.in);
System.out.println("Enter your first integer");
int number1 = scanner.nextInt();
System.out.println("Enter your second integer");
int number2 = scanner.nextInt();

// print statements
System.out.println(number1 + number2);
System.out.println(number1 - number2);
System.out.println(number1 * number2);
System.out.println(number1 / number2);
System.out.println(number1 % number2);

scanner.close(); 
   }
 }
    
}
