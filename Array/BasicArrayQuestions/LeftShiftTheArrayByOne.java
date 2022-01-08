class LeftShiftTheArrayByOne {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        int temp = a[0];
        n = a.length;
        
        
        for(int i = 0; i < n-1; i++){
            a[i] = a[i+1];
        }
        a[n-1] = temp;
        
        for(int j = 0; j < n; j++){
            System.out.print(a[j] + " ");
        }
    }
}
