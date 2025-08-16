import java.io.IOException;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int M = sc.nextInt();
        long[] A = new long[N];

        for (int i = 0; i < N; i++){
            String G = sc.next();
            String S = sc.next();
            long x = 0;
            for (int j = 0; j < M; j++){
                char c = S.charAt(M-1-j);
                if (c == 'Y'){
                    x += 1L << j;
                }
            }
            A[i] = x;
        }

        int max = 0;
        int ans = 0;

        for (int i = 0; i < 1 << N; i++){
            long x = 0;
            for(int j = 0; j < N; j++){
                if ((i & (1 << j)) > 0){
                    x = x | A[j];
                }
            }
            int n = Long.bitCount(x);
            if (n > max){
                max = n;
                ans = Integer.bitCount(i);
            } else if (n == max){
                ans = Math.min(ans, Integer.bitCount(i));
            }
        }
        if (max == 0) ans = -1;
        System.out.println(ans);
    }
}