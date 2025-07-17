import java.io.IOException;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        String s = in.next();
        int a = 0;
        for (int i=0; i<N; i++){
            int c = s.charAt(i) - 96;
            a += c*Math.pow(31,i);
        }
        System.out.println(a);
    }
}