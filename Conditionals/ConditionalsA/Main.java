package Conditionals.ConditionalsA;

import java.util.Scanner;

 
public class Main{
// replace voltage with main
public static void /*voltage*/ main(String[] args) {
 Scanner mrohm = new Scanner(System.in);
 System.out.print("input your voltage: ");
 double resist = mrohm.nextDouble();

    if(resist >= 12.0) {
         System.out.println("high");
     } else if(resist >= 9.5){
         System.out.println("med");
    } else{
         System.out.println("low");
}; mrohm.close();

}}


