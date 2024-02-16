import java.util.*;

class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() == t.length()){
            char ch1[] = s.toCharArray() ; 
            char ch2[] = t.toCharArray() ; 

            Arrays.sort(ch1) ; 
            Arrays.sort(ch2) ; 
            for (char c: ch1){
                System.out.print(c);
                System.out.println();
            }
            for (char c: ch2){
                System.out.print(c);
                System.out.println();
            }

            boolean result = Arrays.equals(ch1, ch2);
            return result ;  
            
        }
        return false ; 
    }
}