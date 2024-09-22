import java.util.Scanner;

public class ShoppingGame {
  public static void shoppingGame(int M, int N) {
    int i = 0, j = 0, Aayush = 0, Harshit = 0;
    while (Aayush <= M) {
      i = j + 1;
      Aayush += i;

    }
    while (Harshit <= N) {
      j = i + 1;
      Harshit += j;

    }
    if (Aayush > Harshit) {
      System.out.println("Aayush");
    } else if (Harshit > Aayush) {
      System.out.println("Harshit");
    } else {
      System.out.println("Match tied");

    }
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    int[] maxR = new int[2 * size];

    for (int i = 0; i < maxR.length; i++) {
      maxR[i] = sc.nextInt();
    }

    int k = 0;
    int j = 1;
    while (j < maxR.length && k < maxR.length - 1) {
      shoppingGame(maxR[k], maxR[j]);
      k = k + 2;
      j = k + 1;
    }

  }
}
