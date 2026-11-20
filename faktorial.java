
import java.util.*;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long f = 1;

        if (n < 0) {
            System.out.print("tidak terdefenisi");
        } else {
            for (int i = n; i >= 1; i--) {
                f *= i;
            }
            System.out.print(f);
        }
    }
}
