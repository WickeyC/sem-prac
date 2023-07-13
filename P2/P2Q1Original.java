package P2;

public class P2Q1Original {
    public boolean largest(int num1, int num2) {
        boolean flag;
        if (num1 > num2) {
            flag = true;
        } else if (num1 == num2) {
            flag = false;
        } else {
            flag = false;
        }
        return flag;
    }

    // return(num1 > num2);
}
