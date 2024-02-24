class Solution {
    public int strStr(String haystack, String needle) {
        int m = haystack.length() ; // 9
        int n = needle.length() ; // 3

        for(int i=0 ; i < m-n+1 ; i++){
            if(haystack.charAt(i) == needle.charAt(0)){
                if(haystack.substring(i , i + needle.length()).equals(needle)){
                    return i ; 
                }
            }
        }
        return -1 ; 
    }
}