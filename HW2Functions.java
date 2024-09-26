
public class HW2Functions 
{
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
