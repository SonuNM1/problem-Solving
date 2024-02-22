import java.util.*;

public class Main {
    public static void main(String[] args) {
      // reverse a number using StringBuffer
      
      System.out.println("Enter a number: ") ;
      Scanner sc = new Scanner(System.in) ; 
      int num = sc.nextInt() ; 
      
       System.out.println("Original number: " + num) ;
       
       StringBuffer sb = new StringBuffer(String.valueOf(num)) ; 
       
       sb = sb.reverse() ; 
       
       System.out.println("String number: " + sb) ;
  }
}

