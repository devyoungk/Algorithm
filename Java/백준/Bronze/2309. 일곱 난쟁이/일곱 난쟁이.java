import java.util.*;
import java.io.*;

class Main {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int[] A = new int[9];
		int sum = 0;
		for (int i = 0; i < 9; i++) {
			A[i] = sc.nextInt();
			sum += A[i];
		}
		Arrays.sort(A);
		for (int i = 0; i < 9; i++) {
			for (int j = i + 1; j < 9; j++) {
				if (A[i] + A[j] == sum - 100) {
					for (int k = 0; k < 9; k++) {
						if (k == i || k == j) {
							continue;
						}
						System.out.println(A[k]);
					}
					return;
				}
			}
		}
	}
}