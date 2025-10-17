import java.util.*;
import java.io.*;

public class Main {
	static LinkedList<Character>[] gear;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		gear = new LinkedList[4];

		for (int i = 0; i < 4; i++) {
		    gear[i] = new LinkedList<>();
		    String S = br.readLine();
		    for (int j = 0; j < 8; j++) {
		        gear[i].add(S.charAt(j));
		    }
		}
		
		int K = Integer.parseInt(br.readLine());
		for (int i = 0; i < K; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken()) - 1;
			int R = Integer.parseInt(st.nextToken());
			
			rotate(N, R);
		}
		
		System.out.println(getScore());
	}
	
	static void rotate(int N, int R) {
		int[] isRotate = new int[4];
		isRotate[N] = R;
		
		if (N == 0) {
			if (gear[0].get(2) != gear[1].get(6)) isRotate[1] = -isRotate[0];
			if (gear[1].get(2) != gear[2].get(6)) isRotate[2] = -isRotate[1];
			if (gear[2].get(2) != gear[3].get(6)) isRotate[3] = -isRotate[2];
		}
		else if (N == 1) {
			if (gear[0].get(2) != gear[1].get(6)) isRotate[0] = -isRotate[1];
			if (gear[1].get(2) != gear[2].get(6)) isRotate[2] = -isRotate[1];
			if (gear[2].get(2) != gear[3].get(6)) isRotate[3] = -isRotate[2];
		}
		else if (N == 2) {
			if (gear[1].get(2) != gear[2].get(6)) isRotate[1] = -isRotate[2];
			if (gear[2].get(2) != gear[3].get(6)) isRotate[3] = -isRotate[2];
			if (gear[0].get(2) != gear[1].get(6)) isRotate[0] = -isRotate[1];
		}
		else if (N == 3) {
			if (gear[2].get(2) != gear[3].get(6)) isRotate[2] = -isRotate[3];
			if (gear[1].get(2) != gear[2].get(6)) isRotate[1] = -isRotate[2];
			if (gear[0].get(2) != gear[1].get(6)) isRotate[0] = -isRotate[1];
		}
		
		for (int i = 0; i < 4; i++) {
			if (isRotate[i] == 1) {
				gear[i].addFirst(gear[i].removeLast());
			}
			else if (isRotate[i] == -1) {
				gear[i].addLast(gear[i].removeFirst());
			}
		}
	}
	
	static int getScore() {
		int score = 0;
		for (int i = 0; i < 4; i++) {
			int X = gear[i].getFirst() - '0';
			score += X * Math.pow(2, i);
		}
		return score;
	}
}
