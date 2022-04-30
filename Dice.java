
/***Name: Samee Rauf
 Date: 07/13/2021
 Course Name: CS 21 - Intro to Computer Science-Java
 Section: CS21-03-50798
 we need to print the statement " rolling dice....)
 we need to create a Random object, to create the random numbers
 we can create an integer using the random object as dice 1, and the value to be between 1 & 7
 same for int dice 2
 we need to create integer sum and set it to 0, this will be used in our while loop....
 we also initialize and create counter = 0, we will be updating this in the while loop...
 create a while loop with the condition that the sum is not equal to 7, so that when the sum is equal to 7 the while loop starts
 also create a while loop with the condition that the sum not equal to 7
 inside the while loop, we need to update the values of dice 1, dice 2 & make the sum = dice1 + dice2
 we will update the counter by 1, so that each time the while loop runs, counter increases by 1 telling us how many times the loop ran
finally we print the values of the sum & the counter. 
 */
import java.util.*;
public class Dice
{
    public static void main(String []args)
    {
        System.out.print('\u000C');
    System.out.println("Rolling dice, counting the number of rolls to get a total of 7..."); 
    Random rand = new Random();
    int dice1 = rand.nextInt(6) +1;
    int dice2 = rand.nextInt(6) + 1;
    int sum = 0;
    int counter = 0;
    while(sum != 7)
    {
        dice1 = rand.nextInt(6) +1;
        dice2 = rand.nextInt(6) + 1;
        sum = dice1 + dice2;
        counter++;
        System.out.println("sum: " + sum);
        System.out.println("counter: " + counter );
    }
    }
    }
    

    