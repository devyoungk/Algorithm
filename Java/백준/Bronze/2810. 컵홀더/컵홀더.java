import java.io.IOException;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();

        S = S.replace("LL", "S");
        System.out.println(Math.min(N,S.length()+1));
    }
}