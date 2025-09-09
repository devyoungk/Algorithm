import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String S = br.readLine();
		int L = S.length();

		Deque<Character> stack = new ArrayDeque<>();

        int ans = 0;
        int tmp = 1; // 누적 곱
        char b = ' '; // 직전 원소
		for (int i = 0; i < L; i++) {
            char c = S.charAt(i);
            if (stack.isEmpty() && (c == ')' || c == ']')) {
                System.out.println(0);
                return;
            }
            if (c == '(') {
                stack.push(c);
                tmp *= 2;
            }
            else if (c == ')'){
                if (stack.isEmpty() || stack.peek() != '('){
                    System.out.println(0);
                    return;
                }
                if (b == '('){
                    ans += tmp;
                }
                stack.pop();
                tmp /= 2;
            }
            else if (c == '[') {
                stack.push(c);
                tmp *= 3;
            }
            else if (c == ']'){
                if (stack.isEmpty() || stack.peek() != '['){
                    System.out.println(0);
                    return;
                }
                if (b == '['){
                    ans += tmp;
                }
                stack.pop();
                tmp /= 3;
            }
            b = c; // 직전 원소 갱신
		}
        if (stack.isEmpty()){
            System.out.println(ans);
        } else {
            System.out.println(0);
        }
	}
}