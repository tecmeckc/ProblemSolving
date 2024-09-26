import java.util.Scanner;

public class fahreineitToCelsius {
  public static void main(String args[]) {
    // Your Code Here
    Scanner sc = new Scanner(System.in);

    int minFValue = sc.nextInt();
    int maxFValue = sc.nextInt();
    int step = sc.nextInt();

    while (minFValue <= maxFValue) {
      int F = minFValue;

      int C = (minFValue - 32) * 5 / 9;
      minFValue += step;

      System.out.println(F + " " + C);
    }

  }
}
