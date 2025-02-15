public class anytoany {
    public static int anyBaseTodecimal(int x, int r) {
        int ans = 0;
        int power = 1;
        while (x != 0) {
            int lastDigit = x % 10;
            x = x / 10;
            ans += lastDigit * power;
            power *= r;
        }
        return ans;
    }

    public static int decimalToAnyBase(int x, int b) {
        int ans = 0;
        int power = 1;
        while (x != 0) {
            int lastD = x % 10;
            x = x / 10;
            ans += power * lastD;
            power *= 10;
        }
        return ans;
    }

    public static void main(String[] args) {
        int y = 101;
        System.out.println(anyBaseTodecimal(y, 2));
        System.out.print(decimalToAnyBase(y, 2));
    }
}
