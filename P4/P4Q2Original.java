package P4;

import java.util.Scanner;

public class P4Q2Original {
  public static void main(String[] args) {
    String combineText = "", str;
    boolean flag = true;
    Scanner sc = new Scanner(System.in);
    while (flag) {
      System.out.print("Enter the word to combine: ");
      String st = sc.nextLine();
      combineText = combineText + st;
      if (st.equalsIgnoreCase("stop"))
        flag = false;
    }
    System.out.println("The combine text is: " + combineText);
  }
}