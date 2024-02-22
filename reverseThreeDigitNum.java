import java.util.*;

public class Main {
    public static void main(String[] args) {
      // reverse a number 
      
      int a = 123 ; 
      
      System.out.println("Original Number: " +  a) ; 
      
      int reverse = (a%10)*100 + ((a/10)%10)*10 + (a/100) ; 
      
      System.out.println(reverse) ; 
       
  }
}