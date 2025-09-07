import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		Queue<Integer> Q = new ArrayDeque<>();
		
		for (int i = 1; i <= N; i++) {
			Q.offer(i);
		}
		
		for (int i = 0; i < N - 1; i++) {
			Q.poll();
			Q.offer(Q.poll());
		}
		System.out.println(Q.peek());
	}
}