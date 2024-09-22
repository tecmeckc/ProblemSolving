// import java.util.Scanner;

public class Rev {
  public static void Rotate(int[] arr) {
    int num = arr[arr.length - 1];
    for (int i = arr.length - 2; i >= 0; i--) {
      arr[i + 1] = arr[i];
    }
    arr[0] = num;

  }

  public void RotateByK(int[] arr, int k) {

    for (int i = 1; i < k; i++) {
      Rotate(arr);
    }
  }

  public static void Optimized(int[] arr, int k) {
    int n = arr.length;
    revArr(arr, 0, n - 1 - k);
    revArr(arr, n - k, n - 1);
    revArr(arr, 0, n - 1);
  }

  static void disp(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }

  static void revArr(int[] arr, int i, int j) {
    while (i <= j) {
      int temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;
      i++;
      j--;

    }

  }

  public static void main(String[] args) {
    // int[] A = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

    // Scanner sc = new Scanner(System.in);
    // int n = sc.nextInt();
    // int digit = sc.nextInt();
    // System.out.print(countDigits(n, digit));

  }
}
