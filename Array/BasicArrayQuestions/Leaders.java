class Leaders {
    public static void main(String[] args) {
        int[] a = {7,10,4,10,6,5,2};
        int n = a.length;
        int currentLeader = a[n-1]; // since last element is always a leader.
        System.out.print(currentLeader + " ");
        
        for(int i = n-2; i >= 0; i--){
            if(a[i] > currentLeader){
                currentLeader = a[i];
                System.out.print(a[i] + " ");
            }
        }
    }
}
