public class fiborecursion {
    public static void main(String[] args) {
        int x = 10; 
        System.out.println(x);
    }

    public static int f(int x) {
        // Base
        if (x == 0) return 0; 
        if (x == 1) return 1; 

        // Recursion: F(n) = F(n-1) + F(n-2)
        return f(x - 1) + f(x - 2);
    }
}
