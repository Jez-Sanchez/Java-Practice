import java.util.Arrays;


public class Main {

 //array
 teams = int[12];

 /*team numbers: 8, 16, 67, 69, 71, 103, 108, 133, 173, 180, 217, 
 2076, 9019
 */
 teams[0] = 67;
 teams[1] = 69;
 teams[2] = 71;
 teams[3] = 103;
 teams[4] = 108;
 teams[5] = 133;
 teams[6] = 173;
 teams[7] = 180;
 teams[8] = 217;
 teams[9] = 2076;
 teams[10] = 9019;

 //for loop
 for (int i = 0; i < teams.length; i++) {
    System.out.println(teams[i]);
 }
    /*for loop that prints team numbers down
    appending 2 teams
    sort them in numerical order*/

 teams.append(8);
 teams.append(16);

 //sorter
 Arrays.sort(teams);

 for (int teamer : teams) {
    System.out.println(teamer);
 }

}