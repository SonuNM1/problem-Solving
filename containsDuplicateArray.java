class Solution {
    public static boolean containsDuplicate(int[] nums){
        boolean duplicateElement = false ; 

        for(int i=0 ; i<=nums.length ; i++){
            for(int j=i+1 ; j<= nums.length-1 ; j++){
                if(nums[i] == nums[j]){
                    duplicateElement = true ; 
                    break ; 
                }
            }
            if(duplicateElement){
                break ; 
            }
        }
        return duplicateElement ; 
    }
}