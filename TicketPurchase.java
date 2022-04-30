
/**
 Name: Samee Rauf
 Date: 06/14/2021
 Course Name: CS 21 - Intro to Computer Science-Java
 Section: CS21-03-50798
 */
public class TicketPurchase
{
    public static void main(String args[])
    {
        System.out.print('\u000C');
        theticketprices();
        subtotal();
        tax();
        grandtotal();
    }
public static void theticketprices() 
{
System.out.println("Ticket Price:\n\t\t$162.03\n\t\t$99.36\n\t\t$21.02\n\t\t$436.36");
}
public static void subtotal()
{
    System.out.print("Subtotal:\t");
    System.out.println("$"+(162.03 + 99.36 + 21.02 + 436.36));
}
public static void tax()
{
    System.out.print("8% Tax:\t\t");
    System.out.println("$"+ (.08*(162.03 + 99.36 + 21.02 + 436.36)));
}
public static void grandtotal()
{
    System.out.print("Grand Total:\t");
    System.out.print("$"+ (162.03 + 99.36 + 21.02 + 436.36-(.08*(162.03 + 99.36 + 21.02 + 436.36))));
}
}



