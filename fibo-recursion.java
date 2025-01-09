public class Fibonacci {
    public static void main(String[] args) {
        int x = 10; 
    }

    
    public static int f(int x) {
        // Base
        if (x == 0) return 0; 
        if (x == 1) return 1; 

        // Recursive relation: F(n) = F(n-1) + F(n-2)
        return f(x - 1) + f(x - 2);
    }
}
