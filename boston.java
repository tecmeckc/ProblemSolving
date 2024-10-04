// import java.util.*;

public class boston {
  public static int bostonNumber(int n) {
    int digitSum = 0, primeSum = 0;
    int copy = n;
    while (n > 0) {
      int lastdigit = n % 10;
      digitSum += lastdigit;
      n /= 10;

    }
    for (int div = 2; div * div <= copy; div++) {
      while (copy % div == 0) {
        int divC = div;
        copy /= div;
        while (divC > 0) {
          int divdi = divC % 10;
          primeSum += divdi;
          divC /= 10;
        }

      }

    }
    if (copy != 1) {
      while (copy > 0) {
        int copyd = copy % 10;
        primeSum += copyd;
        copy /= 10;
      }

    }

    if (digitSum == primeSum) {
      return 1;
    }
    return 0;

  }

  public static void main(String args[]) {
    // Scanner sc = new Scanner(System.in);
    // int n = sc.nextInt();
    // System.out.println(bostonNumber(n));

  }
}
