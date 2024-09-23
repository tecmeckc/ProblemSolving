// import java.util.Scanner;
public class nfibonacci {
  public static int nFibonnacci(int n) {
    int a = 0, b = 1;
    int c = 0;
    while (n == 0) {
      return c;

    }
    for (int i = 1; i < n; i++) {

      c = a + b;
      a = b;
      b = c;

    }
    return c;
  }

  public static void main(String args[]) {
    // Your Code Here
    // Scanner sc=new Scanner(System.in);
    // int n=sc.nextInt();
    // System.out.println(nFibonnacci(n));
  }
}
