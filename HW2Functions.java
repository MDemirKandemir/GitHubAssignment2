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
