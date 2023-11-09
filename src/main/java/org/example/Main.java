package org.example;

public class Main {
    public static void main(String[] args) {
        int n = 12, a = 255, b = 181;
        int resultRecursionFactorial = Factorial.recursionExecute(n);
        int resultCycleFactorial = Factorial.cycleExecute(n);
        assert resultRecursionFactorial == resultCycleFactorial: "Different values factorial";
        System.out.println("Factorial of " + n + ": " + resultCycleFactorial);

        int resultRecursionFibonacci = Fibonacci.recursionExecute(n);
        int resultCycleFibonacci = Fibonacci.cycleExecute(n);
        assert resultRecursionFibonacci == resultCycleFibonacci: "Different values fibonacci";
        System.out.println("Fibonacci of " + n + ": " + resultRecursionFibonacci);

        int resultDigitsOfSum = DigitSumRecursive.execute(n);
        System.out.println("Sum of digits of " + n + ": " + resultDigitsOfSum);

        int resultSumRecursive = SumRecursive.execute(a, b);
        System.out.println("Sum of " + a + " and " + b + ": " + resultSumRecursive);
    }
}