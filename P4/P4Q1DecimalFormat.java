package P4;

import java.text.DecimalFormat;

public class P4Q1DecimalFormat {
    public static void main(String[] args) {
        double total = 0.4;
        for (int n = 0; n < 100; n++) {
            total += 0.4;
        }

        // Use DecimalFormat to format the output with desired precision
        DecimalFormat df = new DecimalFormat("0.0");
        System.out.println("total = " + df.format(total));
    }
}
