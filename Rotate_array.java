public class Rotate_array {

        public void rotate(int[] arr) {
        int n = arr.length;
        int i = 0;
        int j = arr[n-1];
        
        for ( i = n-1  ; i > 0; i--)
        {
            arr[i]= arr[i-1];
            // arr[i] = t;
            
        }
        
        arr[0] = j;
        
    }
    
}
