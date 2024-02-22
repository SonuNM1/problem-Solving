import java.util.*;

public class Main {
    public static void main(String[] args) {
      
      // reverse a String 
      
      Scanner sc = new Scanner(System.in) ; 
      System.out.println("Give input: ") ; 
      String name = sc.next() ; 
      
      System.out.println("Original String: " + name) ;
      
      String reverse = "" ; 
      
      for(int i = name.length()-1 ; i >= 0 ; i--){
        reverse += name.charAt(i) ; 
      }
      
      System.out.println("Reverse String: " + reverse) ;
  }
}

  // char [] a = name.toCharArray() ; 
      
  //     for(int i = a.length-1 ; i >= 0 ; i--){
  //       reverse += a[i] ; 
  //     }
  //     System.out.println("Reverse String: " + reverse) ; 