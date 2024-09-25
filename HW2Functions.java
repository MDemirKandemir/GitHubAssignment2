

public class HW2Functions {

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

import java.util.Random;

public class HW2Functions {
     public static int[] arr(int length){
        Random rand = new Random();
        int[] arr = new int[length];
        for(int i = 0; i < length; i++){
            arr[i] = rand.nextInt(101);
        }
        return arr;

    }
}
