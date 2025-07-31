import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        long[] A = new long[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextLong();
        }
        long B = sc.nextLong();
        long C = sc.nextLong();

        long answer = N;

        for (int i = 0; i < N; i++) {
            A[i] = Math.max(A[i] - B, 0);
            if (A[i] > 0) {
                answer += (A[i] + C - 1) / C;
            }
        }

        System.out.println(answer);
    }
}
