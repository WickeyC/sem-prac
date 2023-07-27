package P4;

import java.math.BigDecimal;

public class P4Q1BigDecimal {
    public static void main(String[] args) {
        BigDecimal total = new BigDecimal("0.4");
        BigDecimal increment = new BigDecimal("0.4");

        for (int n = 0; n < 100; n++) {
            total = total.add(increment);
        }

        System.out.println("total = " + total);
    }
}
