
/**
 * Name: Samee Rauf
 Date: 07/12/2021
 Course Name: CS 21 - Intro to Computer Science-Java
 Section: CS21-03-50798
 create main method
 prompt the user using system.print(What is your name)
 method call calculateAvg score method, which will prompt system.print( enter 3 scores)
 take user input: int num1 = nextInt(),... until num3.
  int average will be (num1 + num2 + num3)/3
  then we can return average, which will break method & go to the main
  we can store this integer as int average, so we can reference it later
  we can print the student name and the average score in the main method using print f method
  method call printLetterGrade with the parameter int average for the integer that was calculated
  If (average<=100 or average>=90 )
  then system.print(Your letter grade is: A)
  else If (average<90 or average>=80 )
  then system.print(Your letter grade is: B)
  else If (average<80 or average>=70 )
  then system.print(Your letter grade is: C)
  else If (average<70 or average>=60 )
  then system.rint(Your letter grade is: D)
  else  (average<60 or average>=0 )
  then system.print(Your letter grade is: f)
  
 */
import java.util.*;
public class assignLetterGrade
{
    public static void main(String[]args)
    {
        System.out.print('\u000C');
    System.out.println("Enter your name: "); 
    Scanner console = new Scanner(System.in);
    String studentName = console.nextLine();
    int averageScore = calculateAvgScore();
    System.out.printf("Student Name: %1s\nAverage score: %d\n", studentName, averageScore);
    printLetterGrade(averageScore);

    //System.out.println("Student Name: " + studentName + "Average Score: " + calculateAvgScore2());
    }
    public static int calculateAvgScore()
    {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter 3 scores: ");
        System.out.print("Score 1: ");
        int num1 = console.nextInt();
        System.out.print("Score 2: ");
        int num2 = console.nextInt();
        System.out.print("Score 3: ");
        int num3 = console.nextInt();
        int numOfScores = 3;
        int average = (num1 + num2 + num3)/numOfScores;
        return average;


    }
    public static String printLetterGrade(int averageScore)
    {
      if (averageScore <= 100 && averageScore >=90)
      {
      System.out.println("Your letter grade is: A");
       return"Your letter grade is: A";
      }
      if (averageScore<90 && averageScore>=80 )
      {
          System.out.println("Your letter grade is: B");
       return"Your letter grade is: B";
      }if (averageScore<80 && averageScore>=70 )
      {
          System.out.println("Your letter grade is: C");
       return"Your letter grade is: C";
      }if (averageScore<70 && averageScore>=60 )
      {
          System.out.println("Your letter grade is: D");
       return"Your letter grade is: D";
      }else 
      {
          System.out.println("Your letter grade is: F");
       return"Your letter grade is: F";
      }
    }
}