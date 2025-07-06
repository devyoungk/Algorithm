import java.io.IOException;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int cnt = 0;
        while (in.hasNext()){
            String S = in.next();
            cnt += 1;
        }

        System.out.print(cnt);
    }
}