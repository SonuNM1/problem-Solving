import java.util.*;

public class Main {
    public static void main(String[] args) {
      
      // palindrome string - same when reversed
    
    System.out.println("Enter a string: ") ; 
    Scanner sc = new Scanner(System.in) ; 
    
    String text = sc.next() ; 
    
    System.out.println("Original String: " + text) ; 
    
    String temp = text ; 
    String reverse = "" ; 
    
    for(int i = text.length()-1 ; i >= 0 ; i--){
      reverse += text.charAt(i) ; 
    }
    
    if(temp.equals(reverse)){
      System.out.println("Palindrome");
    } else {
      System.out.println("not palindrome") ; 
    }
      }
  }


