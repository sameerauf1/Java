/**
 *Name: Samee Rauf
 Date: 06/28/2021
 Course Name: CS 21 - Intro to Computer Science-Java
 Section: CS21-03-50798
 
 */
// main class will call static methods for each sub figure: drawTriange,drawPokadotline,boxA,BoxB
//image printed is based on s using constant SUBFIGURE HEIGHT, all for loops use class constant
//draw pyramid METHOD is created by:
    //1.over arching forloop of future forloops that will repeat until it reaches class constant
        //2.decrement space forloop,
        //3. ncrease backslash for oop
        //4.print 2 star forloop,
        //5.print backslash forloop
        //6.System.out.println for next line command
//poka dot line METHOD is created by: 
    //1.over arching forloop of future forloops that will repeat until it reaches class constant
        //2.increment plus forloop,
        //3.increment equal star forloop,
        //4.increment plus forloop
        //5.System.out.println for next line command
//draw boxA METHOD was created by: 
    //1.over arching forloop of future forloops that will repeat until it reaches class constant
        //2.increment vertical line forloop
        //3.decrement dot forloop
        //4.increment fowardslash backslash triangle forloop
        //5 decrement dot forloop
        //6.increment fowardslash backslash triangle forloop
        //7.decrement dot forloop
        //8.increment vertical line forloop
        //9. System.out.println() for next line command
//draw box B METOHOD was creatd by:
    //1.over arching forloop of future forloops that will repeat until it reaches class constant
        //2.increment vertical line forloop
        //3.increment dot forloop
        //4.decreemnt backslash fowardslash triangle for oop
        //5.increment dot forloop
        //6.decreemnt backslash fowardslash triangle forloop
        //7.increment dot forloop
        //8.increment vertical line forloop


public class DrawRocket
{
    public static final int SUBFIGUREHEIGHT = 3;
    public static void main(String[]args)
    {
        System.out.print('\u000C');
     drawPyramid();
     drawPokadotLine();
     drawBoxA();
     drawBoxB();
    drawPokadotLine();
     drawBoxB();
     drawBoxA();
    drawPokadotLine();
    drawPyramid();

     
    }
public static void drawPyramid()
{
    for (int j = 1; j <= SUBFIGUREHEIGHT + 2; j++)
    {
        for( int i = 3*(SUBFIGUREHEIGHT/2) + 2; i>=j; i--)
        {
            System.out.print(" ");
        }
        for( int l =1; l<=j; l++)
        {
            System.out.print("/");
        }
        for( int k = 1; k<=2; k++)
        {
            System.out.print("*");
        }
        for(int p =1; p<=j; p++)
        {
            System.out.print("\\");
        }
        System.out.println();
    }
}
public static void drawPokadotLine()
{
    for (int j =1; j<=1; j++)
    {
        for(int i =1; i<= 1; i++)
        {
            System.out.print("+");
        }
        for(int m =1; m<= (4*SUBFIGUREHEIGHT)/2; m++)
        {
            System.out.print("=*");
        }
        for(int o =1; o<= 1; o++)
        {
            System.out.print("+");
        }
        System.out.println();
}
}
public static void drawBoxA()
{
    for(int j =1; j<= SUBFIGUREHEIGHT; j++)
    {
        for(int i =1; i<= 1; i++)
        {
            System.out.print("|");
        }
        for (int k = SUBFIGUREHEIGHT-1; k>=j; k--)
        {
            System.out.print(".");
        }
        for ( int m =1; m<=j; m++)
        {
            System.out.print("/\\");
        }
        for(int f = 2*(SUBFIGUREHEIGHT-1); f>=2*j-1; f--)
        {
            System.out.print(".");
        }
        for(int g = 1; g<=j; g++)
        {
            System.out.print("/\\");
        }
        for(int b = SUBFIGUREHEIGHT-1;  b>=j; b--)
        {
            System.out.print(".");
        }
        for(int a = 1; a<=1; a++)
        {
            System.out.print("|");
        }
        System.out.println();
    }
}
public static void drawBoxB()
{
    for(int j =1; j<= SUBFIGUREHEIGHT; j++)
    {
        for(int i =1; i<= 1; i++)
        {
            System.out.print("|");
        }
        for (int k = 1; k<=j-1; k++)
        {
            System.out.print(".");
        }
        for (int k = SUBFIGUREHEIGHT; k>=j; k--)
        {
            System.out.print("\\/");
        }
        for (int g = 2; g<=2*j-1; g++)
        {
            System.out.print(".");
        }
         for (int r = SUBFIGUREHEIGHT; r>=j; r--)
        {
            System.out.print("\\/");
        }
        
        for (int p = 1; p<=j-1; p++)
        {
            System.out.print(".");
        }
        for(int a =1; a<= 1; a++)
        {
            System.out.print("|");
        }
    System.out.println();

}
}
}