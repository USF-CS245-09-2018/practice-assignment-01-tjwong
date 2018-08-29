public class FactorialIterative implements Factorial {

    /**
     * This is the factorial function, which calculates n!
     * n! = n * (n-1)! (recursive) -OR- n! = n * (n-1) * (n-2) * ... * 1 (iterative)
     *
     * @param n the index
     * @return n!
     */
    public int factorial(int n){
        int totalFactorial = 1;
        for(int i = n; i > 0; i--){
            totalFactorial *= i;
        }
        return totalFactorial;
    }
}
