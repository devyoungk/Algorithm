import java.util.*;
import java.io.*;

class Main {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		System.out.println(fac(N)/(fac(K)*fac(N-K)));
	}
	public static int fac(int n) {
		while (n>1) {
			return n*fac(n-1);
		}
		return 1;
	}
}