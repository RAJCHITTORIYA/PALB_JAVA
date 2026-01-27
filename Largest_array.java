import java.util.Arrays;

public class Largest_array {

    public static int largest(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);
        return arr[n-1];
        
    }
}
    

