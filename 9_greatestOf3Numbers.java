import java.util.*;

// largest of 3 numbers

public class Main {
    public static void main(String[] args) {
     int a, b, c ;
     a = 1; b = 2; c = 3 ; 
     int largest = greatestInteger(a,b,c) ; 
     System.out.print("Greatest: "  + largest);
  }
  static int greatestInteger(int x, int y, int z){
    if(x>y && x>z){
      return x ; 
    } else if(y>x && y>z){
      return y ; 
    } else{
      return z ; 
    }
  }
}

// import java.util.*;

// {OPTIMIZED} largest of 3 numbers

// public class Main {
//     public static void main(String[] args) {
//      int a, b, c ;
//      a = 1; 
//      b = 2; 
//      c = 3 ; 
//      int largest = greatestInteger(a,b,c) ; 
//      System.out.print("Greatest: "  + largest);
//   }
//   static int greatestInteger(int x, int y, int z){
//     int largest1 = x>y?x:y ; 
//     int largest2 = z>largest1?z:largest1 ; 
//     return largest2 ; 
//   }
// }





