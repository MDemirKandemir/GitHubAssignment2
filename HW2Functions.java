

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

}
