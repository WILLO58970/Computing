package Numbers;

import java.math.BigDecimal;

public class Main2
{

    public static void main(String[] args)
    {

        int counter = 0;
        float floatNumber = 1;
        double doubleNumber = 1;
        BigDecimal decimalNumber = new BigDecimal("1");

        do
        {                          
            counter++;
            floatNumber /= 2;
            doubleNumber /= 2;
            decimalNumber = decimalNumber.divide(new BigDecimal("2"));

            System.out.println(counter + ":\t" + floatNumber + "\t" + doubleNumber + "\t" + decimalNumber);

        }
        while (doubleNumber > 0);

    }
}