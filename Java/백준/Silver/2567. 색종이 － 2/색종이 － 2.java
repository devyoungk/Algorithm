import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] A = new int[102][102];
		int N = sc.nextInt();

		int sum = 0;

		for (int i = 0; i < N; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();

			for (int r = y + 1; r <= y + 10; r++) {
                for (int c = x + 1; c <= x + 10; c++) {
                    A[r][c] = 1;
                }
            }
		}

		for (int i = 1; i <= 101; i++) {
			for (int j = 1; j <= 101; j++) {
				if (A[i][j] != A[i - 1][j]) {
					sum++;
				}
				if (A[i][j] != A[i][j - 1]) {
					sum++;
				}
			}
		}
		System.out.println(sum);
	}
}