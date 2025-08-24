import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		int[] arr = new int[10];

		while (N > 0) {
			arr[N % 10]++;
			N /= 10;
		}
		arr[6] = (arr[6] + arr[9] + 1) / 2;
		
		int max = 0;
		for (int i = 0; i < 9; i++) {
			max = Math.max(max, arr[i]);
		}
		
		System.out.println(max);
	}
}
