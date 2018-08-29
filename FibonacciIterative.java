public class FibonacciIterative implements Fibonacci {

    /**
     * The factorial function calculates fib(n), where:
     * fib(0) = 0; fib(1) = 1 ... and otherwise:
     * fib(n) = fib(n-1) + fib(n-2)
     * @param n
     * @return fib(n) as defined above.
     */
    public int fibonacci(int n) {
        //n is the index that you are going to
        int n1 = 0;
        int n2 = 1;
        int current = n1 + n2;
        if(n == 0) {
            return 0;
        } else if(n<=1) {
            return 1;
        } else {
            for(int i = 2; i <= n; i++ ) {
                current = n1 + n2;
                int temp = n2;
                n1 = temp;
                n2 = current;
            }
            return current;
        }

    }

}

