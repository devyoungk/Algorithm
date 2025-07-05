import java.io.IOException;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int h = in.nextInt();
        int m = in.nextInt();
        m -= 45;
        if (m<0){
            m += 60;
            h -= 1;
        }
        if (h<0){
            h += 24;
        }
        System.out.printf("%d %d", h, m);
    }
}