public class inverseOfNumber {
  public static void main(String args[]) {

    int n = 32145;
    int num, position = 0, powten, i, sum = 0;

    while (n > 0) {
      num = n % 10;
      position++;
      i = 1;
      powten = 1;

      while (i <= (num - 1)) {
        powten = powten * 10;
        i++;
      }

      sum = sum + position * powten;

      n = n / 10;
    }

    System.out.println(sum);
  }
}
