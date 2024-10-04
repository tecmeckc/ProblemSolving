import java.util.Scanner;

public class pArmstrong {
  public static int countDigits(int n) {
    int count = 0;
    while (n > 0) {
      int lastdigit = n % 10;
      

      ++count;
      n /= 10;

    }
    return count;

  }

  public static boolean isArmstrong(int n) {
    int count = countDigits(n);
    int copy = n;

    int sum = 0;
    while (n > 0) {
      int lastdigit = n % 10;
      sum += Math.pow(lastdigit, count);
      n /= 10;

    }

    if (sum == copy) {
      return true;
    }
    return false;
  }

  public static void main(String args[]) {
    // Your Code Here
    Scanner sc = new Scanner(System.in);
    int i = sc.nextInt();
    int j = sc.nextInt();
    for (int k = (int) Math.min(i, j); k <= (int) Math.max(i, j); k++) {
      if (isArmstrong(k)) {
        System.out.println(k);
      }
    }

  }
}
