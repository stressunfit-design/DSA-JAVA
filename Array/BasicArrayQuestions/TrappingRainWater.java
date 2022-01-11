import java.util.*;
import java.io.*;
import java.lang.*;
class TrappingRainWater {
    public static void main(String[] args) {
          
                
            int a[] = {3, 0, 1, 2, 5};
            int n = a.length;
            int res = 0;
        
            
            for(int i = 1; i < n-1; i++){
                int lmax = a[i];
                for(int j = 0; j < i; j++){
                    lmax = Math.max(lmax, a[j]);
                }
                
                int rmax = a[i];
                for(int j = i + 1; j < n; j++){
                   rmax = Math.max(rmax, a[j]);
                }
                res = res + (Math.min(lmax,rmax) - a[i]);
            }
            System.out.println(res);
     }
}
