class FrequencyInSortedArray {
    public static void main(String[] args) {
        int[] a = {10, 10, 20, 20, 50, 30};
        int n = a.length;
        int i = 1;
        int frequency = 1;
        while(i < n){
            while(i < n && a[i] == a[i-1]){
                frequency++;
                i++;
            }
            System.out.println(a[i-1] + ":" + frequency);
            frequency = 1;
            i++;
        }
         if(n == 1 || a[n-1] != a[n-2]){
            System.out.println(a[n-1] + ":" + frequency);
        }
        
    }
}
