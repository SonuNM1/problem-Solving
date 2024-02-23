import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int num = 4;
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i; // Multiply by i in each iteration
        }
        System.out.println("Factorial: " + factorial);
    }
}
