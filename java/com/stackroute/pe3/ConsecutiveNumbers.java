package com.stackroute.pe3;

import java.util.Arrays;

public class ConsecutiveNumbers {
    public ConsecutiveNumbers()
    {

    }

    public String isConsecutiveNumbers(String numbers)
    {
        try {

            String[] numberStrings = numbers.trim().split(",");

            int[] numArray = new int[numberStrings.length];

            for (int i = 0; i < numArray.length; i++) {
                numArray[i] = Integer.parseInt(numberStrings[i]);
            }

            Arrays.sort(numArray);

            for (int i=0; i < numArray.length-1; i++)
            {
                if(numArray[i] + 1 != numArray[i+1])
                {
                    return "Non Consecutive numbers";
                }
            }

            return "Consecutive numbers";

        }
        catch (Exception exception)
        {
            return "Please enter all integers";
        }
    }
}
