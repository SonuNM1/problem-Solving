import java.util.*;

public class Main {
    public static void main(String[] args) {
      
      // count number of even and odd digits in a number
    
    int num = 5482 ; 
    
    int unitDigit = 0, countOdd = 0, countEven = 0 ; 
    
    while(num != 0){  // 1234
    
      unitDigit = num % 10 ; // 4
      num = num/10 ;  // 123
      if(unitDigit % 2 == 0){  // true 
        countEven++ ; // 1
      } else {
        countOdd++ ; 
      }
    }
    
    System.out.print("Odd count: " + countOdd + " , Even count: " + countEven) ; 
      }
  }

// import java.util.*;

// public class Main {
//     public static void main(String[] args) {
      
//       // count number of even and odd digits in a number
    
//     int num = 5482 ; 
    
//     String text = "" ; 
    
//     int countEven = 0, countOdd = 0; 
    
//     text = text.valueOf(num) ; 
    
//     for(char a: text.toCharArray()){
//       int temp = a - '0';
//       if(temp % 2 == 0){
//         countEven++ ; 
//       } else{
//         countOdd++ ; 
//       }
//     }
//     System.out.print("Odd: "+ countOdd + ", Even: " + countEven);
//       }
//   }



