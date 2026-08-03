package org.example;

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
