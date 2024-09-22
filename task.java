import java.lang.Math;

public class task {
	// sum of odd and even placed digits
	public static void sumOddEven(int n) {
		int sumOdd = 0, sumEven = 0, pos = 1;
		while (n != 0) {

			if (pos % 2 == 0) {
				sumEven += n % 10;
			} else
				sumOdd += n % 10;
			n /= 10;
			pos++;

		}
		System.out.println("The sum of odd placed digits is:" + sumOdd);
		System.out.println("The sum of even placed digits is:" + sumEven);
	}

	// Binary to Decimal
	public static int binaryToDecimal(int n) {
		int ans = 0, p = 0;
		while (n > 0) {
			int lastdigit = n % 10;
			ans += lastdigit * (int) Math.pow(2, p);
			n /= 10;
			p++;
		}
		return ans;
	}

	// Counting the number of digits in a number
	public static int countDigits(int n) {
		int count = 0;
		while (n > 0) {
			int lastdigit = n % 10;

			++count;
			n /= 10;
		}
		return count;

	}

	// to check if the number is an armstrong number or not
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
		int n = 3461;
		// sumOddEven(n);
		System.out.println(isArmstrong(n));

	}
}
