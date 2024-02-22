import java.util.*;

public class Main {
    public static void main(String[] args) {
      // reverse a number 
      
      int a = 1234 ; 
      
      System.out.println("Original Number: " +  a) ; 
      
      int reverse = 0;
      
      while(a != 0){
        reverse = reverse*10 + a % 10 ;
        a = a / 10; 
      }
       
  }
}




