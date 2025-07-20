import java.io.IOException;
import java.util.*;

class Main {
    public static int gcd(int a, int b){
        while (b > 0){
            int temp = a;
            a = b;
            b = temp%b;
        }
        return a;
    }
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int g = gcd(a,b);

        System.out.println(g);
        System.out.println(a*b/g);
    }
}

