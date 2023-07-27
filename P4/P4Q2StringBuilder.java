package P4;

import java.util.Scanner;

public class P4Q2StringBuilder {
    public static void main(String[] args) {
        StringBuilder combineText = new StringBuilder();
        boolean flag = true;
        Scanner sc = new Scanner(System.in);

        while (flag) {
            System.out.print("Enter the word to combine: ");
            String st = sc.nextLine();

            if (st.equalsIgnoreCase("stop")) {
                flag = false;
            } else {
                combineText.append(st);
            }
        }
    }
}
