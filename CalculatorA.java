
/**
 * Write a description of class CalculatorA here.
 *
 * @author (Maksim Botukh)
 * @version (1/26/2022)
 */
import javax.swing.*;
public class CalculatorA
{
    JFrame f;
    private int res;

    /**
     * Constructor for objects of class CalculatorB
     */
    public CalculatorA(String fullname, int num1, int num2, int oper)
    {
        OperationB Operator = new OperationB();
        System.out.println("\t Hello " + fullname);
        if (oper ==1)
        Operator.addition (num1, num2);
        else
        if (oper ==2)
        Operator.subtraction (num1,num2);
        else
        if (oper ==3)
        Operator.division (num1,num2);
        else
        if (oper ==4)
        Operator.multiplication (num1, num2);
        else
        JOptionPane.showMessageDialog (f, "Invalid Operator was entered");
    }

   
}
