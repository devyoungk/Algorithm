import java.io.IOException;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int M = 0;
        int S = 0;
        for (int i=0; i<N; i++){
            int x = in.nextInt();
            S += x;
            M = x > M ? x : M;
        }
        System.out.println(100.0*S/(N*M));
    }
}