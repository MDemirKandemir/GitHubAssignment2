/* A class that contains array functions of HW1
 * 
 * @authors Mustafa Demir Kandemir, Zeynep Avcı, Azra Giray, Necati Kaan Aydınlı
 * @date 25.09.2024
 * 
 */
import java.lang.reflect.Array;
import java.util.Arrays;

public class HW2Functions 
{
    /** *
    * A method that finds the sum of elements with odd- and even-numbered indexes
    *@params int[] array  
    *@return int array [0] contains even index sums [1] contains odd index sums
    */
    public static int[] oddEvenIndexSum(int[] givenArray)
    {
        int[] output = new int[2];

        int evenSum,
            oddSum,
            arraySize;
        
        evenSum = 0;
        oddSum = 0;
        arraySize = Array.getLength(givenArray);

        for(int i = 0; i<arraySize; i++ )
        {
            if(i%2 == 0)
            {
                evenSum += givenArray[i];
            }
            else
            {
                oddSum += givenArray[i];
            }
        }

        output[0] = evenSum;
        output[1] = oddSum;

        return output;
    }

    
}
