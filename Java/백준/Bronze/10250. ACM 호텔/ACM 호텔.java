import java.io.IOException;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for (int i=0; i<T; i++){
            int h = in.nextInt();
            int w = in.nextInt();
            int n = in.nextInt();

            int a = (n-1)%h+1;
            int b = (n-1)/h+1;

            System.out.printf("%d%02d%n", a, b);
        }
    }
}