package Variables.VariablesB;
import java.util.Scanner;

public class Main {

    public static void main(String[]args) {

    Scanner input = new Scanner(System.in);
    System.out.println("Enter a number");
    int num = input.nextInt();

    System.out.println("Enter another number");
    int num1 = input.nextInt();

    
    System.out.println(num + num1);
    System.out.println(num - num1);
    System.out.println(num * num1);
    System.out.println(num / num1);
    int result = (int) Math.pow(num, num1);
    System.out.println(result);

    input.close();
 }

}

//you have to print addition, subtraction,  multiplication, 
//exponents, and division