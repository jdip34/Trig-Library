package trigLib;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import org.junit.runner.manipulation.Filter;
import org.junit.runner.*;

public class Main {
	final static double Pi = 3.14159265358979323846264338327950288;

	public Main() {
		Result result = JUnitCore.runClasses(TestJunit.class);
		for (Failure failure : result.getFailures()) {
			System.out.println(failure.toString());
		}
		System.out.println("Result==" + result.wasSuccessful());
		System.out.println("Test Sin: "+ sin(Pi/2));
	}

	public static double sin(double x) {
		double y = x;
		for (int n = 0; n < x; n++) {

			y = (exp((-1), n)) / (factorial((2 * n) + 1)) * (exp(x, (2 * n) + 1));
		}

		return x;
	}

	public static double exp(double x, double y) {
		for (int i = 0; i < y; i++) {
			x = x * x;
		}
		return x;
	}

	public static double cos(double x) {

		return x;
	}

	public  static double tan(double x) {

		return x;
	}

	public static double cot(double x) {

		return x;
	}

	public static double csc(double x) {

		return x;
	}

	public static double sec(double x) {

		return x;
	}

	public static double factorial(double x) {
		double y = x;
		for (int i = 0; i < x; i++) {
			y= y-1;
			x=x*(y);
		}
		return x;
	}

	public static void main(String[] args) {
		Main b = new Main();
	};
}