package com.inabananami.a05threadmethod2;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class MyRunable extends Thread {
    @Override
    public void run() {
        if(Thread.currentThread().getName().equals("バンド")){
            piCalculation(100);
        }
        for (int i = 1; i <= 100; i++) {
            System.out.println(Thread.currentThread().getName() + "---" + i);
        }
    }

    public void piCalculation(int limit) {
        MathContext mc = new MathContext(limit + 5, RoundingMode.HALF_UP); // 多给一些位数避免舍入误差

        // Leibniz 公式 π/4 = 1 - 1/3 + 1/5 - 1/7 + ...
        BigDecimal pi = BigDecimal.ZERO;
        BigDecimal one = BigDecimal.ONE;
        for (int i = 0; i < 1000000; i++) { // 循环次数越多，精度越高
            BigDecimal term = one.divide(new BigDecimal(2 * i + 1), mc);
            if (i % 2 == 0) {
                pi = pi.add(term);
            } else {
                pi = pi.subtract(term);
            }
        }
        pi = pi.multiply(new BigDecimal(4), mc);
        pi = pi.setScale(limit, RoundingMode.HALF_UP);
    }
}
