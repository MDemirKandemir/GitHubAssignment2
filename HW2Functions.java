/* A class that contains array functions of HW1
 * 
 * @authors Mustafa Demir Kandemir, Zeynep Avcı, Azra Giray, Necati Kaan Aydınlı
 * @date 25.09.2024
 * 
 */
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

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

    
    public static int[] findMinMax(int[] arr){

        int max = 0;
        int min = Integer.MAX_VALUE;
        int[] minMax = new int[2];
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }

            if(arr[i] < min){
                min = arr[i];
            }

        }
        minMax[0] = min;
        minMax[1] = max;
        return minMax;
    }
     public static int[] arr(int length){
        Random rand = new Random();
        int[] arr = new int[length];
        for(int i = 0; i < length; i++){
            arr[i] = rand.nextInt(101);
        }
        return arr;

    }
    /* This is a method that find the average of an array and than displays how each element of the array differs from the average. 
     * @param integer array
     * @return integer array
    */

    public static int[] differenceWithAverage (int[] array)
    {
        int numbersOfElements;
        int average;    
        numbersOfElements = (array.length)-1;
        int sum;
        sum=0;
        for(int i=0; i<numbersOfElements; i++)
        {
            sum += array[i];
        }
        average = (sum/numbersOfElements);
        int[] newArray = new int[numbersOfElements];
        for(int i=0; i<numbersOfElements; i++)
        {
            newArray[i] = array[i]-average;
        }
        return newArray;


    }
}
