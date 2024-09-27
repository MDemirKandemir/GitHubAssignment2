/* A program that  is made for HW1
 * 
 * @authors Mustafa Demir Kandemir, Zeynep Avcı, Azra Giray, Necati Kaan Aydınlı
 * @date 25.09.2024
 * 
 */
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HW2Functions{
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
        arraySize = givenArray.length;

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
    /**
     * Finds the maximum value in array
     * @param arr Array
     * @return Max value in the array
     */
    public static int findMax(int[] arr){

        int max = 0;    
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
    /**
     * Finds the min value in array
     * @param arr Array
     * @return Min value
     */
    public static int findMin(int[] arr){

        int min = Integer.MAX_VALUE;    
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
    /**
     * Creates an array with given length and randomizes each element
     * @param length The size of the array
     * @return Array
     */
    public static int[] arr(int length){
        Random rand = new Random();
        int[] arr = new int[length];
        for(int i = 0; i < length; i++){
            arr[i] = rand.nextInt(101);
        }
        return arr;

    }
    /** This is a method that find the average of an array and than displays how each element of the array differs from the average. 
     * @param array
     * @return integer array
    */
    public static void differenceWithAverage (int[] array){
        int average;    
        int sum;
        sum=0;
        for(int i=0; i < array.length; i++)
        {
            sum += array[i];
        }
        average = (sum / array.length);
        int[] newArray = new int[array.length];
        for(int i=0; i < array.length; i++){
            newArray[i] = array[i] - average;
        }
        System.out.println(Arrays.toString(newArray));
    }
    public static void main(String[] args) {
        int choice = 0;    
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the size of an array");
        choice = in.nextInt();

        int[] arr = arr(choice);
        System.out.println( "Array: " + Arrays.toString(arr));

        while(choice != -1){

            System.out.println("\n\n\n1. Find the minimum value in the array");
            System.out.println("2. Find the maximum value in the array");
            System.out.println("3. Find the average of the array and see how each element differs from average");
            System.out.println("4. Find the number of elements with odd and even numbered indexes");
            System.out.println("Enter your choice(-1 to exit) \n");

            choice = in.nextInt();

            if(choice == 1){
                System.out.println( "Minimum number: "  +  findMin(arr)); 
            }
            else if(choice == 2){
                System.out.println("Maximum number: " + findMax(arr));
            }
            else if(choice == 3){
                differenceWithAverage(arr);
            }
            else if(choice == 4){
                int[] total = oddEvenIndexSum(arr);
                System.out.println("The sum of odd indexed numbers: " + total[1]);
                System.out.println("The sum of even indexed numbers: " + total[0]);
            }
        }
        System.out.println("Goodbye :)");
        in.close();
    }
}
