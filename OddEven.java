
// import java.util.Scanner;

public class OddEven {
  public static void oddEvenRule(int n) {
    int sumOdd = 0, sumEven = 0;
    while (n != 0) {
      int lastdigit = n % 10;
      if (lastdigit % 2 == 0) {
        sumEven += lastdigit;
      } else
        sumOdd += lastdigit;
      n /= 10;

    }

    if (sumEven % 4 == 0 || sumOdd % 3 == 0) {
      System.out.print("Yes");
    } else
      System.out.print("No");

  }

  public static void main(String args[]) {
    // Scanner sc = new Scanner(System.in);
    // int N = sc.nextInt();
    // int[] cars = new int[N];

    // for (int i = 0; i < cars.length; i++) {
    // cars[i] = sc.nextInt();

    // }
    // for (int i = 0; i < cars.length; i++) {
    // oddEvenRule(cars[i]);
    // System.out.println();
    // }

  }
}
