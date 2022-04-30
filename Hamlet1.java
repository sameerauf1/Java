
/**
 Name: Samee Rauf
 Date: 07/19/2021
 Course Name: CS 21 - Intro to Computer Science-Java
 Section: CS21-03-50798
 PseudoCode/outline of program:
 
 we want to create program that will 1. read, 2. count 3. print the nuber of tokens in the hamlet file
 we will need to import the java.util.* & java.io*
 we can work within our main method
 we need to create a file object, name it filename
 we need to create a scanner to read from that file, so we would pass the file into the scanner
 we need to throw excpeiton for file not found, just in case the program doesn't find our file
 while(read.hasNext()) aka while there are token in the file...
 we will then store each token a as string, String token = read.next
 in adddition, we will put a counter counter++
 after tis while loop, we will do a print statement. "The hamlet file has" +  counter + "tokens" 
 
 
 Description of program:
 
 we need to import java.util.*, so that we can use a scanner to read the file & java.io.* to create the file
 we also need to throw FileNotFoundException in our method so that the program will still execute even if it doesn't find the file
 we need to create the file object, we will name it file & inside of hte file we will puth the hamlet.txt that we want to read
 we will now create a scanner fileRead & put the file inside of it which is the hamelt.txt
 we also will initialize tokenCount for when we use it in our while loop
we will create a while loop based on the condition that there is a token.
inside of our loop, we will store the value of the token inside the string token
everytime this loop iterates, we will incrment tokenCount by 1, so every token we go over we will increase it by 1
Finally we print hte total tokens of the file with a system.println statement & use the variable tokenCount to represent the to

part2:
we will change the intializaiont of token to and coutn
our while loop will stay the same, it will continue as long as there are tokens to read
when we define our String token, will convert every token to lower case, to match the lower case "and"
we will add an if loop, if the token is equal to "and", then we will increment the andCount, this way andCount will only incrment if token 
is equal to and.
again we will print the statement using a println statemtn after the while loop, using the andCount to represent the amount of times
and is written in the hamlet file
 */
import java.util.*;
import java.io.*;
public class Hamlet1
{
    public static void main(String[] args) throws FileNotFoundException
    {
    File file = new File("hamlet.txt");
    Scanner fileRead = new Scanner(file);
    int andCount = 0;
    while(fileRead.hasNext())
    {
        String token = fileRead.next().toLowerCase();
        if(token.equals("and"))
        {
        andCount++;
        }
    }
    System.out.println("The hamlet file has a total number of " + andCount + " \"ands\" words");
    }
}
