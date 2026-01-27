class reverse_array{
    public void reverseArray(int arr[]) {
     
        
        int n = arr.length;
        int i = 0;
        
        int j = n-1;
        
        
        for (i = 0 ; i <j ; i++, j--)
        
        {
            int t = arr[i];
            arr[i] = arr[j];
            arr[j] = t;
            
        }
        
    }
}