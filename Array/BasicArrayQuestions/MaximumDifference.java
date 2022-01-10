// This program considers order of elements.

class MaximumDifference {
    public static void main(String[] args) {
        int[] a = {7,10,4,10,6,5,2};
        int n = a.length;
        int res = a[1] - a[0];
        int minValue = a[0];
        
        for(int i = 0; i < n; i++){
            res = Math.max(res , a[i] - minValue);
            minValue = Math.min(a[i] , minValue);
        }
        
        System.out.println(res);
    }
}
