
/**
 * insert javautil*:
 * Ask Systemprintln("Do you have a job? (yes/no):")
 *     Scanner console = new Scanner(System.in);
 *     response = console.nextLine();
 * ystem.out.println("Do you have a job? (yes/no):");
        Scanner console = new Scanner(System.in);
        String response = console.nextLine();
        if(response == "yes")
        {
            return "You are the breadwinner";
 * if (response.equals("yes"))
 * return "You are the breadwinner"
 * else if (response.equals("no"))
 * return"Keep searching, you will find one!"
 *if (response != yes || response!= no)
 *for ( int i =1, i <=3; i++)
 *System.out.println("Do you have a job? (yes/no):")
 *response = console.nextLine()
 *if (response.equals("yes"))
 * return "You are the breadwinner"
 * else if (response.equals("no"))
 * return"Keep searching, you will find one!"
 *System
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class Equality
{
    public static void main(String[]args)
    {
        System.out.print('\u000C');
        application();
    }
    public static String application()
    {
        System.out.println("Do you have a job? (yes/no):");
        Scanner console = new Scanner(System.in);
        String response = console.nextLine();
        
            for(int attempt = 1; attempt<=2; attempt++)
                {
                System.out.println("Do you have a job? (yes/no):");
                    String attempt2 = console.nextLine();
                if(attempt2.equals("yes"))
                {
                    System.out.println("You are the bread Winner");
                    return "completion";
                }
                else if(attempt2.equals("no"))
                {
                    System.out.println("Keep searching, you will find one!");
                    return "completion";
                }
                }
                        return "program ended";

        }
    }
    
     