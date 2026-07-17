package Variables.VariablesB;

import java.util.Scanner;

public class Main {

    public static class expressions{
    public double add(double add1,double add2){
        return (add1 + add2);
    }
    public double sub(double sub1,double sub2){
        return (sub1 - sub2);
    }
    public double div(double div1,double div2){
        return (div1 / div2);
    } 
    public double mul(double mul1,double mul2){
        return (mul1 * mul2);
    }
    public double dif(double dif1,double dif2){
        return (dif1 % dif2);
    }
    public double exp(double w){
        double exp1;

        exp1 = w*w; // not done yet
        return (exp1);
    }
}
  public static void main (String [] args) {
        Scanner in = new Scanner (System.in);
 expressions num = new expressions();

        System.out.print ("Please put two numbers: ");
         double val1 = in.nextDouble();
      double  val2 = in.nextDouble();

    double cube = num.exp(val1);
    

        System.out.println (cube);

      
     System.out.println("sum of val1 & val2 is"+ num.add(val1, val2));
    System.out.println("quotient of val1 & val2 is"+ num.div(val1, val2));
    System.out.println("diff of val1 & val2 is"+ num.sub(val1, val2));
    System.out.println("product of val1 & val2 is"+ num.mul(val1,val2));
    System.out.println("remainder of val1 & val2 is"+ num.dif(val1,val2));
  }

}
