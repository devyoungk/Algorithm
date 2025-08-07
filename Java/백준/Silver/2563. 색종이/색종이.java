import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] A = new int[100][100];
		int N = sc.nextInt();
		
		int sum = 0;
		
		for (int i = 0; i < N; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			for (int j = 0; j < 10; j++) {
				for (int k = 0; k < 10; k++) {
					if (A[x+j][y+k] == 0) {
						A[x+j][y+k]=1;
						sum++;
					}
				}
			}
		}
		System.out.println(sum);
	}
}