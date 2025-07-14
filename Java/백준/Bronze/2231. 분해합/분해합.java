import java.io.IOException;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int l = String.valueOf(N).length();
        int a = 0;
        for(int i = N-9*l; i<N; i++){
            int x = i;
            int s = x;
            while (x>0){
                s += x%10;
                x = x/10;
            }
            if (s==N){
                a = i;
                break;
            }
        }
        System.out.print(a);
    }
}