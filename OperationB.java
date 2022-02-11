
/**
 * Write a description of class OperationB here.
 *
 * @author (Maksim Botukh)
 * @version (1/26/2022)
 */
public class OperationB
{
    // instance variables - replace the example below with your own
    private double answer;

    /**
     * Constructor for objects of class OperationB
     */
    public void addition (double fnum, double snum)
    {
        answer= fnum + snum;
        System.out.println("Result is: "+ String.format("%.0f",answer));
        System.out.println("\nThank you!");
    }
    public void subtraction (double fnum, double snum)
    {
        answer= fnum - snum;
        System.out.println("Result is: "+ String.format("%.0f",answer)); 
        System.out.println("\nThank you!");
    }
    public void division (double fnum, double snum)
    {
        answer= fnum / snum;
        System.out.println("Result is: "+ String.format("%.0f",answer));
        System.out.println("\nThank you!");
    }
    public void multiplication (double fnum, double snum)
    {
        answer= fnum * snum;
        System.out.println("Result is: "+ String.format("%.0f",answer));
        System.out.println("\nThank you!");
    }

}
