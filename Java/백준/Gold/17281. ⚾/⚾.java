import java.util.*;

public class Main {
	static int MAXSCORE, N;
	static int[] order = new int[10]; // i번 타자 -> order[i]번 선수
	static boolean[] visited = new boolean[10]; // i번 선수 확인 여부
	static int[][] hit;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MAXSCORE = 0;

		N = sc.nextInt();
//		visited[1] = true;
		
		hit = new int[N+1][10]; // (i+1)이닝 -> (j+1)번 선수 결과
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= 9; j++) {
				hit[i][j] = sc.nextInt();
			}
		}
		
		sol(1);
		
		System.out.println(MAXSCORE);
	}

	static int getScore() {
		int totalScore = 0;
		int idx = 1; // 1번타자부터
		for (int i = 1; i <= N; i++) { // 1이닝부터
			int score = 0; // 점수
			int out = 0; // 아웃카운트
			Queue<Integer> base = new ArrayDeque<>(); // 현재 베이스 상태
			while (out < 3) { // 3아웃시 종료
				int n = hit[i][order[idx]]; // 현재 선수 타격 결과
				if (n == 0) { // 아웃
					out++;
				} else if (n == 4) { // 홈런
					score += base.size() + 1; // 현재 베이스에 있던 선수 + 홈런 친 선수
					base.clear(); // 베이스 비우기
				} else {
					int L = base.size();
					for (int j = 0; j < L; j++) { // 주자 수만큼 반복 
						int x = base.poll(); // 가장 먼저 나간 주자 제거
						if (x + n >= 4) { // 타격에 따라 이동 한 값이 4 이상이면 득점
							score++; 
						} else { // 홈까지 못갔으면 현재 위치 큐에 저장
							base.offer(x + n);
						}
					}
					base.offer(n); // 타격 결과 저장
				}
				idx = idx + 1; // 다음 선수 차례
				if (idx == 10) { // 10번타자는 없어
					idx = 1;
				}
			}
			
			totalScore += score;
		}
		return totalScore;
	}
	
	static void sol(int d) { // d번 타자 배치
		if (d == 4) { // 4번 타자는
			order[4] = 1; // 1번 선수로 고정
			sol(5); // 5번 타자 배치하자
		}
		if (d > 9) { // 9명 타순 배치 완료
			MAXSCORE = Math.max(MAXSCORE, getScore()); // 점수 계산 후 최대값 저장
			return;
		}
		
		for (int i = 2; i <= 9; i++) { // 2번 선수부터 배치
			if (!visited[i] ) { // 아직 배치 안한 선수만
				visited[i] = true; // 확인 체크
				order[d] = i; // d번 타자는 i번 선수
				sol(d+1); // d+1번 타자 배치하자
				visited[i] = false; // 배치 취소하고 다른 경우 확인하자
			}
		}
	}
}
