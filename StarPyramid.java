
/**
 Name: Samee Rauf
 Date: 06/14/2021
 Course Name: CS 21 - Intro to Computer Science-Java
 Section: CS21-03-50798
 */
//start with 4 spaces and decrement by 1
// line one: 1 star line two: 3 stars line three:5 line four: 7
//increment stars by 1
// kind of confused why there is a big difference between putting j++ and j = j+2, we want to increment the stars by 2 each time....
public class StarPyramid
{
 public static void main(String args[])
 {
     System.out.print('\u000C');
     for ( int l =1; l<=5; l++)
     {
         for( int i = 4; i>=l; i--)
             {
             System.out.print(" ");
             }
         for( int j = 1; j<= 2*l-1; j++)
         {
         System.out.print("*");
         
         }
         System.out.println();
 }
}
}