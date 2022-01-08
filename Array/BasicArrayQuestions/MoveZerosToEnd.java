class MoveZerosToEnd {
    public static void main(String[] args) {
        int[] a = {8,5,0,10,0,20};
        int count = 0;
        int temp;
        for(int i = 0; i < a.length; i++){
            if(a[i] != 0){
                temp = a[i];
                a[i] = a[count];
                a[count] = temp;
                count++;
            }
        }
        for(int k = 0; k < a.length; k++){
            System.out.print(a[k] + " ");
        }
        
    }
}
