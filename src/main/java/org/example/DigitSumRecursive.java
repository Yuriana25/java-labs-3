package org.example;

public class DigitSumRecursive {
    public static  int execute(int n){
        if (n < 10)
            return  n;
        return n % 10 + execute(n / 10);
    }
}
