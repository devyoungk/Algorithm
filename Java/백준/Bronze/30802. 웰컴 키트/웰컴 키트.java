import java.io.IOException;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] S = new int[6];
        for(int i = 0; i < 6; i++) {
			S[i] = in.nextInt();
		}
        int T = in.nextInt();
        int P = in.nextInt();

        int A = 0;
        for(int i = 0; i < 6; i++) {
			A += S[i]/T;
			if(S[i]%T != 0) {
				A++;
			}
		}
        System.out.println(A);
        System.out.print(N/P+" "+N%P);
    }
}