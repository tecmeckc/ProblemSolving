public class Series {
  public static void printSeries(int N1, int N2) {
    int cnt = 0;
    for (int i = 1; i <= N1; i++) {
      for (int j = cnt + i; j <= 100; j++) {
        int ans = (3 * j) + 2;
        if (ans % N2 != 0) {

          System.out.println(ans);
          break;
        } else {
          cnt++;
        }
      }

    }
  }

  public static void main(String[] args) {
    int n1 = 11;
    int n2 = 4;
    printSeries(n1, n2);
  }
}
