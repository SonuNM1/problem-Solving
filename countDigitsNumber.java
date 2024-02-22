import java.util.*;

public class Main {
    public static void main(String[] args) {
      
      // count number of digits in a number
    
    int num = 1235324 ; 
    
    int count = 0 ; 
    
    while(num != 0){
      if(num % 10 != 0){
        count++ ; 
        num = num/10 ; 
      }
    }
    
    System.out.println(count); 
    
      }
  }


