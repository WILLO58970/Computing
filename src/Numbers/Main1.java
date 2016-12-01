package Numbers;

import java.math.BigDecimal;

public class Main1
{

    public static void main(String[] args)
    {

        System.out.println ("Float calculation in progress...");

        long floatStartTime = System.currentTimeMillis();

        int floatCounter = 0;
        double floatNumber = 0;
        double floatIncrement = 0.000000001; // One billionth
        double floatTarget = 1;

        while (floatNumber < floatTarget)
        {
            floatCounter++;
            floatNumber += floatIncrement;
        }

        System.out.println ("Result: " + floatNumber);

        long floatEndTime = System.currentTimeMillis();
        System.out.println ("Calculated in " + floatCounter + " steps taking " 
            + (floatEndTime - floatStartTime) / 1000.0 + " seconds");

        // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 

        System.out.println ();        
        System.out.println ("Double calculation in progress...");

        long doubleStartTime = System.currentTimeMillis();

        int doubleCounter = 0;
        double doubleNumber = 0;
        double doubleIncrement = 0.000000001; // One billionth
        double doubleTarget = 1;

        while (doubleNumber < doubleTarget)
        {
            doubleCounter++;
            doubleNumber += doubleIncrement;
        }

        System.out.println ("Result: " + doubleNumber);

        long doubleEndTime = System.currentTimeMillis();
        System.out.println ("Calculated in " + doubleCounter + " steps taking " 
            + (doubleEndTime - doubleStartTime) / 1000.0 + " seconds");

        // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 

        System.out.println ();
        System.out.println ("BigDecimal calculation in progress...");

        long decimalStartTime = System.currentTimeMillis();

        int decimalCounter = 0;
        BigDecimal decimalNumber = new BigDecimal("0");
        BigDecimal decimalIncrement = new BigDecimal("0.000000001"); // One billionth
        BigDecimal decimalTarget = new BigDecimal("1");

        while (decimalNumber.compareTo(decimalTarget) < 0)
        {
            decimalCounter++;
            decimalNumber = decimalNumber.add(decimalIncrement);
        }

        System.out.println ("Result: " + decimalNumber);

        long decimalEndTime = System.currentTimeMillis();
        System.out.println ("Calculated in " + decimalCounter + " steps taking " 
            + (decimalEndTime - decimalStartTime) / 1000.0 + " seconds");

    }
}
