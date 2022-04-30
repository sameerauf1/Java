
/**
 *Name: Samee Rauf
 Date: 06/27/2021
 Course Name: CS 21 - Intro to Computer Science-Java
 Section: CS21-03-50798
 */
// the BIRTH YEAR will be determined based on current year = 2021, age which is user input
//we will take the current year and subtract that by the input and store it has a variable called result
// we will then print  “You were born in ” and  the variable result
//main method will calculateAge method
import java.util.*;
public class birthYear
{
    public static void main(String args[])
    {
        int result = calculateAge();
        System.out.println("You were born in " + result);
        

    }
    public static int calculateAge()
    {
        Scanner console = new Scanner(System.in);
        System.out.println("How old are you: ");
        int age = console.nextInt();
        int birthYear = 2021 - age;
        return birthYear;
    
    
    }
}
