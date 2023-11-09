package org.example;

public class Fibonacci {
    public static int recursionExecute(int n){
        if (n == 1 || n == 0)
            return n;
        return recursionExecute(n - 1) + recursionExecute(n - 2);
    }

    public static int cycleExecute (int n){
        if (n <= 1)
            return n;
        int n0 = 0, n1 = 1, result = 0;
        for (int i = 2; i <= n; i++){
            result = n0 + n1;
            n0 = n1;
            n1 = result;
        }
        return result;
    }
}
