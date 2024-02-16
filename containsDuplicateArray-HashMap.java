import java.util.*;
class Solution {
    public static boolean containsDuplicate(int[] nums){
        boolean duplicateElement = false ; 

        HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();
        for(int i=0 ; i<nums.length ; i++){
            if (hash.containsKey(nums[i])){
                return true;
            } else {
                hash.put(nums[i], 1);
            }
        }
        return false ; 
    }
}


        