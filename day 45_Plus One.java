class Solution {
    public int[] plusOne(int[] digits) {
        int s = digits.length;
        int j = s-1;
        while(j>=0){
            if(digits[j]==9){
                digits[j] = 0;
                j--;
            }
            else{
                digits[j] = digits[j] + 1;
                return digits;
            }
        }
        int[] ans = new int[s+1];
        ans[0] = 1;
        return ans;
    }
}
