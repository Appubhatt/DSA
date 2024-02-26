package slidingwindow;

public class BestTimeToBuyAndSellStock {
     public static int maxProfit(int[] prices){
        int max=0;
        int l=0,r=1;
        while(r<prices.length) {
            if (prices[l] < prices[r]) {
                max = Math.max(max, prices[r] - prices[l]);
            } else {
                l = r;
            }
            r++;
        }
         return max;
     }

    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{2,1,2,1,0,1,2}));
    }
}
