import java.util.*;

public class Main {
    public static void main(String[] args) {
      // swap two numbers without using third variable
      
      int a = 1;
      int b = 2; 
      
      System.out.println("Before swapping: ") ; 
      
      System.out.println(a + " "+ b);
      
      a = a+b ; // 3
      b = a-b ; // 1
      a = a-b ;
      
      System.out.println("After swapping: ") ; 
      
      System.out.println(a + " "+ b);
      
  }
}