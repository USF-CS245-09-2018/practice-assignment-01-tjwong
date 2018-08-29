public class FibonacciRecursive implements Fibonacci {

    /**
     * The factorial function calculates fib(n), where:
     * fib(0) = 0; fib(1) = 1 ... and otherwise:
     * fib(n) = fib(n-1) + fib(n-2)
     * @param n the index
     * @return fib(n) as defined above.
     */
    public int fibonacci(int n){
        //n is the index that you're moving towards
        //base case is at zero
        if(n == 0){
            return 0;
        }else if(n == 1){
            return 1;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }
}
