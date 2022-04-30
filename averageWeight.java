
/**
 * Name: Samee Rauf
 Date: 07/26/2021
 Course Name: CS 21 - Intro to Computer Science-Java
 Section: CS21-03-50798
 Assignment Requirements
1. array store 3  user input of names   (string)
2. array stores 3 user input of weights (double)
3. will prompt user to enter name & store it in a variable
-compute and print the average of hte weights, entered using printf comand
- use a loop to traverse and print the elements of each array
- or use array class method to print

overall scheme of program:
- will take in 3 names & 3 weights from the user via scanner, storing them in two dif arrays(one as string one as double)
- will compute the average of the weights, by taking sum of all the weights in the weights array
and dividing by lenght of the weight array
-will use array class method to print names array & to print weights array
-will use print f method to print average weight, limiting it 2 decimals

pseudocode:
we need to import java.util.* for the scanner
we create scanner
we construct and intialize names array(String) & say 3 elements( number of names we need to store)
we construct and intialize names weight(Double) & say 3 elements( number of weights we need to store)
we intialize variable sum(Double) to zero, this will be used when computing the average
we will use a for loop, to prompt the user 3 times to fill both arrays
we will use a system.out.print to prompt user to enter first name
we will then store that userinput as the i element of names array
we will use a system.out.print to prompt user to enter their weight in lbs
we will then store that userinput as the i element of weights array
in addition, we will be calculating the sum by adding each element in weights array
after this for loop is done, aka after 3 names and 3 weights have been entered
we will compute the average(Double), by taking the sum of the weights and dividing by
the length of the weights array (3)
next we will print a line, saying "list of participants"
then we will print the array of names using array class method
then we will print a line, saying "participants weights"
then we will print the array of weights using array class method
finally we will use a print f mehtod to print the average weight & make sure it is limited to 
2 decimal places.

 */
import java.util.*;
public class averageWeight
{
    public static void main(String[] args)
    {
        System.out.print('\u000C');
    Scanner console = new Scanner(System.in);
    String [] names = new String[3];
    double[] weights = new double[3];
    double sum = 0;
    for(int i = 0; i<3; i++)
    {
        System.out.println("Enter your first name: ");
        names[i] = console.next();
        System.out.println("Enter your weight in lbs: ");
        weights[i] = console.nextDouble();
        sum+= weights[i];
    }
    double average = sum / weights.length;
    System.out.print("List of participants: ");
    System.out.println(Arrays.toString(names));
    System.out.print("Participant's weights: ");
    System.out.println(Arrays.toString(weights));
    System.out.printf("The average of the weights is: %.2f", average);
}
}