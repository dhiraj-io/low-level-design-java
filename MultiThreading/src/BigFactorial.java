package org.example;

// Problem: Compute factorial of a large number using a separate thread.
// - Extend Thread (not Runnable) — assignment requires it
// - Use BigInteger — factorial of large numbers exceeds int/long range
// - Method must be named getFactorial() — test calls this exact name
// - run() does the computation; main thread calls join() before getFactorial()
// - BigInteger is immutable — always reassign: ans = ans.multiply(...)

import java.math.BigInteger;

public class BigFactorial extends Thread {

    private int number = 0;
    private BigInteger ans;

    public BigFactorial(int number) {
        this.number = number;
    }

    public BigInteger getFactorial() {
        return ans;
    }

    @Override
    public void run() {
        ans = BigInteger.ONE;
        for (int i = 1; i <= number; i++) {
            ans = ans.multiply(BigInteger.valueOf(i));
        }
    }
}
