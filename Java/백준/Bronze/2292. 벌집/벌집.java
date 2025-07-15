import java.io.IOException;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int a = 1;
        N -= 1;
        int x = 6;
        while (N>0){
            N -= x;
            x += 6;
            a += 1;
        }
        System.out.print(a);
    }
}