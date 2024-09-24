// import java.util.*;

public class LCM {
  // function to print LCM of two numbers
  public static int LCMofij(int i, int j) {
    int ans = 0, p = Integer.MAX_VALUE;
    for (int k = (int) Math.min(i, j); k < (i * j); k++) {
      if (k % i == 0 && k % j == 0) {
        ans = (int) Math.min(p, k);
        return ans;
      }
    }

    return i * j;
  }

  public static void main(String args[]) {
    // Scanner sc = new Scanner(System.in);
    // int i = sc.nextInt();
    // int j = sc.nextInt();
    // System.out.println(LCMofij(i, j));
  }
}
