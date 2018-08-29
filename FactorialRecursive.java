public class FactorialRecursive implements Factorial{

    /**
     * This is the factorial function, which calculates n!
     * n! = n * (n-1)! (recursive) -OR- n! = n * (n-1) * (n-2) * ... * 1 (iterative)
     *
     * @param n the index
     * @return n!
     */
    public int factorial(int n){
        //base case at index 0
        if(n == 0){
            return 1;
        } else{
            return n*factorial(n-1);
        }
    }
}