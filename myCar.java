
/**
 * Descirption of program: It will use formal and informal parameters to 
 * to pass 4 statements about my car from the main method to another method.
 **
 Name: Samee Rauf
 Date: 06/27/2021
 Course Name: CS 21 - Intro to Computer Science-Java
 Section: CS21-03-50798
 */
public class myCar
{
    // instance variables - replace the example below with your own
    public static void main(String args[]) 
    {
        //writing the actual parameters & calling carstatement methods
        carStatements("Toyota Camry X40", "Toyota and Camry", 2007, 100000 ); // carYear, carsmileage);
        
    }
    //writing the header parameters
    public static void carStatements(String fullName, String carMakeAndModel, int carYear, int carsMileage )//, String carMake&Model, String carYear, CarsMileage)
    {
        //Statements I want to print out with the addition of passing information from main method
        System.out.println("The full name of my car is: " + fullName);
        System.out.println("The car make & model of my car is: " + carMakeAndModel);
        System.out.println("The year of my car is: " + carYear);
        System.out.println("The amount of miles my car has been driven for are: " + carsMileage);
        
    }
}