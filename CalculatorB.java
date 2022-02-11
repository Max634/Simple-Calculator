
/**
 * Write a description of class CalculatorB here.
 *
 * @author (Maksim Botukh)
 * @version (1/26/2022)
 */
import java.util.Scanner;
import javax.swing.*;
public class CalculatorB
{
    JFrame f;
    

    /**
     * Constructor for objects of class CalculatorB
     */
    public CalculatorB()
    {
        OperationB Operator= new OperationB();
        Scanner inp= new Scanner(System.in);
        Scanner fname = new Scanner (System.in);
        Scanner lname = new Scanner (System.in);
        
        double num1, num2;
        int Oper;
        System.out.println ("Please, enter your first name: ");
        String fnameinp =fname.next();
        System.out.println ("Please, enter your last name: ");
        String lnameinp= lname.next ();
        System.out.println ("Please, enter the first number: ");
        num1= inp.nextDouble();
        System.out.println ("Please, enter the second number: ");
        num2= inp.nextDouble();
        System.out.println ("Please, select Operation to Perform: ");
        System.out.println ("1-Addition");
        System.out.println ("2-Substraction");
        System.out.println ("3-Division");
        System.out.println ("4-Multiplication");
        Oper = inp.nextInt();
        System.out.println ("\t Hello "+fnameinp+ " " +lnameinp);
        
        switch (Oper)
        {
        
            case 1:
                Operator.addition (num1, num2);
                System.out.println();
                break;
            case 2:
                Operator.subtraction (num1, num2);
                System.out.println();
                break;
            case 3:
                Operator.division (num1, num2);
                System.out.println();
                break;
            case 4:
                Operator.multiplication (num1, num2);
                System.out.println();
                break;
            default:JOptionPane.showMessageDialog (f,"Invalid Operator was entere");
        }
        
            
    }

   
}
