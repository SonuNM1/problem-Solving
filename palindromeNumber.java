import java.util.*;

public class Main {
    public static void main(String[] args) {
      
      // palindrome number - same when reversed
      
      int num = 121 ; 
    
      int temp = num ; 
      
      System.out.println("Original Num: " + num) ; 
      
      int rev = 0 ; 
      
      while(num != 0){
        rev = rev*10 + num % 10 ;
        num = num / 10 ; 
      }
      
      System.out.println("Reverse num: " + rev) ; 
      
      if(rev == temp){
        System.out.println("Palindrome");
      } else {
        System.out.println("Not palindrome"); 
      }
  }
}

