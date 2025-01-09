public class powrecursion {
    public static void main(String[] args) {
            int x = 2; 
            int y = 5; 
            System.out.println(pow(x, y));
        }
    
        // Recursive function to calculate x^y
        public static int pow(int x, int y) {
            // Base 
            if (y == 0) return 1; 
            if (y == 1) return x; 
    
            // Recursion
            return x * pow(x, y - 1);
        }
    }
    

