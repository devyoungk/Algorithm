import java.util.*;

public class Main {
	static int N, M;
	static Stack<Integer> S;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		S = new Stack<>();
		
		backtracking();
	}
	
	static void backtracking() {
		if (S.size() == M) {
			for (int x : S) {
				System.out.print(x + " ");
			}
			System.out.println();
			return;
		}
		
		for (int i = 1; i <= N; i++) {
			if (!S.contains(i)) {
				S.push(i);
				backtracking();
				S.pop();
			}
		}
	}
}