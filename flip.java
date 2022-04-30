
/**
 * Name: Samee Rauf
 Date: 07/26/2021
 Course Name: CS 21 - Intro to Computer Science-Java
 Section: CS21-03-50798
 
 Program Requirements:
 create an array(integers) size of 25
 use a for loop until 25, to fill up the array with random numbers
 print the array from the first to last element using for enhance loop
 print the array from the last to the first element using for enahnce loop
 
 pseudocode:
 need to import.javautil*. for the random class
 need to create array, String[] numbList = new String[25]
 need to create random object, Random rand = new Random();
 we will then assign a variable to store the random number, need to be within 1-50
 create for loop from int i =0, to i =25, increment i++
 we will generate random number, need to be within 1-50
store the random number in the i element of the array
after for loop is done, aka after 25 random numbers are stored
weill print a statement saying the array contents....
we will print the array concetns from the first to last element using the array class method
we will print a stateent saying the array contents....
we will print the array contents ffrom the lat to first element using a for loop, 
we have to make sure we don't run into the fence loop problem
so we will have our for loop to start at 24, go to less than equal 1 and decrement by 1
we will print the numbers from last to first & seperate each one with a comma
after the for loop is done
we will print the last number(first number in orginal list) and print the closing bracket
this was done to avoid the fence loop issue with an extra comma and space

 
 */
import java.util.*;
public class flip
{
    public static void main(String[] args)
    {
        System.out.print('\u000C');
        int[] numbList = new int[25];
        Random rand = new Random();
        for(int i = 0; i<25; i++)
        {
           numbList[i] = rand.nextInt(50) +1; 
        }        
        System.out.print("The array contents from the first to last element are: ");
        System.out.println(Arrays.toString(numbList));
        System.out.print("The array contents from the last to first element are: [");
        for(int i = 24; i>=1; i--)
        {
            
            System.out.print(numbList[i] + ", " );
        }
        System.out.print(numbList[0]);
        System.out.print("]");
    }
    }

