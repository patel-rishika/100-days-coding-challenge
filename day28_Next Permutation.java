class Solution {
    public void nextPermutation(int[] nums) {
        
        int index = -1,n = nums.length;
        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                index = i;
                break;
            }
        }
        for(int i=n-1;i>=0 && index!=-1;i--){
            if(nums[i]>nums[index]){
                int temp = nums[index];
                nums[index] = nums[i];
                nums[i] = temp;
                break;
            }
        }
        int l = index + 1,r = n - 1;
        while(l<r){
            int temp = nums[l];
            nums[l] = nums[r];
            nums[r] = temp;
            l++;r--;
        }
    }
}
