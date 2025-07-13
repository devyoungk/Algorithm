import java.io.IOException;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int cnt = 0;
        for (int i=0; i<N; i++){
            int x = in.nextInt();
            if (x==1){
                continue;
            }
            boolean isPrime = true;
            for (int j = 2; j <= Math.sqrt(x); j++) {
                if (x % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                cnt++;
            }
        }
        System.out.print(cnt);
    }
}