package trigLib;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import org.junit.runner.manipulation.Filter;
import org.junit.runner.*;

public class Main {
	final static double Pi = 3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679821480865132823066470938446095505822317253594081284811174502841027019385211055596446229489549303819644288;

	public Main() {
		Result result = JUnitCore.runClasses(TestJunit.class);
		for (Failure failure : result.getFailures()) {
			System.out.println(failure.toString());
		}
		double input = (Pi) / 2;

		System.out.println("Test Sin: " + sin(input));
		System.out.println("Test Cos: " + cos(input));
		System.out.println("Test Tan: " + tan(input));
		System.out.println("Test Csc: " + csc(input));
		System.out.println("Test Sec: " + sec(input));
		System.out.println("Test Cot: " + cot(input));
		System.out.println("Test arcsin: " + arcsin(sin(input)));
		System.out.println("Result==" + result.wasSuccessful());
	}

	public static double sin(double x) {
		boolean quadrant = false;
		if (x > Pi) {
			x = (x - Pi);
			quadrant = true;
		}
		if (x > Pi / 2) {
			x = Pi - x;
			//quadrant = true;
		}
		if(x==((3*Pi) / 2)||x==((Pi) / 2)) {
			quadrant=false;
		}

		for (int n = 1; n <= 40; n++) {
			if (n % 2 == 0) {
				x = x - ((exp((-1), n)) / (factorial((2 * n) + 1)) * (exp(x, (2 * n) + 1)));
				// System.out.println("Test " + n + ": " + x);
			} else if (n % 2 == 1) {
				x = x + ((exp((-1), n)) / (factorial((2 * n) + 1)) * (exp(x, (2 * n) + 1)));
				// System.out.println("Test " + n + ": " + x);
			}
		}
		if (quadrant) {
			x = -x;
		}
		return x;
	}

	public static double cos(double x) {
		boolean quadrant = false;
		boolean count = false;
		if (x > (3 * Pi) / 2) {

		//	System.out.println("quad4");
			x = x - Pi;
			quadrant = false;
			count = true;

		}
		if (x > Pi && x < (3 * Pi) / 2) {

			//System.out.println("quad3");
			x = (x - Pi);
			if (!count) {
				quadrant = true;
				count = true;
			}
		}
		if (x > (Pi / 2) && x < Pi) {

		//	System.out.println("quad2");
			x = Pi - x;
			if (!count) {
				quadrant = true;
				count = true;
			}

		}

		for (int n = 1; n <= 40; n++) {
			if (n == 1) {
				x = 1 + ((exp((-1), n)) / (factorial((2 * n))) * (exp(x, (2 * n))));
				// System.out.println("Test " + n + ": " + x);
			} else if (n % 2 == 0 && n != 1) {
				x = x + ((exp((-1), n)) / (factorial((2 * n))) * (exp(x, (2 * n))));
				// System.out.println("Test " + n + ": " + x);
			} else if (n % 2 == 1 && n != 1) {
				x = x - ((exp((-1), n)) / (factorial((2 * n))) * (exp(x, (2 * n))));
				// System.out.println("Test " + n + ": " + x);
			}
		}
		if (quadrant) {
			x = -x;
		}
		return x;
	}

	public static double tan(double x) {
		x = sin(x) / cos(x);
		return x;
	}

	public static double cot(double x) {

		x = cos(x) / sin(x);
		return x;
	}

	public static double csc(double x) {

		x = 1 / sin(x);
		return x;
	}

	public static double sec(double x) {

		x = 1 / cos(x);
		return x;
	}

	public static double arcsin(double x) {
		for (int n = 1; n <= 40; n++) {
			if (n % 2 == 0) {
				x = x - ((factorial(2 * n)) / ((exp(4, n) * (exp(factorial(n), 2))) * ((2 * n) + 1)))
						* (exp(x, (2 * n) + 1));
			} else if (n % 2 == 1) {
				x = x + ((factorial(2 * n)) / ((exp(4, n) * (exp(factorial(n), 2))) * ((2 * n) + 1)))
						* (exp(x, (2 * n) + 1));
			}
		}
		return x;
	}

	public static double arccos(double x) {

		return x;
	}

	public static double arctan(double x) {

		x = 1 / cos(x);
		return x;
	}

	public static double exp(double x, double y) {
		double z = x;
		for (int i = 1; i < y; i++) {
			x = x * z;
		}
		return x;
	}

	public static double factorial(double x) {
		double y = x;
		double step = x;
		for (int i = 0; i < step; i++) {
			y--;
			if (y > 0) {
				x = x * (y);
			}
		}
		return x;
	}

	public static void main(String[] args) {
		Main b = new Main();
	};
}