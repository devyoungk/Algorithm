import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        Deque<int[]> stack = new ArrayDeque<>();

        for (int i = 1; i <= N; i++) {
            int x = Integer.parseInt(st.nextToken());

            while (!stack.isEmpty() && stack.peek()[0] <= x) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                sb.append("0 ");
            } else {
                sb.append(stack.peek()[1]).append(" ");
            }
            stack.push(new int[]{x, i});
        }

        System.out.println(sb.toString());
    }
}
