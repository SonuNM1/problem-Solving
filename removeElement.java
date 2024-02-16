class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0 ; // count of non-val elements

        for(int i=0 ; i<nums.length ; i++){
            if(nums[i] != val){
                nums[k] = nums[i] ; 
                k++ ; 
            }
        }
        return k ; 
    }
}