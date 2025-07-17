import java.io.IOException;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        String s = in.next();
        long a = 0;
        long r = 1;
        int mod = 1234567891;

        for (int i = 0; i < N; i++) {
            int c = s.charAt(i) - 'a' + 1;
            a = (a + c * r) % mod;
            r = (r * 31) % mod;
        }
        System.out.println(a);
    }
}