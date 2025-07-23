import java.util.*;
import java.io.*;

class Main {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int V = sc.nextInt();

		int day = 1;

		double x = 1.0 * (V - A) / (A - B);
		int y = (int) x;
		day += x == y ? y : y + 1;
		System.out.println(day);
	}
}