package P4;

public class P4Q1Math {
    public static void main(String[] args) {
        double total = 0.4;
        for (int n = 0; n < 100; n++) {
            total += 0.4;
        }

        // Use Math.round() to round the result to one decimal place
        double roundedTotal = Math.round(total * 10.0) / 10.0;

        System.out.println("total = " + roundedTotal);
    }
}
