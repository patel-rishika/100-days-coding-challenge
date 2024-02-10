class Solution {
    public int maxProfit(int[] prices) {
        
        int n=prices.length;
        int maxpro=0;
        int daypro=0;
        int minpri=prices[0];
        for(int i=0;i<n;i++)
        {
            minpri=Math.min(minpri , prices[i]);
            daypro=prices[i]-minpri;
            maxpro=Math.max(maxpro , daypro);
        }
    
         return maxpro;
    }
}
