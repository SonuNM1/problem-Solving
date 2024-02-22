import java.util.*;

public class Main {
    public static void main(String[] args) {
      
      // count sum of digits in a Number
      
      int num = 1234 ; 
      int unitDigit ; 
      int sum = 0 ; 
      
      while(num != 0){
        unitDigit = num % 10 ; // 
        num = num / 10 ; 
        sum += unitDigit ; 
      }
      System.out.print("Sum of digits: " + sum);
    
      }
  }


