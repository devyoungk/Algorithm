import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String S = br.readLine();
		int L = S.length();

		Deque<Character> stack = new ArrayDeque<>();

		int cnt = 0;

		char b = ' ';
		for (int i = 0; i < L; i++) {
			char c = S.charAt(i);
			if (c == '(') {
				stack.push(c);
			} else {
				stack.pop();
				if (b == '(') {
					cnt += stack.size();
				} else {
					cnt++;
				}
			}
			b = c;
		}
		System.out.println(cnt);
	}
}
