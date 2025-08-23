import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] T = new int[N + 2];
		int[] P = new int[N + 2];

		for (int i = 1; i <= N; i++) {
			T[i] = sc.nextInt();
			P[i] = sc.nextInt();
		}

		int[] DP = new int[N + 2]; // i번째 날부터 시작하면 받을 수 있는 금액, 다음 날과 비교할 거라 N+2로 크기 설정(다른 배열도 같은 이유)

		for (int i = N; i > 0; i--) {
			if (i + T[i] - 1 > N) { // 상담이 N일 넘어가는 경우 -> 상담 진행 불가 -> 다음 날 부터 하는 금액과 같음
				DP[i] = DP[i + 1];
			} else {
				// 1) i일에 상담을 안하는 경우 -> 다음 날부터 하는 금액
				// 2) i일에 상담을 하는 경우 -> i일에 받는 금액(P[i])에 T[i] 이후에 시작하면 얻는 금액(DP[i + T[i]])의 합
				DP[i] = Math.max(DP[i + 1], DP[i + T[i]] + P[i]); // 두 경우 중 큰 값 찾기
			}
		}
		System.out.println(DP[1]); // 1일부터 시작하는 경우의 금액 출력
	}
}