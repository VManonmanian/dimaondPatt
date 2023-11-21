// first line is 1 is ok
import java.util.Scanner;
import java.util.Arrays;

public class DimandString {
	public static void main(String[] args) {
		Scanner user = new Scanner(System.in);
		String name = "string";
		int length;
		int i, j, k;
		for (;;) {
			System.out.println("Enter the String only divisible two  : ");
			name = user.next();
			if (name.length() % 2 == 0)
				break;
		}
		length = name.length();
		int halfLength = length / 2;
		for (i = 0; i <= halfLength; i++) {// first half triangle length
			for (j = halfLength; j >= 0; j--) {// j=name.length/2
				if (j <= i) {
					if (j == 0) {
						if (i == 0)
							System.out.print(name.charAt(0));
						System.out.print(" ");
						for (k = length - i; k <= length - 1; k++)
							System.out.print(name.charAt(k));
					} else
						System.out.print(name.charAt(i - j));
				} else
					System.out.print(" ");
			}
			System.out.println();

		}
		for (i = halfLength - 1; i >= 0; i--) {
			for (j = halfLength; j >= 0; j--) {
				if (i >= j) {
					if (j != 0)
						System.out.print(name.charAt(i - j));
					else {
						if (j == i)
							System.out.print(name.charAt(0));
						System.out.print(" ");
						for (k = length - i; k <= length - 1; k++)
							System.out.print(name.charAt(k));
					}

				} else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}
