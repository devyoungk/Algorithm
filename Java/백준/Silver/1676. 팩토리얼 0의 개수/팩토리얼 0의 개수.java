import java.io.IOException;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int cnt = 0;
        int x = 5;
        while (N >= x){
            cnt += N/x;
            x *= 5;
        }
        System.out.println(cnt);
    }
}