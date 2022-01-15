class BuyAndSellStock {
    public static void main(String[] args) {
                //So we calculate profit only when the stock is going up
                
            int[] a = {1, 5, 3, 8, 12};
            
// ------------------------------ EXPLANATION ---------------------------------
            
            // So in this array above elements representing stock price. 
            // Day one is start so if day two's price is greater than days one's
            // we calculate profit by (5-1) = 4.
            // So the next day's price is 3 which is less than previous days 5
            // so ignore it. Day 4 price is 8 which is greater than 3 so yea calculate profit (8-3) but..... this time make sure to add previous profit i.e 4 + (8-3) = 9.
            // Day 5th price is greater than 8 so yea calculate profit 9 + (12-8) = 13.
            
//------------------------------END OF EXPLANATION-------------------------
            int profit = 0;
            
            for(int i = 1; i < a.length; i++){
                if(a[i] > a[i - 1]){
                    profit += a[i] - a[i-1];
                }
            }
            
            System.out.println(profit);  
            
     }
}
